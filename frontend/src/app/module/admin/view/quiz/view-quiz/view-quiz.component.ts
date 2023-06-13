import { Component } from '@angular/core';
import {QuizDto} from "../../../../../controller/model/Quiz.model";
import {QuestionDto} from "../../../../../controller/model/Question.model";
import {ReponseDto} from "../../../../../controller/model/Reponse.model";
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-view-quiz',
  templateUrl: './view-quiz.component.html',
  styleUrls: ['./view-quiz.component.scss']
})
export class ViewQuizComponent {
  quiz: QuizDto;
  questions: Array<QuestionDto>;
  currentQuestionIndex: number = 0;
  reponses: Array<ReponseDto>;
  pointjuste: number=0;
  pointfaux: number=0;
  score: number=0;
  maxScore: number=0;
  selectedAnswers: boolean [][]= [];
  quizSubmitted: boolean=false;
  showCorrectedQuiz: boolean;
  selectedAnswer: any;
mistake: any;
translated: any;
  constructor(private http: HttpClient,private route: ActivatedRoute) { }

  ngOnInit(): void {
    const idQ = this.route.snapshot.paramMap.get('id');
    this.http.get<QuizDto>(`http://localhost:8036/api/admin/quiz/id/${idQ}`).subscribe((data) => {
      this.quiz = data;
      this.questions = data.questions;
      //this.reponses =  data.questions.reponses
      this.selectedAnswers = this.questions.map(() => []);
    });
  }









  submitQuizz() {
    let totalPointsJuste = 0;
    let totalPointsFaux = 0;
    this.maxScore = 0;

    for (const [i, question] of this.questions.entries()) {
      let pointsJuste = 0;
      let pointsFaux = 0;
      let isQuestionCorrect = false;

      if (question.typeDeQuestion.lib === 'multiselect') {
        if (Array.isArray(this.selectedAnswer) && this.selectedAnswer.length > i) {
        const selectedAnswer = this.selectedAnswer[i];
        const correctAnswer = question.reponses.find(answer => answer.etatReponse.libelle === 'correct');
         console.log('selectedAnswer.lib',selectedAnswer.lib);
         console.log('correctAnswer.lib',correctAnswer.lib);

        if (selectedAnswer && correctAnswer && selectedAnswer.lib === correctAnswer.lib) {
          pointsJuste += question.pointReponseJuste;
          console.log(pointsJuste);
          isQuestionCorrect = true;
        } else {
          pointsFaux += question.pointReponsefausse;
        }
      }} else if (question.typeDeQuestion.lib === 'checkbox') {
         isQuestionCorrect = true;
        for (const [j, reponse] of question.reponses.entries()) {
          if (reponse.etatReponse.libelle === 'correct' && this.selectedAnswers[i][j]) {
            pointsJuste += question.pointReponseJuste;
          } else if (reponse.etatReponse.libelle === 'incorrect' && this.selectedAnswers[i][j]) {
            pointsFaux += question.pointReponsefausse;
            console.log('correct',pointsJuste);

            isQuestionCorrect = false;
          }
        }
      }else if (question.typeDeQuestion.lib === 'PUT_WORDS_TO_GAP') {
        for (const [j, reponse] of question.reponses.entries()) {
          if (reponse.etatReponse.libelle === 'correct' && this.selectedAnswers[i][j]) {
            pointsJuste += question.pointReponseJuste;
          } else if (reponse.etatReponse.libelle === 'incorrect' && this.selectedAnswers[i][j]) {
            pointsFaux += question.pointReponsefausse;
            console.log('correct',pointsJuste);

            isQuestionCorrect = false;
          }
        }
      }
      else if (question.typeDeQuestion.lib === 'TRUE_OR_FALSE') {
        for (const [j, reponse] of question.reponses.entries()) {
          if (reponse.etatReponse.libelle === 'correct' && this.selectedAnswers[i][j]) {
            pointsJuste += question.pointReponseJuste;
          } else if (reponse.etatReponse.libelle === 'incorrect' && this.selectedAnswers[i][j]) {
            pointsFaux += question.pointReponsefausse;
            console.log('correct',pointsJuste);

            isQuestionCorrect = false;
          }
        }
      }
      else if (question.typeDeQuestion.lib === 'CORRECT_THE_MISTAKE') {
        const userAnswer = this.mistake;
        const correctAnswer = question.reponses[0].etatReponse.libelle;

        if (userAnswer && userAnswer.trim().toLowerCase() === correctAnswer.trim().toLowerCase()) {
          pointsJuste += question.pointReponseJuste;
          isQuestionCorrect = true;
        } else {
          pointsFaux += question.pointReponsefausse;
        }
      }else if (question.typeDeQuestion.lib === 'translate') {
        const userAnswer = this.translated;
        const correctAnswer = question.reponses[0];

        if (userAnswer && userAnswer.trim().toLowerCase() === correctAnswer) {
          pointsJuste += question.pointReponseJuste;
          isQuestionCorrect = true;
        } else {
          pointsFaux += question.pointReponsefausse;
        }
      }

      if (isQuestionCorrect) {
        totalPointsJuste += pointsJuste;
      } else {
        totalPointsFaux += pointsFaux;
      }

      this.maxScore += question.pointReponseJuste;
    }
    console.log(totalPointsJuste);

    this.score = totalPointsJuste + totalPointsFaux;
    this.quizSubmitted = true;

    if (this.currentQuestionIndex < this.questions.length - 1) {
      this.currentQuestionIndex++;
    }
  }


