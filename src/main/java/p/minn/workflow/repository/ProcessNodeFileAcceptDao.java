package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;
import p.minn.workflow.entity.ProcessAudit;
import p.minn.workflow.entity.ProcessDefinition;
import p.minn.workflow.entity.ProcessNodeFileAccept;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessNodeFileAcceptDao extends BaseDao<ProcessNodeFileAccept,IdEntity>{

  public Integer checkCode(@Param("code") String code);
}