package p.minn.workflow.repository;

import java.util.List;



import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.privilege.entity.IdEntity;
import p.minn.privilege.repository.BaseDao;
import p.minn.workflow.entity.LeaveProcess;
import p.minn.workflow.entity.ProcessAudit;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface LeaveProcessDao extends BaseDao<LeaveProcess,IdEntity> {
	
 	
}
