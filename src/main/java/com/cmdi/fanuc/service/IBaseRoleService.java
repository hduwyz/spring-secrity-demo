package com.cmdi.fanuc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmdi.fanuc.mapper.model.BaseRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface IBaseRoleService extends IService<BaseRole> {
    List<BaseRole> selectRolesByMenuId(String menuId);

    List<BaseRole> selectRolesByUserId(String userId);
}
