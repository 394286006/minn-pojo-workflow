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
  public List<Map<String, Object>> getNextNode(@Param("lpId")String lpId, @Param("pId")String pId,@Param("maxActive")Integer maxActive);
  public List<Map<String, Object>> getNextNodeStep( @Param("lpId")String lpId,@Param("pasId")Integer pasId,@Param("pdId")String pdId,@Param("maxActive")Integer maxActive);
  public List<Map<String, Object>> getNextStep(@Param("lpId")String lpId,@Param("pdId")String pdId,@Param("maxActive")Integer maxActive);
  public Integer getNodeCompleteStatus(@Param("lpId")String lpId,@Param("pdId")String pdId);
  public Integer getNodeStepCompleteStatus(@Param("pdId")String pdId,@Param("lpId")String lpId,@Param("pasId")Integer pasId,@Param("maxActive")Integer maxActive,@Param("step")String step);
  public List<Map<String, Object>> getPreNodeStep( @Param("lpId")String lpId,@Param("pasId")Integer pasId);
  public List<Map<String, Object>> getPreNode( @Param("pId")String pId,@Param("pdId")String pdId);
  public Integer getPreNodeCompleteStatus(@Param("lpId")String lpId,@Param("pdId")String pdId,@Param("pasId")Integer pasId);
}
