package com.geepi.studio.vo;

import lombok.Data;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/10
 * @since: JDK 1.8
 */
@Data
public class GalleryVo {
    private Integer id;

    private Integer goodsId;

    private String imgUrl;

    private String imgDesc;

    private Integer sortOrder;

    private Integer isDelete;
}
