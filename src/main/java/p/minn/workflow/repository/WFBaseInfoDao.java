package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.privilege.entity.IdEntity;
import p.minn.privilege.entity.Account;
import p.minn.privilege.entity.AccountRole;
import p.minn.privilege.repository.BaseDao;
import p.minn.workflow.entity.ProcessBaseInfo;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface WFBaseInfoDao extends BaseDao<ProcessBaseInfo,IdEntity>{

	public void delAccountRole(@Param("accountid") String accountid);

	@LogAnnotation(resourceKey="account_save_account_resource")
	public void saveAccountRole(@Param("accountRoles") List<AccountRole> accountRoles);

	public Account checkAccount(@Param("name") String name,@Param("pwd") String pwd);

	public Account findByLoginName(@Param("loginName") String loginName);

	public List<String> getAccountRoleList(@Param("id") Integer accountid);
	
	public List<String> getAccountRoleRealmList(@Param("accountid") Integer accountid);

	public Account getAccountById( @Param("account") Account account);
	
	public List<Map<String, Object>> getAccountRole(@Param("lang") String lang,
			@Param("condition")Map<String, String> condition);
	

}