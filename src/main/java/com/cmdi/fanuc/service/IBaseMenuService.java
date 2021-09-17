package com.cmdi.fanuc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmdi.fanuc.mapper.model.BaseMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface IBaseMenuService extends IService<BaseMenu> {

    List<BaseMenu> selectRootMenusByUserId(String userId, String userName);

    List<BaseMenu> selectMenusByUrl(String url);
}
