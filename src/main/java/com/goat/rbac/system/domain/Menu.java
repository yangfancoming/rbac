package com.goat.rbac.system.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("t_menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 7187628714679791771L;

	public static final String TYPE_MENU = "0";

	public static final String TYPE_BUTTON = "1";

    @TableId(value = "id",type = IdType.AUTO)
	private Long menuId;
	private Long parentId;
	private String menuName;
	private String url;
	private String perms;
	private String icon;
//	@ExportConfig(value = "类型", convert = "s:0=菜单,1=按钮")
	private String type;
	private Long orderNum;
//	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;
	private Date modifyTime;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName == null ? "" : menuName.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? "" : url.trim();
	}

	public String getPerms() {
		return perms;
	}

	public void setPerms(String perms) {
		this.perms = perms == null ? "" : perms.trim();
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? "" : icon.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? "" : type.trim();
	}

	public Long getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}