package com.geepi.studio.web;

import com.geepi.studio.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * content:
 *
 * @author: liaoyong
 * @date: 2020/05/10
 * @since: JDK 1.8
 */
@RestController
public class AppController {
    @RequestMapping("/index")
    public String appInfo() {
        return "Hello";
    }
}
