package com.goat.rbac.system.controller;


import com.goat.rbac.system.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class UserController {

//	@Autowired
//	private UserService userService;

	@RequestMapping("user")
	public String index(Model model) {
        User user = new User();
        user.setCrateTime(new Date());
        user.setEmail("6427445151@qq.com");
        user.setUsername("山羊来了");
        user.setAvatar("default.jpg");
        user.setTheme("indigo");
		model.addAttribute("user", user);
		return "system/user/user";
	}

}
