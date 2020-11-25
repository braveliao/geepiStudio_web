package com.geepi.studio.web;

import com.geepi.studio.entity.CcCard;
import com.geepi.studio.entity.User;
import com.geepi.studio.service.ICcCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/11/25
 * @since: JDK 1.8
 */
@RestController
@RequestMapping("/api/")
public class IndexController {
    @Autowired
    private ICcCardService ccCardService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public List<CcCard> hello() {
        return ccCardService.list();
    }
}
