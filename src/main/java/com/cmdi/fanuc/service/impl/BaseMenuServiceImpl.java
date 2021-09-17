package com.cmdi.fanuc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmdi.fanuc.mapper.BaseMenuMapper;
import com.cmdi.fanuc.mapper.model.BaseMenu;
import com.cmdi.fanuc.service.IBaseMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
@Service
public class BaseMenuServiceImpl extends ServiceImpl<BaseMenuMapper, BaseMenu> implements IBaseMenuService {

    @Autowired
    private BaseMenuMapper baseMenuMapper;
    /**
     * 根据用户id查询所属菜单
     * @param userId
     * @return
     */
    public List<BaseMenu> selectRootMenusByUserId(String userId, String userName) {
        return baseMenuMapper.selectRootMenusByUserId(userId, userName);
    }

    /**
     * 根据url查询所属菜单
     * @param url
     * @return
     */
    public List<BaseMenu> selectMenusByUrl(String url) {
        QueryWrapper queryWrapper = new QueryWrapper();
        List<BaseMenu> menuList = baseMenuMapper.selectList(queryWrapper);
        List<BaseMenu> menus = new ArrayList<>();
        if (menuList != null) {
            menus.addAll(menuList.stream().filter(menu -> urlMatcher(menu.getMenuUrl(), url)).collect(Collectors.toList()));
        }
        return menus;
    }

    private boolean urlMatcher(String permstr, String url) {
        if (permstr == null) {
            return false;
        }
        PathMatcher matcher = new AntPathMatcher();
        return matcher.match(permstr, url);
    }
}
