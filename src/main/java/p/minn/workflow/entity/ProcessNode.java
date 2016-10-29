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
public class ProcessNode extends IdEntity{

  private String name;
  
  private Integer pId;
  
  private String ids;
  
  private String pIds;
  
  private String url;
  
  private String code;
  
  private Integer sort;
  
  

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public Integer getPId() {
      return pId;
  }



  public void setPId(Integer pId) {
      this.pId = pId;
  }

  public String getIds() {
      return ids;
  }

  public void setIds(String ids) {
      this.ids = ids;
  }

  public String getPIds() {
      return pIds;
  }

  public void setPIds(String ids) {
      pIds = ids;
  }

  public String getUrl() {
      return url;
  }

  public void setUrl(String url) {
      this.url = url;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }
  
}
