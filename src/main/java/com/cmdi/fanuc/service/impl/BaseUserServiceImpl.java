package com.cmdi.fanuc.service.impl;

import com.cmdi.fanuc.mapper.BaseUserMapper;
import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.service.IBaseUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
@Service
public class BaseUserServiceImpl extends ServiceImpl<BaseUserMapper, BaseUser> implements IBaseUserService {

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public BaseUser findByUsername(String username) {
        BaseUser user = baseUserMapper.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
