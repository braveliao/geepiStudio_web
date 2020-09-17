package com.geepi.studio.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * kol每日统计详细表
 * </p>
 *
 * @author geepi
 * @since 2020-07-28
 */
@TableName("wlo_kol_bill_day_detail")
public class KolBillDayDetail extends Model<KolBillDayDetail> {

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
     * 渠道名
     */
    private String channelName;

    /**
     * 注册人数
     */
    private Integer regNum;

    /**
     * 开户人数
     */
    private Integer openNum;

    /**
     * 入金人数
     */
    private Integer depositNum;

    /**
     * 有效开户人数
     */
    private Integer openAccountAwardNum;

    /**
     * 有效入金人数
     */
    private Integer depositAwardNum;

    /**
     * 月份
     */
    private String month;

    /**
     * 日期
     */
    private String dayTime;

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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getRegNum() {
        return regNum;
    }

    public void setRegNum(Integer regNum) {
        this.regNum = regNum;
    }

    public Integer getOpenNum() {
        return openNum;
    }

    public void setOpenNum(Integer openNum) {
        this.openNum = openNum;
    }

    public Integer getDepositNum() {
        return depositNum;
    }

    public void setDepositNum(Integer depositNum) {
        this.depositNum = depositNum;
    }

    public Integer getOpenAccountAwardNum() {
        return openAccountAwardNum;
    }

    public void setOpenAccountAwardNum(Integer openAccountAwardNum) {
        this.openAccountAwardNum = openAccountAwardNum;
    }

    public Integer getDepositAwardNum() {
        return depositAwardNum;
    }

    public void setDepositAwardNum(Integer depositAwardNum) {
        this.depositAwardNum = depositAwardNum;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
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
        return "KolBillDayDetail{" +
        "id=" + id +
        ", userId=" + userId +
        ", channelName=" + channelName +
        ", regNum=" + regNum +
        ", openNum=" + openNum +
        ", depositNum=" + depositNum +
        ", openAccountAwardNum=" + openAccountAwardNum +
        ", depositAwardNum=" + depositAwardNum +
        ", month=" + month +
        ", dayTime=" + dayTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
