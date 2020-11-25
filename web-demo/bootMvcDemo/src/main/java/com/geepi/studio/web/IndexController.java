package com.geepi.studio.web;

import com.geepi.studio.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public User hello() {
        User user = new User();
        user.setId(1);
        user.setMessage("1222333");
        return user;
    }
}
