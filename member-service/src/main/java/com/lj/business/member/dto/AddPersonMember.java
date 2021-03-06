package com.lj.business.member.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class AddPersonMember.
 */
public class AddPersonMember implements Serializable { 

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = -741777716092297074L;


    /**
     * 会员名称 .
     */
    private String memberName;
    
    /**
     * 会员编号 .
     */
    private String memberNo;

    /**
     * 导购编号 .
     */
    private String memberNoGm;

    /**
     * 导购姓名 .
     */
    private String memberNameGm;

    /**
     * 分店编号 .
     */
    

    /**
     * 分店名称 .
     */
    

    /**
     * 商户编号 .
     */
    private String merchantNo;

    /**
     * 商户名称 .
     */
    private String merchantName;

    /**
     * 装修进度 .
     */
    private String spruceUp;

    /**
     * 所在楼盘 .
     */
    private String houses;

    /**
     * 是否关注 .
     */
    private String keepEye;

    /**
     * 紧急客户 .
     */
    private String urgencyPm;

    /**
     * 所需产品CODE .
     */
    private String bomCode;

    /**
     * 产品名称 .
     */
    private String bomName;
    
    /**
     * 预计购买时间 .
     */
    private Date expectPurchaseTime;
    
    /**
     * 到店时间 .
     */
    private Date expTime;

    /**
     * 创建人 .
     */
    private String createId;


    /**
     * 备注 .
     */
    private String remark4;

    /**
     * 备注 .
     */
    private String remark3;

    /**
     * 备注 .
     */
    private String remark2;

    /**
     * 备注 .
     */
    private String remark;
    /**
     * 扫码地址 .
     */
    private String scanAddress;
    
    /**
     * 是否微信好友：0不是、1是
     */
    private Integer wxFriends;
    
    /**
     * 客户新增方式：1导购扫码、2客户扫码、3手动新增、4勾子
     */
    private Integer addType;

    /**
     * 纬度 .
     */
    private String latitude;

    /**
     * 经度 .
     */
    private String longitude;
    
    /**
	 * @return the scanAddress
	 */
	public String getScanAddress() {
		return scanAddress;
	}

	/**
	 * @param scanAddress the scanAddress to set
	 */
	public void setScanAddress(String scanAddress) {
		this.scanAddress = scanAddress;
	}

	/**
     * 是否微信好友：0不是、1是
     */
	public Integer getWxFriends() {
		return wxFriends;
	}

	/**
     * 是否微信好友：0不是、1是
     */
	public void setWxFriends(Integer wxFriends) {
		this.wxFriends = wxFriends;
	}

	/**
     * 客户新增方式：1导购扫码、2客户扫码、3手动新增、4勾子
     */
	public Integer getAddType() {
		return addType;
	}

	/**
     * 客户新增方式：1导购扫码、2客户扫码、3手动新增、4勾子
     */
	public void setAddType(Integer addType) {
		this.addType = addType;
	}
	
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/** The add person member base. */
    private AddPersonMemberBase addPersonMemberBase;

	/**
	 * Gets the 会员名称 .
	 *
	 * @return the 会员名称 
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * Sets the 会员名称 .
	 *
	 * @param memberName the new 会员名称 
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * Gets the 导购编号 .
	 *
	 * @return the 导购编号 
	 */
	public String getMemberNoGm() {
		return memberNoGm;
	}

	/**
	 * Sets the 导购编号 .
	 *
	 * @param memberNoGm the new 导购编号 
	 */
	public void setMemberNoGm(String memberNoGm) {
		this.memberNoGm = memberNoGm;
	}

	/**
	 * Gets the 导购姓名 .
	 *
	 * @return the 导购姓名 
	 */
	public String getMemberNameGm() {
		return memberNameGm;
	}

	/**
	 * Sets the 导购姓名 .
	 *
	 * @param memberNameGm the new 导购姓名 
	 */
	public void setMemberNameGm(String memberNameGm) {
		this.memberNameGm = memberNameGm;
	}

	/**
	 * Gets the 商户编号 .
	 *
	 * @return the 商户编号 
	 */
	public String getMerchantNo() {
		return merchantNo;
	}

	/**
	 * Sets the 商户编号 .
	 *
	 * @param merchantNo the new 商户编号 
	 */
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	/**
	 * Gets the 商户名称 .
	 *
	 * @return the 商户名称 
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * Sets the 商户名称 .
	 *
	 * @param merchantName the new 商户名称 
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * Gets the 装修进度 .
	 *
	 * @return the 装修进度 
	 */
	public String getSpruceUp() {
		return spruceUp;
	}

	/**
	 * Sets the 装修进度 .
	 *
	 * @param spruceUp the new 装修进度 
	 */
	public void setSpruceUp(String spruceUp) {
		this.spruceUp = spruceUp;
	}

	/**
	 * Gets the 所在楼盘 .
	 *
	 * @return the 所在楼盘 
	 */
	public String getHouses() {
		return houses;
	}

	/**
	 * Sets the 所在楼盘 .
	 *
	 * @param houses the new 所在楼盘 
	 */
	public void setHouses(String houses) {
		this.houses = houses;
	}

