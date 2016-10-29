package p.minn.workflow.repository;

import java.util.List;



import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface WorkFlowDao  {
	
  public List<Map<String, Object>> queryTree(@Param("lang") String lang, @Param("condition")Map<String, Object> condition);
  public List<Map<String, Object>> queryModelTree(@Param("lang") String lang, @Param("condition")Map<String, Object> condition);
  public List<Map<String, Object>> getNextStep(@Param("lpId")String lpId, @Param("pnId")String pnId,@Param("maxActive")Integer maxActive);
  public List<Map<String, Object>> getNextStep(@Param("lpId")String lpId,@Param("maxActive")Integer maxActive,@Param("fun")String fun);
  public Integer getNodeCompleteNum(@Param("lpId")String lpId,@Param("pdId")String pdId, @Param("pnId")String pnId);
  
}
