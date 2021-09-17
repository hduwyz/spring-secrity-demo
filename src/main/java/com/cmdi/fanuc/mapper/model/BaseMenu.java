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
public class BaseMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("MENU_URL")
    private String menuUrl;

    @TableField("MENU_SEQ")
    private String menuSeq;

    @TableField("MENU_PARENT_ID")
    private Integer menuParentId;

    @TableField("MENU_NAME")
    private String menuName;

    @TableField("MENU_ICON")
    private String menuIcon;

    @TableField("MENU_ORDER")
    private String menuOrder;

    /**
     * 1 是 0 否
     */
    @TableField("IS_LEAF")
    private String isLeaf;


}
