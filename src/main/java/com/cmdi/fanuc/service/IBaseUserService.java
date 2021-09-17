package com.cmdi.fanuc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.mapper.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface IBaseUserService extends IService<BaseUser> {
    BaseUser findByUsername(String username);

}
