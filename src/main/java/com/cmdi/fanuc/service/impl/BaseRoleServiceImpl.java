package com.cmdi.fanuc.service.impl;

import com.cmdi.fanuc.mapper.BaseRoleMapper;
import com.cmdi.fanuc.mapper.BaseRoleMenuMapper;
import com.cmdi.fanuc.mapper.model.BaseRole;
import com.cmdi.fanuc.service.IBaseRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
@Service
public class BaseRoleServiceImpl extends ServiceImpl<BaseRoleMapper, BaseRole> implements IBaseRoleService {
    @Autowired
    private BaseRoleMapper baseRoleMapper;
    /**
     * 根据菜单查询角色
     * @param menuId
     * @return
     */
    public List<BaseRole> selectRolesByMenuId(String menuId) {
        return baseRoleMapper.selectRolesByMenuId(menuId);
    }

    /**
     * 根据用户查询角色
     * @param userId
     * @return
     */
    public List<BaseRole> selectRolesByUserId(String userId) {
        return baseRoleMapper.selectRolesByUserId(userId);
    }

}
