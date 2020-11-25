package com.geepi.studio.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 卡表
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-25
 */
@Data
@TableName(value = "wl_oas.cc_card")
public class CcCard extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private String id;

    /**
     * 卡片类型，1：零佣金 2：组合卡；3：盯盘卡；4：持仓卡；5：邀请卡
     */
    private Integer type;

    /**
     * 卡名称
     */
    private String name;

    /**
     * 状态
     */
    private Long status;

    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除 (0保留、1删除)
     */
    private Integer del;


}
