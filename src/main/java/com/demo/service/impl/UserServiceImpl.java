package com.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.demo.dao.UserDao;
import com.demo.entity.UserDO;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

/**
 * <pre>
 * </pre>
 * 
 * <small> 2018年3月23日 | Aron</small>
 */
@Transactional
@Service("sysUserServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserDao, UserDO> implements UserService {

    @Override
    public boolean exit(Map<String, Object> params) {
        return retBool(baseMapper.selectByMap(params).size());
    }
}
