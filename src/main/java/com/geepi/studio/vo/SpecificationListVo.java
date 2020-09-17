package com.geepi.studio.vo;

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
public class SpecificationListVo {
    private Integer specificationId;

    private String name;

    private List<SpecificationListVo> valueList;

//    {
//        "id": 7,
//            "goods_id": 1009024,
//            "specification_id": 1,
//            "value": "一根葱",
//            "pic_url": "",
//            "is_delete": 0,
//            "goods_number": 200
//    }
}
