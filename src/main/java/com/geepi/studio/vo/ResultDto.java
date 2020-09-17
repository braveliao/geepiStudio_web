package com.geepi.studio.vo;

import lombok.Data;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/04
 * @since: JDK 1.8
 */

@Data
public class ResultDto {
    private int errno = 0;
    private String msg;
    private Object data;
    private Integer totalCount;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
