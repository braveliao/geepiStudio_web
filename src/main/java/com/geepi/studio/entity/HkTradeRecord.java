package com.geepi.studio.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 港股交易记录表
 * </p>
 *
 * @author geepi
 * @since 2020-07-22
 */
@TableName("wlo_hk_trade_record")
public class HkTradeRecord extends Model<HkTradeRecord> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 券商ID
     */
    private Integer brokerId;

    /**
     * 业务时间
     */
    private LocalDateTime bizTime;

    /**
     * 平台费用
     */
    private BigDecimal amount;

    /**
     * 交易次数
     */
    private Integer tradeCount;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public LocalDateTime getBizTime() {
        return bizTime;
    }

    public void setBizTime(LocalDateTime bizTime) {
        this.bizTime = bizTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
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
        return "HkTradeRecord{" +
        "id=" + id +
        ", userId=" + userId +
        ", brokerId=" + brokerId +
        ", bizTime=" + bizTime +
        ", amount=" + amount +
        ", tradeCount=" + tradeCount +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
