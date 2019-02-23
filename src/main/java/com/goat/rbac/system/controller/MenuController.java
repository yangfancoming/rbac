package com.goat.rbac.system.controller;


import com.goat.rbac.system.domain.Menu;
import com.goat.rbac.system.domain.ResponseBo;
import com.goat.rbac.system.domain.Tree;
import com.goat.rbac.system.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController  {
	@Autowired
	private MenuServiceImpl menuService;


    @RequestMapping("menu/getUserMenu")
    @ResponseBody
    public ResponseBo getUserMenu(String userName) {
        Tree<Menu> tree = this.menuService.getUserMenu(userName);
        return ResponseBo.ok(tree);
    }
}
