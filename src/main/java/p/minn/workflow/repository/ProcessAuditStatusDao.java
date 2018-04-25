package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;
import p.minn.workflow.entity.ProcessAuditStatus;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessAuditStatusDao extends BaseDao<ProcessAuditStatus,IdEntity>{

  void deleteByLpId(@Param("id") Integer id);
  
  void updateMaxActive(@Param("lpId") String lpId,@Param("ids") String ids,@Param("maxActive")Integer maxActive);
  
  Integer getMaxActive(@Param("lpId") String lpId,@Param("pdId") String pdId,@Param("step")Integer step);

  void updateProcessStatus(@Param("lpId") String lpId,@Param("pdId") String pdId,@Param("processStatus")Integer processStatus);

  Integer getMaxStep(@Param("lpId") String lpId,@Param("pdId") String pdId,@Param("step")Integer step);

  ProcessAuditStatus getMaxAuditStatus(@Param("lpId") String lpId,@Param("pdId") String pdId,@Param("depId")Integer depId);
  ProcessAuditStatus getFirstAuditStatus(@Param("lpId") String lpId,@Param("pdId") String pdId);

  List<Integer> getNeedUpdateMaxActive(@Param("lpId")String lpId, @Param("pdId")String pdId);
  
  List<Integer> getNoNeedUpdateMaxActive(@Param("lpId")String lpId, @Param("pdId")String pdId, @Param("pasId")Integer pasId);
  
  void updateMaxActiveById(@Param("lpId")String lpId,@Param("pdId") String pdId,@Param("maxActive") Integer maxActive);
  
}