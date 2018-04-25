package p.minn.workflow.entity;

import p.minn.common.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessNodeFile extends IdEntity{

	private Integer id;
	
	private String fromnode;
	
	private String tonode;
	
	//private Integer p_id;
	
	private Integer active_c;
	
	private Integer status;
	
	private Integer process_id;
	
	private ProcessAuditStatus projectAuditStatus;
	
	private ProcessBaseInfo projectInfo;
	

	public String getFromnode() {
		return fromnode;
	}

	public void setFromnode(String fromnode) {
		this.fromnode = fromnode;
	}

	public String getTonode() {
		return tonode;
	}

	public void setTonode(String tonode) {
		this.tonode = tonode;
	}


	/*public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
*/
	public Integer getProcess_id() {
		return process_id;
	}

	public void setProcess_id(Integer process_id) {
		this.process_id = process_id;
	}



	public ProcessAuditStatus getProjectAuditStatus() {
		return projectAuditStatus;
	}

	public void setProjectAuditStatus(ProcessAuditStatus projectAuditStatus) {
		this.projectAuditStatus = projectAuditStatus;
	}

	
	public ProcessBaseInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProcessBaseInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getActive_c() {
		return active_c;
	}

	public void setActive_c(Integer active_c) {
		this.active_c = active_c;
	}

	
}
