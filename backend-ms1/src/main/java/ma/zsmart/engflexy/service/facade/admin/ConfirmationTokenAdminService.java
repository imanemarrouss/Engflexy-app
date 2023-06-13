package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.dao.criteria.core.ConfirmationTokenCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ConfirmationTokenAdminService extends  IService<ConfirmationToken,ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
