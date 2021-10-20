/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 用户表
 */
public class MallUser {
    private Long userId;            // 用户主键id

    private String nickName;        // 用户昵称

    private String loginName;       // 登录名称（默认为手机号）

    private String passwordMd5;     // MD5加密后的密码

    private String introduceSign;   // 个性签名

    private String address;         // 收货地址

    private Byte isDeleted;         // 注销标识字段（0-正常 1-已注销）

    private Byte lockedFlag;        // 锁定标识字段（0-未锁定 1-已锁定）

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;        // 注册时间

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPasswordMd5() {
        return passwordMd5;
    }

    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5 == null ? null : passwordMd5.trim();
    }

    public String getIntroduceSign() {
        return introduceSign;
    }

    public void setIntroduceSign(String introduceSign) {
        this.introduceSign = introduceSign == null ? null : introduceSign.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Byte getLockedFlag() {
        return lockedFlag;
    }

    public void setLockedFlag(Byte lockedFlag) {
        this.lockedFlag = lockedFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickName=").append(nickName);
        sb.append(", loginName=").append(loginName);
        sb.append(", passwordMd5=").append(passwordMd5);
        sb.append(", introduceSign=").append(introduceSign);
        sb.append(", address=").append(address);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", lockedFlag=").append(lockedFlag);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}