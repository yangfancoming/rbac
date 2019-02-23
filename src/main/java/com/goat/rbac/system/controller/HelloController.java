package com.goat.rbac.system.controller;

import com.goat.rbac.system.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by 64274 on 2019/2/22.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/2/22---15:59
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String redirectIndex() {
        return "index";
    }

    //   http://localhost:9527/index
    @RequestMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setCrateTime(new Date());
        user.setEmail("6427445151@qq.com");
        user.setUsername("山羊来了");
        user.setAvatar("default.jpg");
        user.setTheme("indigo");
        model.addAttribute("user", user);
        return "index";
    }
}
