package com.lj.business.member.dto.terminalimstatus;

import java.io.Serializable;
import java.util.Date;

public class FindTerminalBatteryLevelPageReturn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1124510953607555008L; 


	/**
     * CODE .
     */
    private String code;

    /**
     * 商户编号 .
     */
    private String merchantNo;

    /**
     * 商户名称 .
     */
    private String merchantName;

    /**
     * 分店编号 .
     */
    

    /**
     * 分店名称 .
     */
    

    /**
     * 终端类型：GM导购、ZK中控 .
     */
    private String terminalType;
    
    /**
     * 终端编码
     */
    private String terminalCode;

    /**
     * 手机串号 .
     */
    private String imei;

    /**
     * 是否在线：0离线、1在线 .
     */
    private Integer onlineFlag;

    /**
     * 登录导购编号 .
     */
    private String memberNoGm;

    /**
     * 登录导购姓名 .
     */
    private String memberName;

    /**
     * 登录时间 .
     */
    private Date loginTime;

    /**
     * 终端电量（百分比） .
     */
    private Integer batteryLevel;

    /**
     * 创建人 .
     */
    private String createId;

    /**
     * 创建时间 .
     */
    private Date createDate;

    /**
     * 备注 .
     */
    private String remark;

    /**
     * 备注 .
     */
    private String remark2;

    /**
     * 备注 .
     */
    private String remark3;

    /**
     * 备注 .
     */
    private String remark4;

    /**
     * 店长姓名 .
     */
    private String managerMemberName;
    /**
     * 店长手机 .
     */
    private String managerMemberMobile;
    /**
     * 导购手机 .
     */
    private String guidMemberMobile;
    /**
     * 版本名称
     */
    private String versionName;
    /**
     * 绑定微信号
     */
    private String noWx;
    /**
     * 绑定微信昵称
     */
    private String wxNickname;
    /**
     * 终端code
     */
    private String stCode;
    
    
    
    public String getStCode() {
		return stCode;
	}

	public void setStCode(String stCode) {
		this.stCode = stCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getNoWx() {
		return noWx;
	}

	public void setNoWx(String noWx) {
		this.noWx = noWx;
	}

	public String getWxNickname() {
		return wxNickname;
	}

	public void setWxNickname(String wxNickname) {
		this.wxNickname = wxNickname;
	}

	public String getGuidMemberMobile() {
		return guidMemberMobile;
	}

	public void setGuidMemberMobile(String guidMemberMobile) {
		this.guidMemberMobile = guidMemberMobile;
	}

	public String getManagerMemberName() {
		return managerMemberName;
	}

	public void setManagerMemberName(String managerMemberName) {
		this.managerMemberName = managerMemberName;
	}

	public String getManagerMemberMobile() {
		return managerMemberMobile;
	}

	public void setManagerMemberMobile(String managerMemberMobile) {
		this.managerMemberMobile = managerMemberMobile;
	}

	/**
     * CODE .
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * CODE .
     *
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 商户编号 .
     *
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号 .
     *
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    /**
     * 商户名称 .
     *
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 商户名称 .
     *
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }


    /**
     * 终端类型：GM导购、ZK中控 .
     *
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * 终端类型：GM导购、ZK中控 .
     *
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    /**
	 * @return the terminalCode
	 */
	public String getTerminalCode() {
		return terminalCode;
	}

	/**
	 * @param terminalCode the terminalCode to set
	 */
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	/**
     * 是否在线：0离线、1在线 .
     *
     */
    public Integer getOnlineFlag() {
        return onlineFlag;
    }

    /**
     * 是否在线：0离线、1在线 .
     *
     */
    public void setOnlineFlag(Integer onlineFlag) {
        this.onlineFlag = onlineFlag;
    }

    /**
     * 登录导购编号 .
     *
     */
    public String getMemberNoGm() {
        return memberNoGm;
    }

    /**
     * 登录导购编号 .
     *
     */
    public void setMemberNoGm(String memberNoGm) {
        this.memberNoGm = memberNoGm == null ? null : memberNoGm.trim();
    }

    /**
     * 登录导购姓名 .
     *
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 登录导购姓名 .
     *
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 手机串号 .
     *
     */
    public String getImei() {
        return imei;
    }

    /**
     * 手机串号 .
     *
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * 登录时间 .
     *
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 登录时间 .
     *
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 终端电量（百分比） .
     *
     */
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * 终端电量（百分比） .
     *
     */
    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * 创建人 .
     *
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * 创建人 .
     *
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * 创建时间 .
     *
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间 .
     *
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 备注 .
     *
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注 .
     *
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 备注 .
     *
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 备注 .
     *
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * 备注 .
     *
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * 备注 .
     *
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * 备注 .
     *
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * 备注 .
     *
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FindTerminalBatteryLevelPageReturn [code=");
		builder.append(code);
		builder.append(", merchantNo=");
		builder.append(merchantNo);
		builder.append(", merchantName=");
		builder.append(merchantName);
		builder.append(", terminalType=");
		builder.append(terminalType);
		builder.append(", terminalCode=");
		builder.append(terminalCode);
		builder.append(", imei=");
		builder.append(imei);
		builder.append(", onlineFlag=");
		builder.append(onlineFlag);
		builder.append(", memberNoGm=");
		builder.append(memberNoGm);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", loginTime=");
		builder.append(loginTime);
		builder.append(", batteryLevel=");
		builder.append(batteryLevel);
		builder.append(", createId=");
		builder.append(createId);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", remark=");
		builder.append(remark);
		builder.append(", remark2=");
		builder.append(remark2);
		builder.append(", remark3=");
		builder.append(remark3);
		builder.append(", remark4=");
		builder.append(remark4);
		builder.append(", managerMemberName=");
		builder.append(managerMemberName);
		builder.append(", managerMemberMobile=");
		builder.append(managerMemberMobile);
		builder.append(", guidMemberMobile=");
		builder.append(guidMemberMobile);
		builder.append(", versionName=");
		builder.append(versionName);
		builder.append(", noWx=");
		builder.append(noWx);
		builder.append(", wxNickname=");
		builder.append(wxNickname);
		builder.append(", stCode=");
		builder.append(stCode);
		builder.append("]");
		return builder.toString();
	}

}
