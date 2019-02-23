package com.goat.rbac.system.service;


import com.goat.rbac.dao.MenuMapper;
import com.goat.rbac.system.domain.Menu;
import com.goat.rbac.system.domain.Tree;
import com.goat.rbac.util.TreeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("menuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MenuServiceImpl  {

	@Autowired
	private MenuMapper menuMapper;

    public Tree<Menu> getUserMenu(String userName) {
        List<Tree<Menu>> trees = new ArrayList<>();
        List<Menu> menus = menuMapper.findUserMenus("MrBird");
        for (Menu menu : menus) {
            Tree<Menu> tree = new Tree<>();
            tree.setId(menu.getMenuId().toString());
            tree.setParentId(menu.getParentId().toString());
            tree.setText(menu.getMenuName());
            tree.setIcon(menu.getIcon());
            tree.setUrl(menu.getUrl());
            trees.add(tree);
        }
        Tree<Menu> t = TreeUtils.build(trees);
        return t;
    }

}
