package p.minn.workflow.entity;

import p.minn.privilege.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessAudit extends IdEntity{

	private String fromnode;
	
	private String tonode;
	
	private Integer lpId;
	
	private Integer maxActive;
	
	private Integer status;
	
	private String pdId;
	
	private Integer pasId;

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

  public Integer getMaxActive() {
    return maxActive;
  }

  public void setMaxActive(Integer maxActive) {
    this.maxActive = maxActive;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getPasId() {
    return pasId;
  }

  public void setPasId(Integer pasId) {
    this.pasId = pasId;
  }

  public Integer getLpId() {
    return lpId;
  }

  public void setLpId(Integer lpId) {
    this.lpId = lpId;
  }

  public String getPdId() {
    return pdId;
  }

  public void setPdId(String pdId) {
    this.pdId = pdId;
  }
	

		
}
