package com.cmdi.fanuc.mapper.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangyz
 * @since 2021-09-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("USER_NAME")
    private String userName;

    @TableField("USER_PASSWORD")
    private String userPassword;

    @TableField("NIKE_NAME")
    private String nikeName;

    /**
     * 1 正常，2 禁用
     */
    @TableField("STATUS")
    private Integer status;


}
