package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;
import p.minn.workflow.entity.ProcessModel;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessModelDao extends BaseDao<ProcessModel,IdEntity>{

  public void deleteByProcessId(@Param("processId")String processId);
  
  public void saveModel(ProcessModel model);
  
  public void updateModel(ProcessModel model);
	  
  public ProcessModel getModelByProcessId(@Param("processId") String processId);
}