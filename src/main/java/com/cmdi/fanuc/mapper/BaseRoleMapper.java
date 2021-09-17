package com.cmdi.fanuc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmdi.fanuc.mapper.model.BaseRole;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface BaseRoleMapper extends BaseMapper<BaseRole> {

    List<BaseRole> selectRolesByUserId(String userId);

    List<BaseRole> selectRolesByMenuId(String menuId);

}
