import {ChangeDetectorRef, Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {FormArray, FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {QuestionDto} from "../../../../../controller/model/Question.model";
import {TypeDeQuestionDto} from "../../../../../controller/model/TypeDeQuestion.model";
import {ReponseDto} from "../../../../../controller/model/Reponse.model";
import {DatePipe} from "@angular/common";
import {HttpClient} from "@angular/common/http";
import {QuizService} from "../../../../../controller/service/Quiz.service";
import {StringUtilService} from "../../../../../zynerator/util/StringUtil.service";
import {RoleService} from "../../../../../zynerator/security/Role.service";
import {ConfirmationService, MessageService} from "primeng/api";
import {ActivatedRoute, Router} from "@angular/router";
import {EtudiantService} from "../../../../../controller/service/Etudiant.service";
import {QuestionService} from "../../../../../controller/service/Question.service";
import {HomeWorkService} from "../../../../../controller/service/HomeWork.service";
import {QuizEtudiantService} from "../../../../../controller/service/QuizEtudiant.service";
import {SectionService} from "../../../../../controller/service/Section.service";
import {TypeDeQuestionService} from "../../../../../controller/service/TypeDeQuestion.service";
import {AbstractCreateController} from "../../../../../zynerator/controller/AbstractCreateController";
import {QuizDto} from "../../../../../controller/model/Quiz.model";
import {QuizCriteria} from "../../../../../controller/criteria/QuizCriteria.model";
import {EtatReponseDto} from "../../../../../controller/model/EtatReponse.model";
import Sortable from 'sortablejs';
import {CdkDragDrop} from "@angular/cdk/drag-drop";
import {SectionDto} from 'src/app/controller/model/Section.model';

@Component({
  selector: 'app-exam',
  templateUrl: './exam.component.html',
  styleUrls: ['./exam.component.scss']
})
export class ExamComponent  {

  types = [
    {label: 'Multiple Choice', value: 'checkbox' },
    {label: 'Short Answer', value: 'short_answer' },
    {label: 'Unique Choice', value: 'multiselect'},
    {label: 'TRANSLATE THE PHRASE', value: 'translate'},
    {label: 'CORRECT THE MISTAKE', value: 'CORRECT_THE_MISTAKE'},
  ];
  newQuestion: { question: string,mistake?: string, type: string, choices?: string[], answer?: string,pointFausse: number, pointJuste: number } = {
    pointFausse: 0,
    pointJuste: 0,
    mistake:'',
    question: '', type: '', choices: [], answer: '' };
  quizForm: FormGroup;
ref: any;
quizDateDebut:any;
quizDateFin: any;
quizSection: any;
  //questions: any[] = []; // declare questions property
  questions: { question: string, type: string, choices?: string[], answer?: string,pointFausse: number, pointJuste: number  }[] = [];
  isChecked: boolean[][] = [];
  etatReponse: EtatReponseDto;
  newQuizDto: QuizDto = new QuizDto();
  selectedChoiceIndex: number = -1;
  titre: string;
  private lastSavedId: number;
  sections: Array<SectionDto> = [];


  constructor(private cdr: ChangeDetectorRef,
              private datePipe: DatePipe,
              private httpClient: HttpClient,
              private quizService: QuizService,
              private stringUtilService: StringUtilService,
              private roleService: RoleService,
              private messageService: MessageService,
              private confirmationService: ConfirmationService,
              private router: Router,
              private etudiantService: EtudiantService,
              private questionService: QuestionService,
              private fb: FormBuilder,
              private homeWorkService: HomeWorkService,
              private quizEtudiantService: QuizEtudiantService,
              private sectionService: SectionService,
              private typeDeQuestionService: TypeDeQuestionService,
              private http: HttpClient, private route: ActivatedRoute
  ) {

    this.quizForm = this.fb.group({
      formTitle: ''
    });
  }
  @ViewChild('sortableChoices', { static: true }) sortableChoices!: ElementRef;

  ngOnInit(): void {
    this.sectionService.findAll().subscribe((data) => {
      this.sections = data;
    });
  }
  onAddQuestion() {
    this.questions.push(this.newQuestion);
    this.newQuestion = { question: '', type: '', choices: [], answer: '',pointFausse: 0,
      pointJuste: 0 };
  }

  onQuestionRemove(index: number) {
    this.questions.splice(index, 1);
  }

  addchoice(index: number) {
    console.log('dd');
    console.log('before:', this.questions[index]);

    //this.newQuestion.choices.push('');
    this.questions[index].choices.push('');
    //this.isChecked.push(false);
    this.isChecked[index] = this.questions[index].choices.map(() => false); // create a new isChecked array for the new choices
    console.log('after:', this.questions[index]);
    this.cdr.detectChanges();
  }




  removechoice(index: number, questionIndex: number) {
    const question = this.questions[questionIndex];
    if (question && Array.isArray(question.choices)) {
      question.choices.splice(index, 1);
      //this.isChecked.splice(index, 1);
      this.isChecked[questionIndex].splice(index, 1);
    }
    console.log('after:', this.questions[questionIndex]);

  }

  get section(): SectionDto {
    return this.sectionService.item;
}
set section(value: SectionDto) {
    this.sectionService.item = value;
}


  submitQuiz() {
    const quizDto = new QuizDto();
    quizDto.questions = [];

    const newQuestionDto = new QuestionDto();
    newQuestionDto.libelle = this.quizForm.get('formTitle').value;

    const questionsDto: QuestionDto[] = [];
    for (let i = 0; i < this.questions.length; i++) {
      const question = this.questions[i];
      const questionDto = new QuestionDto();
      questionDto.libelle = question.question;
      questionDto.typeDeQuestion = new TypeDeQuestionDto();
      questionDto.typeDeQuestion.lib = question.type;
      questionDto.reponses = [];

      if (this.newQuestion.type === 'short_answer') {
        const newResponseDto = new ReponseDto();
        newResponseDto.lib = this.newQuestion.answer;
        newQuestionDto.reponses.push(newResponseDto);
      }
      else if (this.newQuestion.type === 'paragraph') {
        const newResponseDto = new ReponseDto();
        newResponseDto.lib = this.newQuestion.answer;
        newQuestionDto.reponses.push(newResponseDto);
      }else if (this.newQuestion.type === 'TRUE_OR_FALSE') {
        for (let i = 0; i < this.newQuestion.choices.length; i++) {
          const newResponseDto = new ReponseDto();
          newResponseDto.lib = this.newQuestion.choices[i];
          newQuestionDto.reponses.push(newResponseDto);
        }
      }
      else {
        for (let i = 0; i < this.newQuestion.choices.length; i++) {
          const newResponseDto = new ReponseDto();
          newResponseDto.lib = this.newQuestion.choices[i];
          newQuestionDto.reponses.push(newResponseDto);
        }
      }

      questionsDto.push(questionDto);
    }

    quizDto.lib = this.quizForm.get('formTitle').value;
    quizDto.questions = questionsDto;

    this.httpClient.post<QuizDto>('http://localhost:8036/api/admin/quiz/', quizDto)
        .subscribe(response => {
          console.log('Quiz saved successfully:', response);
        }, error => {
          console.error('Error saving quiz:', error);
        });
    const quizId = quizDto.id;
    // this.viewQuiz(quizId);

  }

  saveQuiz() {
    const newQuizDto = new QuizDto();
    newQuizDto.questions = [];

    for (const question of this.questions) {
      const newQuestionDto = new QuestionDto();
      newQuestionDto.libelle = question.question;
      newQuestionDto.typeDeQuestion = new TypeDeQuestionDto();
      newQuestionDto.typeDeQuestion.lib = question.type;
      newQuestionDto.reponses = [];
      newQuestionDto.pointReponsefausse= question.pointFausse;
      newQuestionDto.pointReponseJuste= question.pointJuste;
      if (question.type === 'short_answer') {
        const newResponseDto = new ReponseDto();
        newResponseDto.lib = question.answer;
        newQuestionDto.reponses.push(newResponseDto);
      }
      else if (question.type === 'paragraph') {
        const newResponseDto = new ReponseDto();
        newResponseDto.lib = question.answer;
        newQuestionDto.reponses.push(newResponseDto);
      }else if (question.type === 'CORRECT_THE_MISTAKE') {
        const newResponseDto = new ReponseDto();
        const etatReponse = new EtatReponseDto();
        newResponseDto.lib = this.newQuestion.mistake;
        etatReponse.libelle=question.answer;
        newResponseDto.etatReponse=etatReponse;
        newQuestionDto.reponses.push(newResponseDto);
      } else if (question.type === 'translate') {
        const newResponseDto = new ReponseDto();
        const etatReponse = new EtatReponseDto();
        newResponseDto.lib = this.newQuestion.answer;
        newQuestionDto.reponses.push(newResponseDto);
      }else if (question.type === 'PUT_WORDS_TO_GAP') {
        this.ddddd(question, newQuestionDto);
      }
      else if(question.type ==='multiselect'){
        for (let i = 0; i < question.choices.length; i++) {
          const newResponseDto = new ReponseDto();
          const etatReponse = new EtatReponseDto();
          newResponseDto.lib = question.choices[i];
          if (this.selectedChoiceIndex === i) {
            etatReponse.libelle = 'correct';
          } else {
            etatReponse.libelle = 'incorrect';
          }
          newResponseDto.etatReponse = etatReponse;
          newQuestionDto.reponses.push(newResponseDto);
        }
      }else{
        this.ddddd(question, newQuestionDto);
      }



      newQuizDto.questions.push(newQuestionDto);

    }

    newQuizDto.lib = this.titre;
    newQuizDto.section=this.quizSection;
    newQuizDto.dateDebut=this.quizDateDebut;
    newQuizDto.dateFin=this.quizDateFin;
    console.log(this.titre);


    this.httpClient.post<QuizDto>('http://localhost:8036/api/admin/quiz/', newQuizDto)
        .subscribe(response => {
          console.log('Quiz saved successfully:', response);
          this.lastSavedId = response.id;
          console.log('Quiz Id', this.lastSavedId);
          console.log('Quiz hhh', this.lastSavedId);
          alert('Quiz saved successfully!');

        }, error => {
          console.error('Error saving quiz:', error);
        });


  }







  viewQuiz() {
    this.router.navigate(['/quiz/view-quiz', String(this.lastSavedId)]);
  }

  /*viewQuiz() {
    this.router.navigate(['/quiz/view-quiz']);
  }*/
  wrongSentence: string;
  mistake: string;
  correctAnswer: string;
  private ddddd(question: {
    question: string;
    type: string;
    choices?: string[];
    answer?: string;
    pointFausse: number;
    pointJuste: number
  }, newQuestionDto: QuestionDto) {
    for (let i = 0; i < question.choices.length; i++) {
      const newResponseDto = new ReponseDto();
      const etatReponse = new EtatReponseDto();
      newResponseDto.lib = question.choices[i];
      if (this.isChecked[this.questions.indexOf(question)][i]) {
        etatReponse.libelle = 'correct';
      } else {
        etatReponse.libelle = 'incorrect';
      }
      newResponseDto.etatReponse = etatReponse;
      newQuestionDto.reponses.push(newResponseDto);
    }
  }


  reorderChoices(event: CdkDragDrop<string[]>) {
    const currentIndex = event.currentIndex;
    const droppedIndex = event.previousIndex;

    const [removedChoice] = this.newQuestion.choices.splice(droppedIndex, 1);
    this.newQuestion.choices.splice(currentIndex, 0, removedChoice);
  }

}
