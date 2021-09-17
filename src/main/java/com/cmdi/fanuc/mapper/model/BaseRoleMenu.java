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
public class BaseRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("ROLE_ID")
    private String roleId;

    @TableField("MENU_ID")
    private String menuId;


}
