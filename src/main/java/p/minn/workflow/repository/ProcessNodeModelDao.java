package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.privilege.entity.IdEntity;
import p.minn.privilege.repository.BaseDao;
import p.minn.workflow.entity.ProcessNodeModel;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessNodeModelDao extends BaseDao<ProcessNodeModel,IdEntity>{

  public Integer checkCode(@Param("code") String code);
  
  public List<Map<String, Object>> queryTree(@Param("lang") String lang, @Param("condition")Map<String, Object> condition);

  public void deleteByPnId(@Param("pnId")Integer pnId);

  public Map<String,Object> getModelByPnId(@Param("pnId") String pdId);
}