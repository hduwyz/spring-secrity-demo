package com.cmdi.fanuc.mapper;

import com.cmdi.fanuc.mapper.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author wangyz
 * @since 2021-09-14
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where username = #{username}")
    User findByUsername(@Param("username") String username);

}
