package com.geepi.studio.vo;

import com.geepi.studio.entity.Category;
import com.geepi.studio.entity.ShopDetail;
import lombok.Data;

import java.util.List;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/04
 * @since: JDK 1.8
 */
@Data
public class CategoryVo extends Category {
    private List<ShopDetail> goodsList;
}
