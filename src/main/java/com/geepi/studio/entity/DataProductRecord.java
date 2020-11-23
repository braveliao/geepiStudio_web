package com.geepi.studio.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 行情发放记录表
 * </p>
 *
 * @author geepi
 * @since 2020-06-23
 */
@TableName("wlo_data_product_record")
public class DataProductRecord extends Model<DataProductRecord> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 序列号
     */
    private String serialNo;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 状态 1 机会 2 已领取 5 失效
     */
    private Integer status;

    /**
     * 业务ID:1001 MKT2.0赠送； 1002 港股赠送
     */
    private Integer bizType;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 周期
     */
    private Integer cycle;

    /**
     * 备注
     */
    private String remark;

    /**
     * 机会发放时间
     */
    private LocalDateTime giftTime;

    /**
     * 机会领取时间
     */
    private LocalDateTime receiveTime;

    /**
     * 失效时间
     */
    private LocalDateTime expireTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getGiftTime() {
        return giftTime;
    }

    public void setGiftTime(LocalDateTime giftTime) {
        this.giftTime = giftTime;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
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
        return "DataProductRecord{" +
        "id=" + id +
        ", serialNo=" + serialNo +
        ", userId=" + userId +
        ", status=" + status +
        ", bizType=" + bizType +
        ", orderId=" + orderId +
        ", cycle=" + cycle +
        ", remark=" + remark +
        ", giftTime=" + giftTime +
        ", receiveTime=" + receiveTime +
        ", expireTime=" + expireTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
