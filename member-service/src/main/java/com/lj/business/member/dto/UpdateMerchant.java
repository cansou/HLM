package com.lj.business.member.dto;

import java.io.Serializable;
import java.util.Date;

import com.lj.business.member.emus.Status;

/**
 * The Class UpdateMerchant.
 */
public class UpdateMerchant implements Serializable { 

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8934840250941934963L;
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
     * 状态 
             NORMAL正常、
             CANCEL注销
              .
     */
    private Status status;
    
    /**
     * 是否电商：
     * 		 use 启用、
             unuse 禁用
              .
     */
    private String eshopStatus;

    /**
     * 电商网站
     */
    private String eshopUrl;
    
    /**
     * 住址 .
     */
    private String address;

    /**
     * 邮箱 .
     */
    private String email;

    /**
     * 所属行业 .
     */
    private String businessType;

    /**
     * LOGO图片 .
     */
    private String logoAddr;

    /**
     * 官方网站 .
     */
    private String websiteUrl;

    /**
     * 联系电话 .
     */
    private String telephone;

    /**
     * 商户试用开始时间 .
     */
    private Date beginProbationTime;
    
    /**
     * 商户试用结束时间 .
     */
    private Date endProbationTime;
    
    /**
     * 商户试用状态 .
     */
    private String probationStatus;

    /**
     * 更新人 .
     */
    private String updateId;


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
     * 产品类型
     */
    private String productType;
    
    

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType; 
	}

	public String getEshopUrl() {
		return eshopUrl;
	}

	public void setEshopUrl(String eshopUrl) {
		this.eshopUrl = eshopUrl;
	}

	/**
	 * Gets the cODE .
	 *
	 * @return the cODE 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the cODE .
	 *
	 * @param code the new cODE 
	 */
	public void setCode(String code) {
		this.code = code;
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


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Gets the 住址 .
	 *
	 * @return the 住址 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the 住址 .
	 *
	 * @param address the new 住址 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the 邮箱 .
	 *
	 * @return the 邮箱 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the 邮箱 .
	 *
	 * @param email the new 邮箱 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the 所属行业 .
	 *
	 * @return the 所属行业 
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * Sets the 所属行业 .
	 *
	 * @param businessType the new 所属行业 
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	/**
	 * Gets the lOGO图片 .
	 *
	 * @return the lOGO图片 
	 */
	public String getLogoAddr() {
		return logoAddr;
	}

	/**
	 * Sets the lOGO图片 .
	 *
	 * @param logoAddr the new lOGO图片 
	 */
	public void setLogoAddr(String logoAddr) {
		this.logoAddr = logoAddr;
	}

	/**
	 * Gets the 官方网站 .
	 *
	 * @return the 官方网站 
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/**
	 * Sets the 官方网站 .
	 *
	 * @param websiteUrl the new 官方网站 
	 */
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	/**
	 * Gets the 联系电话 .
	 *
	 * @return the 联系电话 
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets the 联系电话 .
	 *
	 * @param telephone the new 联系电话 
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getBeginProbationTime() {
		return beginProbationTime;
	}

	public void setBeginProbationTime(Date beginProbationTime) {
		this.beginProbationTime = beginProbationTime;
	}

	public Date getEndProbationTime() {
		return endProbationTime;
	}

	public void setEndProbationTime(Date endProbationTime) {
		this.endProbationTime = endProbationTime;
	}

	public String getProbationStatus() {
		return probationStatus;
	}

	public void setProbationStatus(String probationStatus) {
		this.probationStatus = probationStatus;
	}

	/**
	 * Gets the 更新人 .
	 *
	 * @return the 更新人 
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * Sets the 更新人 .
	 *
	 * @param updateId the new 更新人 
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
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

	public String getEshopStatus() {
		return eshopStatus;
	}

	public void setEshopStatus(String eshopStatus) {
		this.eshopStatus = eshopStatus;
	}

	@Override
	public String toString() {
		return "UpdateMerchant [code=" + code + ", merchantNo=" + merchantNo
				+ ", merchantName=" + merchantName + ", status=" + status
				+ ", eshopStatus=" + eshopStatus + ", eshopUrl=" + eshopUrl
				+ ", address=" + address + ", email=" + email
				+ ", businessType=" + businessType + ", logoAddr=" + logoAddr
				+ ", websiteUrl=" + websiteUrl + ", telephone=" + telephone
				+ ", beginProbationTime=" + beginProbationTime
				+ ", endProbationTime=" + endProbationTime
				+ ", probationStatus=" + probationStatus + ", updateId="
				+ updateId + ", remark=" + remark + ", remark2=" + remark2
				+ ", remark3=" + remark3 + ", remark4=" + remark4
				+ ", updateMerchant=" + productType + "]";
	}

    
}
