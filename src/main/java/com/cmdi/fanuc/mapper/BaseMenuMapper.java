package com.cmdi.fanuc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmdi.fanuc.mapper.model.BaseMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface BaseMenuMapper extends BaseMapper<BaseMenu> {

    List<BaseMenu> selectRootMenusByUserId(@Param("userId") String userId, @Param("userName")String userName);

}
