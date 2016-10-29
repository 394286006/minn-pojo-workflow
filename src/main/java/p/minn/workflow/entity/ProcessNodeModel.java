package p.minn.workflow.entity;

import java.io.Serializable;


import p.minn.privilege.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessNodeModel{

  private String id;
  
  private String pId;
  
  private String pIds;
  
  private String ids;
  
  private String types;
  
  private String type;
  
  private Integer pnId;  
  
  private Integer deptId;
  

  public String getPId() {
      return pId;
  }



  public void setPId(String pId) {
      this.pId = pId;
  }

  
  public String getPIds() {
      return pIds;
  }

  public void setPIds(String pids) {
      pIds = pids;
  }

  public String getIds() {
    return ids;
  }

  public void setIds(String ids) {
    this.ids = ids;
  }

  public String getTypes() {
    return types;
  }

  public void setTypes(String types) {
    this.types = types;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  public Integer getPnId() {
    return pnId;
  }



  public void setPnId(Integer pnId) {
    this.pnId = pnId;
  }



  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }



  public Integer getDeptId() {
    return deptId;
  }



  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

 
  
}
