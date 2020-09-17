package com.geepi.studio.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * branch邀请下载事件
 * </p>
 *
 * @author geepi
 * @since 2020-08-19
 */
@TableName("wlo_branch_invite_install")
public class BranchInviteInstall extends Model<BranchInviteInstall> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 点击ID
     */
    private String clickId;

    /**
     * 金额
     */
    private Integer userId;

    /**
     * 渠道source
     */
    private String source;

    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClickId() {
        return clickId;
    }

    public void setClickId(String clickId) {
        this.clickId = clickId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
        return "BranchInviteInstall{" +
        "id=" + id +
        ", clickId=" + clickId +
        ", userId=" + userId +
        ", source=" + source +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
