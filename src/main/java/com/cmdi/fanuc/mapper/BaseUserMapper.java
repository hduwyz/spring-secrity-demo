package com.cmdi.fanuc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.mapper.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
public interface BaseUserMapper extends BaseMapper<BaseUser> {

    @Select("select * from base_user where USER_NAME = #{username}")
    BaseUser findByUsername(@Param("username") String username);

}
