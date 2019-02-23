package com.goat.rbac.system.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goat.rbac.system.domain.QueryRequest;
import com.goat.rbac.system.domain.User;
import com.goat.rbac.system.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserController extends BaseController {

	@Autowired
	private UserServiceImpl userService;

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

    @RequestMapping("user/list")
    @ResponseBody
    public Map<String, Object> userList(QueryRequest request, User user) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<User> list = userService.findUserWithDept(user);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}