	/**
	 * Gets the 是否关注 .
	 *
	 * @return the 是否关注 
	 */
	public String getKeepEye() {
		return keepEye;
	}

	/**
	 * Sets the 是否关注 .
	 *
	 * @param keepEye the new 是否关注 
	 */
	public void setKeepEye(String keepEye) {
		this.keepEye = keepEye;
	}

	/**
	 * Gets the 紧急客户 .
	 *
	 * @return the 紧急客户 
	 */
	public String getUrgencyPm() {
		return urgencyPm;
	}

	/**
	 * Sets the 紧急客户 .
	 *
	 * @param urgencyPm the new 紧急客户 
	 */
	public void setUrgencyPm(String urgencyPm) {
		this.urgencyPm = urgencyPm;
	}

	/**
	 * Gets the 所需产品CODE .
	 *
	 * @return the 所需产品CODE 
	 */
	public String getBomCode() {
		return bomCode;
	}

	/**
	 * Sets the 所需产品CODE .
	 *
	 * @param bomCode the new 所需产品CODE 
	 */
	public void setBomCode(String bomCode) {
		this.bomCode = bomCode;
	}

	/**
	 * Gets the 产品名称 .
	 *
	 * @return the 产品名称 
	 */
	public String getBomName() {
		return bomName;
	}

	/**
	 * Sets the 产品名称 .
	 *
	 * @param bomName the new 产品名称 
	 */
	public void setBomName(String bomName) {
		this.bomName = bomName;
	}

	public Date getExpectPurchaseTime() {
		return expectPurchaseTime;
	}

	public void setExpectPurchaseTime(Date expectPurchaseTime) {
		this.expectPurchaseTime = expectPurchaseTime;
	}

	public Date getExpTime() {
		return expTime;
	}

	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}

	/**
	 * Gets the 创建人 .
	 *
	 * @return the 创建人 
	 */
	public String getCreateId() {
		return createId;
	}

	/**
	 * Sets the 创建人 .
	 *
	 * @param createId the new 创建人 
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/**
	 * Gets the 备注 .
	 *
	 * @return the 备注 
	 */
	public String getRemark4() {
		return remark4;
	}

	/**
	 * Sets the 备注 .
	 *
	 * @param remark4 the new 备注 
	 */
	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	/**
	 * Gets the 备注 .
	 *
	 * @return the 备注 
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * Sets the 备注 .
	 *
	 * @param remark3 the new 备注 
	 */
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	/**
	 * Gets the 备注 .
	 *
	 * @return the 备注 
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * Sets the 备注 .
	 *
	 * @param remark2 the new 备注 
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	/**
	 * Gets the 备注 .
	 *
	 * @return the 备注 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the 备注 .
	 *
	 * @param remark the new 备注 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * Gets the 会员编号 .
	 *
	 * @return the 会员编号 
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * Sets the 会员编号 .
	 *
	 * @param memberNo the new 会员编号 
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	/**
	 * Gets the add person member base.
	 *
	 * @return the adds the person member base
	 */
	public AddPersonMemberBase getAddPersonMemberBase() {
		return addPersonMemberBase;
	}

	/**
	 * Sets the add person member base.
	 *
	 * @param addPersonMemberBase the adds the person member base
	 */
	public void setAddPersonMemberBase(AddPersonMemberBase addPersonMemberBase) {
		this.addPersonMemberBase = addPersonMemberBase;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddPersonMember [memberName=");
		builder.append(memberName);
		builder.append(", memberNo=");
		builder.append(memberNo);
		builder.append(", memberNoGm=");
		builder.append(memberNoGm);
		builder.append(", memberNameGm=");
		builder.append(memberNameGm);
		builder.append(", merchantNo=");
		builder.append(merchantNo);
		builder.append(", merchantName=");
		builder.append(merchantName);
		builder.append(", spruceUp=");
		builder.append(spruceUp);
		builder.append(", houses=");
		builder.append(houses);
		builder.append(", keepEye=");
		builder.append(keepEye);
		builder.append(", urgencyPm=");
		builder.append(urgencyPm);
		builder.append(", bomCode=");
		builder.append(bomCode);
		builder.append(", bomName=");
		builder.append(bomName);
		builder.append(", expectPurchaseTime=");
		builder.append(expectPurchaseTime);
		builder.append(", expTime=");
		builder.append(expTime);
		builder.append(", createId=");
		builder.append(createId);
		builder.append(", remark4=");
		builder.append(remark4);
		builder.append(", remark3=");
		builder.append(remark3);
		builder.append(", remark2=");
		builder.append(remark2);
		builder.append(", remark=");
		builder.append(remark);
		builder.append(", scanAddress=");
		builder.append(scanAddress);
		builder.append(", wxFriends=");
		builder.append(wxFriends);
		builder.append(", addType=");
		builder.append(addType);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", addPersonMemberBase=");
		builder.append(addPersonMemberBase);
		builder.append("]");
		return builder.toString();
	}

    
}
