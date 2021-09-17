package com.cmdi.fanuc.controller;


import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.service.IBaseMenuService;
import com.cmdi.fanuc.service.IBaseRoleService;
import com.cmdi.fanuc.service.IBaseUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fp295 on 2018/4/7.
 */
@Controller
public class BaseUserController extends BaseController{

    @Autowired
    private IBaseRoleService baseRoleService;

    @Autowired
    protected IBaseMenuService baseMenuService;

    /**
     * 获取用户信息
     * @param request
     * @return
     */
    @RequestMapping("/index.ftl")
    public ModelAndView select(HttpServletRequest request){

        BaseUser baseUser = getCurrentUser();
        request.setAttribute("userInfo",baseUser);
        request.setAttribute("roleList",baseRoleService.selectRolesByUserId(baseUser.getId()));
        request.setAttribute("menuList", baseMenuService.selectRootMenusByUserId(baseUser.getId(), baseUser.getUserName()));
        return new ModelAndView("index");
    }

}
