package com.geepi.studio.vo;

import com.geepi.studio.entity.Category;
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
public class IndexVo {
    private List<ChannelVo> channel;

    private List<ChannelVo> banner;

    private List<ChannelVo> notice;

    private List<CategoryVo> categoryList;
}