  /*submitQuizz() {
    let totalPointsJuste = 0;
    let totalPointsFaux = 0;
    this.maxScore = 0;

    // Initialize selectedAnswers array
   // const selectedAnswers = new Array(this.questions.length).fill([]);
    this.selectedAnswers = this.questions.map(() => []);

    for (const [i, question] of this.questions.entries()) {
      let pointsJuste = 0;
      let pointsFaux = 0;
      let isQuestionCorrect = false;

      if (question.typeDeQuestion.lib === 'multiselect') {
        const selectedAnswer = this.selectedAnswers[i];
        //const selectedAnswers = Array.from({ length: this.questions.length }, () => []);

        const correctAnswer = question.reponses.find(answer => answer.etatReponse.libelle === 'correct');
console.log('selectedAnswer.lib',selectedAnswer);
console.log('correctAnswer',correctAnswer);
console.log('selectedAnswer',selectedAnswer);
        /!*if (selectedAnswer   && correctAnswer && selectedAnswer.lib === correctAnswer.lib) {

          pointsJuste += question.pointReponseJuste;
          isQuestionCorrect = true;
        } else {
          pointsFaux += question.pointReponsefausse;
        }*!/
      } else if (question.typeDeQuestion.lib === 'checkbox') {
        const selectedAnswer = this.selectedAnswers[i];
        const correctAnswer = question.reponses.filter(answer => answer.etatReponse.libelle === 'correct');

        let isAnswerCorrect = true;
        //console.log('selectedAnswer.lib',selectedAnswer.lib);
        console.log('correctAnswer',correctAnswer);
        console.log('selectedAnswer',selectedAnswer);
        for (const [j, selected] of selectedAnswer.entries()) {
          if (selected && correctAnswer.some(correct => correct.lib === question.reponses[j].lib)) {
            pointsJuste += question.pointReponseJuste;
          } else if (selected) {
            pointsFaux += question.pointReponsefausse;
            isAnswerCorrect = false;
          }
        }

        if (isAnswerCorrect && selectedAnswer.length === correctAnswer.length) {
          isQuestionCorrect = true;
        }
      } else if (question.typeDeQuestion.lib === 'PUT_WORDS_TO_GAP' || question.typeDeQuestion.lib === 'TRUE_OR_FALSE' || question.typeDeQuestion.lib === 'CORRECT_THE_MISTAKE') {
      }

      if (isQuestionCorrect) {
        totalPointsJuste += pointsJuste;
      } else {
        totalPointsFaux += pointsFaux;
      }

      this.maxScore += question.pointReponseJuste;
    }

    this.score = totalPointsJuste - totalPointsFaux; // Subtract the points for incorrect responses
    this.quizSubmitted = true;

    if (this.currentQuestionIndex < this.questions.length - 1) {
      this.currentQuestionIndex++;
    }
  }*/



  onNextClick() {
    if (this.currentQuestionIndex < this.questions.length - 1) {
      this.currentQuestionIndex++;
    }
  }

  onPreviousClick() {
    if (this.currentQuestionIndex > 0) {
      this.currentQuestionIndex--;
    }
  }

}
