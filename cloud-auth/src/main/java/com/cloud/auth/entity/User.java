package com.cloud.auth.entity;
import java.util.Date;
/**
 * Description: 用户实体类
 * FileName: User
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 16:34
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 16:34    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */
public class User {
    //用户Id
    private Long id;
    //用户姓名
    private String userName;
    //登录账号
    private String loginName;
    //登录密码
    private String loginPwd;
    //手机号码
    private String phone;
    //用户类型
    private String userType;
    //用户状态：1：启用;2：停用
    private String userStatus;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //机构编号(扩展用，后续支持代理商需要用到)
    private String orgNo;
    //md5加密的盐
    private String pwdSalt;

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getLoginName()
    {
        return loginName;
    }
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    public String getLoginPwd()
    {
        return loginPwd;
    }
    public void setLoginPwd(String loginPwd)
    {
        this.loginPwd = loginPwd;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getUserType()
    {
        return userType;
    }
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
    public String getUserStatus()
    {
        return userStatus;
    }
    public void setUserStatus(String userStatus)
    {
        this.userStatus = userStatus;
    }
    public Date getCreateTime()
    {
        return createTime;
    }
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    public String getOrgNo()
    {
        return orgNo;
    }
    public void setOrgNo(String orgNo)
    {
        this.orgNo = orgNo;
    }
    public String getPwdSalt()
    {
        return pwdSalt;
    }
    public void setPwdSalt(String pwdSalt)
    {
        this.pwdSalt = pwdSalt;
    }
}
