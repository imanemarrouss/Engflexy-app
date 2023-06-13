package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtudiantClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtudiantClassRoomHistorySpecification extends AbstractHistorySpecification<EtudiantClassRoomHistoryCriteria, EtudiantClassRoomHistory> {

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
