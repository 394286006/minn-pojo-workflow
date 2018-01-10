package p.minn.workflow.entity;


import p.minn.common.annotation.LogAnnotation;
import p.minn.privilege.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class LeaveProcess extends IdEntity{

  
  // @LogAnnotation(resourceKey="account_name")
    private String pdId;
   
    private String name;
	
	private String desc;
	
	private String startTime;
	
	private String endTime;
	
	private Integer maxActive;
	
	private Integer requestId;
	
	private Integer status;

  public String getPdId() {
    return pdId;
  }

  public void setPdId(String pdId) {
    this.pdId = pdId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Integer getMaxActive() {
    return maxActive;
  }

  public void setMaxActive(Integer maxActive) {
    this.maxActive = maxActive;
  }

  public Integer getRequestId() {
    return requestId;
  }

  public void setRequestId(Integer requestId) {
    this.requestId = requestId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  
}
