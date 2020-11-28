package com.geepi.studio.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 卡表
 * </p>
 *
 * @author geepi
 * @since 2020-11-26
 */
@TableName("cc_card")
public class CcCard extends Model<CcCard> {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
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



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CcCard{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
