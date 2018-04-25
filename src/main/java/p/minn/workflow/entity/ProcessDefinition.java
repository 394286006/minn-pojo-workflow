package p.minn.workflow.entity;

import java.io.Serializable;

import p.minn.common.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessDefinition{

    private String id;  
  
	private String name;
	
	private String pId;
	
	private Integer pnId;
	
	private Integer sort;
	
	private String code;
	
	private Integer active;
	
	private Integer gid;
	
	private String ids;
	
	private String pIds;
	
	private String sorts;
	
	private String pnIds;
	
	private String gIds;
	
	private String codes;
	
	private String actives;
	
	private Integer createid;
	
	private String createtime;
    
    private Integer updateid;
    
    private String updatetime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPId() {
		return pId;
	}

	public void setPId(String pId) {
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

	public String getSorts() {
		return sorts;
	}

	public void setSorts(String sorts) {
		this.sorts = sorts;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

  public String getGIds() {
    return gIds;
  }

  public void setGIds(String gIds) {
    this.gIds = gIds;
  }


  public String getCodes() {
    return codes;
  }

  public void setCodes(String codes) {
    this.codes = codes;
  }

  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public String getActives() {
    return actives;
  }

  public void setActives(String actives) {
    this.actives = actives;
  }

  public Integer getGid() {
    return gid;
  }

  public void setGid(Integer gid) {
    this.gid = gid;
  }

  public Integer getPnId() {
    return pnId;
  }

  public void setPnId(Integer pnId) {
    this.pnId = pnId;
  }

  public String getPnIds() {
    return pnIds;
  }

  public void setPnIds(String pnIds) {
    this.pnIds = pnIds;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getCreateid() {
    return createid;
  }

  public void setCreateid(Integer createid) {
    this.createid = createid;
  }

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public Integer getUpdateid() {
    return updateid;
  }

  public void setUpdateid(Integer updateid) {
    this.updateid = updateid;
  }

  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }

	
}
