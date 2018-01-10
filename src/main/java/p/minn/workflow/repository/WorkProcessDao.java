package p.minn.workflow.repository;

import org.springframework.dao.DataAccessException;

import p.minn.workflow.entity.ProcessBaseInfo;



/**
 * 
 * @author zhimin.chen/minn
 *
 */
public class WorkProcessDao {
	
	
	

	public void saveFile(String node_id,String pi_id,String fname,String ofname,String u_id,String type,String deptId){
		//this.execute("insert into m_project_file(id,filename,ofname,p_id,process_id,create_id,createdate,type,from_node,deptId) values((select isnull(max(id),0)+1 from m_project_file),'"+fname+"','"+ofname+"',"+pi_id+","+node_id+","+u_id+",getdate(),'"+type+"',(select max(tonode) from m_project_audit where status=1 and p_id="+pi_id+" and process_id="+node_id+" and tonode like '"+deptId+"%' and id=(select MAX(id) from m_project_audit where status=1 and p_id="+pi_id+" and process_id="+node_id+" and tonode like '"+deptId+"%')),"+deptId+")");
	}
	
	/**
	 * 根据id获得需要修改的对象
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public  ProcessBaseInfo edit(Integer id) {
		ProcessBaseInfo wFBaseInfo = null;
		try{
			
//			jdbcTemplate.query("", rse)
		}catch (DataAccessException e) {
			e.printStackTrace();
			//throw new DaoException(e.getMessage(),e); 
		}
		return wFBaseInfo;
	}
	
}
