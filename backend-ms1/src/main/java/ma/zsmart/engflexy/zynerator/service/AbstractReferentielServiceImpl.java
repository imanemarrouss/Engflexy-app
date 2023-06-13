package ma.zsmart.engflexy.zynerator.service;

import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;
import ma.zsmart.engflexy.zynerator.history.HistCriteria;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}