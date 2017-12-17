package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.privilege.entity.IdEntity;
import p.minn.privilege.entity.Account;
import p.minn.privilege.entity.AccountRole;
import p.minn.privilege.repository.BaseDao;
import p.minn.workflow.entity.ProcessDefinition;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessDefinitionDao extends BaseDao<ProcessDefinition,IdEntity>{

  public Integer checkCode(@Param("code") String code);

  public List<Map<String, Object>> queryTree(@Param("lang") String lang, @Param("condition")Map<String, Object> condition);
  
  public Map<String, Object> findByPId(@Param("lang") String lang,@Param("pid") String pid);
  
  public String getMaxId(@Param("pid")String pid);
  
  public ProcessDefinition findEntityById(String id);

  public void delete(@Param("id")String id);
  
  public void deleteByProcessId(@Param("processId")String processId);

  public List<ProcessDefinition> getPreNodes(@Param("pId")String pId, @Param("pasId")Integer pasId);
  
}