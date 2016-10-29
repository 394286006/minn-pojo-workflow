package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.privilege.entity.IdEntity;
import p.minn.privilege.entity.Account;
import p.minn.privilege.entity.AccountRole;
import p.minn.privilege.repository.BaseDao;
import p.minn.workflow.entity.ProcessAudit;
import p.minn.workflow.entity.ProcessDefinition;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessAuditDao extends BaseDao<ProcessAudit,IdEntity>{

  void deleteByLpId(@Param("id") Integer id);
  
  Integer getMaxActive(@Param("lpId") String lpId,@Param("pdId") String pdId);

}