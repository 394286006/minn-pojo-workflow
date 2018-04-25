package p.minn.workflow.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import p.minn.common.annotation.LogAnnotation;
import p.minn.common.baseDao.BaseDao;
import p.minn.common.entity.IdEntity;
import p.minn.workflow.entity.ProcessBaseInfo;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @omment 
 */
//@LogAnnotation(resourceKey="A000A000")
public interface ProcessBaseInfoDao extends BaseDao<ProcessBaseInfo,IdEntity>{

  public Integer checkCode(@Param("code") String code);
}