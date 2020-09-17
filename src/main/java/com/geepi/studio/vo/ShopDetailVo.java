package com.geepi.studio.vo;

import com.geepi.studio.entity.ShopDetail;
import lombok.Data;

import java.util.List;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/10
 * @since: JDK 1.8
 */
@Data
public class ShopDetailVo {
    private ShopDetail info;

    private List<GalleryVo> gallery;

    private SpecificationListVo specificationList;

    private List<ShopDetail> productList;
}
