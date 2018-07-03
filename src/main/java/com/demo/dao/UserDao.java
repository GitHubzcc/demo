package com.demo.dao;


import com.demo.base.BaseDao;
import com.demo.entity.UserDO;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * </pre>
 * <small> 2018年3月23日 | Aron</small>
 */
public interface UserDao extends BaseDao<UserDO> {
	
	Long[] listAllDept();

}
