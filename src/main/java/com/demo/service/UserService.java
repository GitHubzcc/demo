package com.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.demo.entity.UserDO;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <pre>
 * </pre>
 *
 * <small> 2018年3月23日 | Aron</small>
 */
@Service("sysUserService")
public interface UserService extends IService<UserDO> {

    boolean exit(Map<String, Object> params);

}
