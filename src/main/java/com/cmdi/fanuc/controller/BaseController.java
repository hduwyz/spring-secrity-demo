package com.cmdi.fanuc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.service.IBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


public class BaseController {

    @Autowired
    private IBaseUserService baseUserService;


    /**
     * 获取当前用户
     * @return
     */
    protected BaseUser getCurrentUser() {
        //获取当前用户
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();

        //查询当前用户
        BaseUser baseUser = baseUserService.findByUsername(userDetails.getUsername());
        if (baseUser == null)
            throw new RuntimeException("用户不存在: " + userDetails.getUsername());

        return baseUser;
    }

}
