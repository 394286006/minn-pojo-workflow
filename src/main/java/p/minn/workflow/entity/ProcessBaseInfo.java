package p.minn.workflow.entity;


import p.minn.common.annotation.LogAnnotation;
import p.minn.common.entity.IdEntity;


/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
//@LogAnnotation
public class ProcessBaseInfo extends IdEntity{

  // @LogAnnotation(resourceKey="account_name")
   private String name;
	
	private Integer type;
	
	private Integer deptid;
	
	private String propertyStatus;
	
	private String place;
	
	private String floor;
	
	private String floorType;
	
	private String saleLevel;
	
	private Integer propertyLetterIntent;
	
	private Integer affiliateLetterIntent;
	
	private String pre_date;
	
	private String imageLevel;
	
	private String p_id;
	
	private String apply_name;
	
	
//	private Set<ProjectAuditStatus> auditStatus;
	
	
//	private Set<ProjectAudit> audits;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}


	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	
	
}
