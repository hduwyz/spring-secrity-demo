package com.cmdi.fanuc.service.impl;

import com.cmdi.fanuc.mapper.BaseRoleMenuMapper;
import com.cmdi.fanuc.mapper.model.BaseRole;
import com.cmdi.fanuc.mapper.model.BaseRoleMenu;
import com.cmdi.fanuc.service.IBaseRoleMenuService;
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
public class BaseRoleMenuServiceImpl extends ServiceImpl<BaseRoleMenuMapper, BaseRoleMenu> implements IBaseRoleMenuService {

}
