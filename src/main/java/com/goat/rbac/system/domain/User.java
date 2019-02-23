package com.goat.rbac.system.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


@TableName("t_user")
public class User implements Serializable {

	private static final long serialVersionUID = -4852732617765810959L;

	public static final String STATUS_VALID = "1";
	public static final String STATUS_LOCK = "0";
	public static final String SEX_UNKNOW = "2";
	public static final String DEFAULT_THEME = "green";
	public static final String DEFAULT_AVATAR = "default.jpg";

    @TableId(value = "id",type = IdType.AUTO)
	private Long userId;
	private String username;
	private String password;
	private Long deptId;
    @TableField(exist = false)
//	@ExportConfig(value = "部门")
	private String deptName;
//	@ExportConfig(value = "邮箱")
	private String email;
//	@ExportConfig(value = "手机")
	private String mobile;
//	@ExportConfig(value = "状态", convert = "s:0=锁定,1=有效")
	private String status = STATUS_VALID;
//	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date crateTime;
	private Date modifyTime;
	private Date lastLoginTime;
//	@ExportConfig(value = "性别", convert = "s:0=男,1=女,2=保密")
	private String ssex;
	private String theme;
	private String avatar;
	private String description;
    @TableField(exist = false)//：表示该属性不为数据库表字段，但又是必须使用的。
	private String roleName;


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getCrateTime() {
		return crateTime;
	}

	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex == null ? null : ssex.trim();
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}