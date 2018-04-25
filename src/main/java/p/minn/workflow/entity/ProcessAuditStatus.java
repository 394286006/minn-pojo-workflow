package p.minn.workflow.entity;

import java.util.Set;

import p.minn.common.entity.IdEntity;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessAuditStatus extends IdEntity{

	
	private String audit_name;
	
	private String comment;
	
	private Integer auditId;
	
	private Integer auditDeptid;
	
	private String auditdate;
	
	private String step;
	
	private String pdId;
	
	private Integer processStatus;
	
	private Integer nodeStatus;
	
	private Integer status;
	
	private Integer maxActive;
	
	private Integer lpId;
	
	private Integer paId;


	public String getAudit_name() {
		return audit_name;
	}

	public void setAudit_name(String audit_name) {
		this.audit_name = audit_name;
	}

	
	

	public String getAuditdate() {
		return auditdate;
	}

	public void setAuditdate(String auditdate) {
		this.auditdate = auditdate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

  public Integer getAuditId() {
    return auditId;
  }

  public void setAuditId(Integer auditId) {
    this.auditId = auditId;
  }

  public Integer getAuditDeptid() {
    return auditDeptid;
  }

  public void setAuditDeptid(Integer auditDeptid) {
    this.auditDeptid = auditDeptid;
  }

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }


  public Integer getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(Integer processStatus) {
    this.processStatus = processStatus;
  }

  public Integer getMaxActive() {
    return maxActive;
  }

  public void setMaxActive(Integer maxActive) {
    this.maxActive = maxActive;
  }

  public Integer getLpId() {
    return lpId;
  }

  public void setLpId(Integer lpId) {
    this.lpId = lpId;
  }

  public Integer getPaId() {
    return paId;
  }

  public void setPaId(Integer paId) {
    this.paId = paId;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getPdId() {
    return pdId;
  }

  public void setPdId(String pdId) {
    this.pdId = pdId;
  }

  public Integer getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(Integer nodeStatus) {
    this.nodeStatus = nodeStatus;
  }

	
}
