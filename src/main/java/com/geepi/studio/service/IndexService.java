package com.geepi.studio.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.geepi.studio.entity.Category;
import com.geepi.studio.entity.ShopDetail;
import com.geepi.studio.vo.CategoryVo;
import com.geepi.studio.vo.GalleryVo;
import com.geepi.studio.vo.SpecificationListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/04
 * @since: JDK 1.8
 */
@Service
public class IndexService {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ShopDetailService shopDetailService;

    public List<CategoryVo> queryCategoryList() {
        QueryWrapper<Category> queryMapper = new QueryWrapper<>();
        List<Category> categoryList = categoryService.list(queryMapper);
        return categoryList.stream().map(element -> {
            CategoryVo categoryVo = new CategoryVo();
            BeanUtils.copyProperties(element, categoryVo);

            QueryWrapper<ShopDetail> shopQuery = new QueryWrapper<>();
            shopQuery.eq("category_id", element.getId());
            categoryVo.setGoodsList(shopDetailService.list(shopQuery));
            return categoryVo;
        }).collect(Collectors.toList());
    }

    public List<GalleryVo> queryGalleryList(ShopDetail shopDetail) {
        GalleryVo galleryVo = new GalleryVo();
        galleryVo.setId(1);
        galleryVo.setGoodsId(shopDetail.getId());
        galleryVo.setImgDesc(shopDetail.getGoodsDesc());
        galleryVo.setImgUrl(shopDetail.getListPicUrl());
        galleryVo.setSortOrder(1);
        return Arrays.asList(galleryVo);
    }

    public SpecificationListVo querySku(ShopDetail shopDetail) {
        SpecificationListVo specificationListVo = new SpecificationListVo();
        specificationListVo.setValueList(new ArrayList<>());
        return specificationListVo;
    }
}
