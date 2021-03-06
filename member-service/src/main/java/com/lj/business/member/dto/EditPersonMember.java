package com.lj.business.member.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class EditPersonMember.
 */
public class EditPersonMember implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1783743804207258533L;
	
	// person_member_base
	
	 /**
     * CODE .(必填)
     */
    private String code;

    /**
     * 客户编号 .(必填)
     */
    private String memberNo;

    /**
     * 客户名称 .
     */
    private String memberName;

    /**
     * 状态 
             NORMAL正常
             CANCEL注销
             FREEZE冻结
              .
     */
    private String status;

    /**
     * 证件类型 .
     */
    private String certTypeCode;

    /**
     * 证件号码 .
     */
    private String certNo;

    /**
     * 手机号 .
     */
    private String mobile;

    /**
     * 手机串号 .
     */
    private String imei;

    /**
     * 邮箱 .
     */
    private String email;

    /**
     * 职业 .
     */
    private String job;

    /**
     * 住址 .
     */
    private String address;

    /**
     * 年龄 .
     */
    private Integer age;

    /**
     * 性别:(必填)
             男：male
             女：female
             未知：unknown .
     */
    private String sex;

    /**
     * 实名认证标识 N未实名认证  Y实名认证 .
     */
    private String nameAuthFlag;

    /**
     * 登录密码 .
     */
    private String pwd;

    /**
     * 加密机CODE .
     */
    private String encryptionCode;

    /**
     * 客户来源 .(必填)
     */
    private String memberSrc;

    /**
     * 微信公众号OPENID .
     */
    private String openIdGzhWx;

    /**
     * 微信小程序OPENID .
     */
    private String openIdXcxWx;

    /**
     * 微信号 .
     */
    private String noWx;

    /**
     * 昵称_微信 .
     */
    private String nickNameWx;

    /**
     * 城市_微信 .
     */
    private String cityWx;

    /**
     * 国家 .
     */
    private String countryWx;

    /**
     * 省_微信 .
     */
    private String provinceWx;

    /**
     * 头像地址 .
     */
    private String headAddress;

    /**
     * 关注时间 .
     */
    private Date subsribeTime;

    /**
     * 家庭组CODE .
     */
    private String familyCode;

    /**
     * 客户家庭组名称 .
     */
    private String familyName;

    /**
     * 兴趣 .
     */
    private String interest;

    /**
     * 区域CODE .
     */
    private String areaCode;
    
    /**
     * 区域名称 .
     */
    private String areaName;

    /**
     * 省CODE .
     */
    private String provinceCode;

    /**
     * 市CODE .
     */
    private String cityCode;

    /**
     * 市区CODE .
     */
    private String cityAreaCode;
    
    
    // person_member
    
    /**
     * codePm .(必填)
     */
    private String codePm;


    /**
     * 商户编号 .(必填)
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
     * 紧急客户 .(必填)
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
     * 昵称备注_微信 .
     */
    private String nickNameRemarkWx;
    
    
    // 其他
    /** 客户分组code(必填). */
    private String pmTypeCode;
    
    /** 操做人. */
    private String operater;
    
    /**  出生日期. */
    private Date birthday;
    
    /**
     * 对比品牌 .
     */
    private String brandCompare;

    /**
     * 客户特质 .
     */
    private String clientSpecial;
    
    /**
     * 预计购买时间 .
     */
    private String expectPurchaseTime;
    
    /**
     * 到店时间 .
     */
    private String expTime;
    
    /**
     * 备注 .
     */
    private String remark;

    /**
     * 星座
     */
    private String constellation;
    
    /**
     * 消费频率(天)
     */
    private Integer consumeFrequency;
    
    /**
     * 选中的标签
     */
    private PmLabelDto[] labels;
    
    /**
     * 提示周期--天
     */
    private Integer cycle;

    /**
     * 导购微信
     */
    private String noWxGm;
    /**
     * 导购编号
     */
    private String memberNoGm;
    /**
     * 首次添加手机号码时间
     */
    private Date addMobileDate;
    
    
	public Date getAddMobileDate() {
		return addMobileDate;
	}

	public void setAddMobileDate(Date addMobileDate) {
		this.addMobileDate = addMobileDate;
	}

	public String getMemberNoGm() {
		return memberNoGm;
	}

	public void setMemberNoGm(String memberNoGm) {
		this.memberNoGm = memberNoGm;
	}

	public String getNoWxGm() {
		return noWxGm;
	}

	public void setNoWxGm(String noWxGm) {
		this.noWxGm = noWxGm;
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
	 * Gets the 客户编号 .
	 *
	 * @return the 客户编号 
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * Sets the 客户编号 .
	 *
	 * @param memberNo the new 客户编号 
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	/**
	 * Gets the 客户名称 .
	 *
	 * @return the 客户名称 
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * Sets the 客户名称 .
	 *
	 * @param memberName the new 客户名称 
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * Gets the 状态 NORMAL正常 CANCEL注销 FREEZE冻结 .
	 *
	 * @return the 状态 NORMAL正常 CANCEL注销 FREEZE冻结 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the 状态 NORMAL正常 CANCEL注销 FREEZE冻结 .
	 *
	 * @param status the new 状态 NORMAL正常 CANCEL注销 FREEZE冻结 
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the 证件类型 .
	 *
	 * @return the 证件类型 
	 */
	public String getCertTypeCode() {
		return certTypeCode;
	}

	/**
	 * Sets the 证件类型 .
	 *
	 * @param certTypeCode the new 证件类型 
	 */
	public void setCertTypeCode(String certTypeCode) {
		this.certTypeCode = certTypeCode;
	}

	/**
	 * Gets the 证件号码 .
	 *
	 * @return the 证件号码 
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * Sets the 证件号码 .
	 *
	 * @param certNo the new 证件号码 
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * Gets the 手机号 .
	 *
	 * @return the 手机号 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the 手机号 .
	 *
	 * @param mobile the new 手机号 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the 手机串号 .
	 *
	 * @return the 手机串号 
	 */
	public String getImei() {
		return imei;
	}

	/**
	 * Sets the 手机串号 .
	 *
	 * @param imei the new 手机串号 
	 */
	public void setImei(String imei) {
		this.imei = imei;
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
	 * Gets the 职业 .
	 *
	 * @return the 职业 
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Sets the 职业 .
	 *
	 * @param job the new 职业 
	 */
	public void setJob(String job) {
		this.job = job;
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
	 * Gets the 年龄 .
	 *
	 * @return the 年龄 
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the 年龄 .
	 *
	 * @param age the new 年龄 
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Gets the 性别:(必填) 男：male 女：female 未知：unknown .
	 *
	 * @return the 性别:(必填) 男：male 女：female 未知：unknown 
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the 性别:(必填) 男：male 女：female 未知：unknown .
	 *
	 * @param sex the new 性别:(必填) 男：male 女：female 未知：unknown 
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * Gets the 实名认证标识 N未实名认证  Y实名认证 .
	 *
	 * @return the 实名认证标识 N未实名认证  Y实名认证 
	 */
	public String getNameAuthFlag() {
		return nameAuthFlag;
	}

	/**
	 * Sets the 实名认证标识 N未实名认证  Y实名认证 .
	 *
	 * @param nameAuthFlag the new 实名认证标识 N未实名认证  Y实名认证 
	 */
	public void setNameAuthFlag(String nameAuthFlag) {
		this.nameAuthFlag = nameAuthFlag;
	}

	/**
	 * Gets the 登录密码 .
	 *
	 * @return the 登录密码 
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * Sets the 登录密码 .
	 *
	 * @param pwd the new 登录密码 
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * Gets the 加密机CODE .
	 *
	 * @return the 加密机CODE 
	 */
	public String getEncryptionCode() {
		return encryptionCode;
	}

	/**
	 * Sets the 加密机CODE .
	 *
	 * @param encryptionCode the new 加密机CODE 
	 */
	public void setEncryptionCode(String encryptionCode) {
		this.encryptionCode = encryptionCode;
	}

	/**
	 * Gets the 客户来源 .
	 *
	 * @return the 客户来源 
	 */
	public String getMemberSrc() {
		return memberSrc;
	}

	/**
	 * Sets the 客户来源 .
	 *
	 * @param memberSrc the new 客户来源 
	 */
	public void setMemberSrc(String memberSrc) {
		this.memberSrc = memberSrc;
	}

	/**
	 * Gets the 微信公众号OPENID .
	 *
	 * @return the 微信公众号OPENID 
	 */
	public String getOpenIdGzhWx() {
		return openIdGzhWx;
	}

	/**
	 * Sets the 微信公众号OPENID .
	 *
	 * @param openIdGzhWx the new 微信公众号OPENID 
	 */
	public void setOpenIdGzhWx(String openIdGzhWx) {
		this.openIdGzhWx = openIdGzhWx;
	}

	/**
	 * Gets the 微信小程序OPENID .
	 *
	 * @return the 微信小程序OPENID 
	 */
	public String getOpenIdXcxWx() {
		return openIdXcxWx;
	}

	/**
	 * Sets the 微信小程序OPENID .
	 *
	 * @param openIdXcxWx the new 微信小程序OPENID 
	 */
	public void setOpenIdXcxWx(String openIdXcxWx) {
		this.openIdXcxWx = openIdXcxWx;
	}

	/**
	 * Gets the 微信号 .
	 *
	 * @return the 微信号 
	 */
	public String getNoWx() {
		return noWx;
	}

	/**
	 * Sets the 微信号 .
	 *
	 * @param noWx the new 微信号 
	 */
	public void setNoWx(String noWx) {
		this.noWx = noWx;
	}

	/**
	 * Gets the 昵称_微信 .
	 *
	 * @return the 昵称_微信 
	 */
	public String getNickNameWx() {
		return nickNameWx;
	}

	/**
	 * Sets the 昵称_微信 .
	 *
	 * @param nickNameWx the new 昵称_微信 
	 */
	public void setNickNameWx(String nickNameWx) {
		this.nickNameWx = nickNameWx;
	}

	/**
	 * Gets the 城市_微信 .
	 *
	 * @return the 城市_微信 
	 */
	public String getCityWx() {
		return cityWx;
	}

	/**
	 * Sets the 城市_微信 .
	 *
	 * @param cityWx the new 城市_微信 
	 */
	public void setCityWx(String cityWx) {
		this.cityWx = cityWx;
	}

	/**
	 * Gets the 国家 .
	 *
	 * @return the 国家 
	 */
	public String getCountryWx() {
		return countryWx;
	}

	/**
	 * Sets the 国家 .
	 *
	 * @param countryWx the new 国家 
	 */
	public void setCountryWx(String countryWx) {
		this.countryWx = countryWx;
	}

	/**
	 * Gets the 省_微信 .
	 *
	 * @return the 省_微信 
	 */
	public String getProvinceWx() {
		return provinceWx;
	}

	/**
	 * Sets the 省_微信 .
	 *
	 * @param provinceWx the new 省_微信 
	 */
	public void setProvinceWx(String provinceWx) {
		this.provinceWx = provinceWx;
	}

	/**
	 * Gets the 头像地址 .
	 *
	 * @return the 头像地址 
	 */
	public String getHeadAddress() {
		return headAddress;
	}

	/**
	 * Sets the 头像地址 .
	 *
	 * @param headAddress the new 头像地址 
	 */
	public void setHeadAddress(String headAddress) {
		this.headAddress = headAddress;
	}

	/**
	 * Gets the 关注时间 .
	 *
	 * @return the 关注时间 
	 */
	public Date getSubsribeTime() {
		return subsribeTime;
	}

	/**
	 * Sets the 关注时间 .
	 *
	 * @param subsribeTime the new 关注时间 
	 */
	public void setSubsribeTime(Date subsribeTime) {
		this.subsribeTime = subsribeTime;
	}

	/**
	 * Gets the 家庭组CODE .
	 *
	 * @return the 家庭组CODE 
	 */
	public String getFamilyCode() {
		return familyCode;
	}

	/**
	 * Sets the 家庭组CODE .
	 *
	 * @param familyCode the new 家庭组CODE 
	 */
	public void setFamilyCode(String familyCode) {
		this.familyCode = familyCode;
	}

	/**
	 * Gets the 客户家庭组名称 .
	 *
	 * @return the 客户家庭组名称 
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * Sets the 客户家庭组名称 .
	 *
	 * @param familyName the new 客户家庭组名称 
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * Gets the 兴趣 .
	 *
	 * @return the 兴趣 
	 */
	public String getInterest() {
		return interest;
	}

	/**
	 * Sets the 兴趣 .
	 *
	 * @param interest the new 兴趣 
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * Gets the 区域CODE .
	 *
	 * @return the 区域CODE 
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the 区域CODE .
	 *
	 * @param areaCode the new 区域CODE 
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * Gets the 省CODE .
	 *
	 * @return the 省CODE 
	 */
	public String getProvinceCode() {
		return provinceCode;
	}

	/**
	 * Sets the 省CODE .
	 *
	 * @param provinceCode the new 省CODE 
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	/**
	 * Gets the 市CODE .
	 *
	 * @return the 市CODE 
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * Sets the 市CODE .
	 *
	 * @param cityCode the new 市CODE 
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * Gets the 市区CODE .
	 *
	 * @return the 市区CODE 
	 */
	public String getCityAreaCode() {
		return cityAreaCode;
	}

	/**
	 * Sets the 市区CODE .
	 *
	 * @param cityAreaCode the new 市区CODE 
	 */
	public void setCityAreaCode(String cityAreaCode) {
		this.cityAreaCode = cityAreaCode;
	}

	/**
	 * Gets the codePm .
	 *
	 * @return the codePm 
	 */
	public String getCodePm() {
		return codePm;
	}

	/**
	 * Sets the codePm .
	 *
	 * @param codePm the new codePm 
	 */
	public void setCodePm(String codePm) {
		this.codePm = codePm;
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

	/**
	 * Gets the 昵称备注_微信 .
	 *
	 * @return the 昵称备注_微信 
	 */
	public String getNickNameRemarkWx() {
		return nickNameRemarkWx;
	}

	/**
	 * Sets the 昵称备注_微信 .
	 *
	 * @param nickNameRemarkWx the new 昵称备注_微信 
	 */
	public void setNickNameRemarkWx(String nickNameRemarkWx) {
		this.nickNameRemarkWx = nickNameRemarkWx;
	}
	
	/**
	 * Gets the 客户分组code(必填).
	 *
	 * @return the 客户分组code(必填)
	 */
	public String getPmTypeCode() {
		return pmTypeCode;
	}

	/**
	 * Sets the 客户分组code(必填).
	 *
	 * @param pmTypeCode the new 客户分组code(必填)
	 */
	public void setPmTypeCode(String pmTypeCode) {
		this.pmTypeCode = pmTypeCode;
	}
	
	
	/**
	 * Gets the 操做人.
	 *
	 * @return the 操做人
	 */
	public String getOperater() {
		return operater;
	}

	/**
	 * Sets the 操做人.
	 *
	 * @param operater the new 操做人
	 */
	public void setOperater(String operater) {
		this.operater = operater;
	}
	
	/**
	 * Gets the birthday.
	 *
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * Sets the birthday.
	 *
	 * @param birthday the new birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * Gets the 对比品牌 .
	 *
	 * @return the 对比品牌 
	 */
	public String getBrandCompare() {
		return brandCompare;
	}

	/**
	 * Sets the 对比品牌 .
	 *
	 * @param brandCompare the new 对比品牌 
	 */
	public void setBrandCompare(String brandCompare) {
		this.brandCompare = brandCompare;
	}

	/**
	 * Gets the 客户特质 .
	 *
	 * @return the 客户特质 
	 */
	public String getClientSpecial() {
		return clientSpecial;
	}

	/**
	 * Sets the 客户特质 .
	 *
	 * @param clientSpecial the new 客户特质 
	 */
	public void setClientSpecial(String clientSpecial) {
		this.clientSpecial = clientSpecial;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getExpectPurchaseTime() {
		return expectPurchaseTime;
	}

	public void setExpectPurchaseTime(String expectPurchaseTime) {
		this.expectPurchaseTime = expectPurchaseTime;
	}

	public String getExpTime() {
		return expTime;
	}

	public void setExpTime(String expTime) {
		this.expTime = expTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the constellation
	 */
	public String getConstellation() {
		return constellation;
	}

	/**
	 * @param constellation the constellation to set
	 */
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	/**
	 * @return the consumeFrequency
	 */
	public Integer getConsumeFrequency() {
		return consumeFrequency;
	}

	/**
	 * @param consumeFrequency the consumeFrequency to set
	 */
	public void setConsumeFrequency(Integer consumeFrequency) {
		this.consumeFrequency = consumeFrequency;
	}

    public PmLabelDto[] getLabels() {
        return labels;
    }

    public void setLabels(PmLabelDto[] labels) {
        this.labels = labels;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

	@Override
	public String toString() {
		return "EditPersonMember [code=" + code + ", memberNo=" + memberNo + ", memberName=" + memberName + ", status="
				+ status + ", certTypeCode=" + certTypeCode + ", certNo=" + certNo + ", mobile=" + mobile + ", imei="
				+ imei + ", email=" + email + ", job=" + job + ", address=" + address + ", age=" + age + ", sex=" + sex
				+ ", nameAuthFlag=" + nameAuthFlag + ", pwd=" + pwd + ", encryptionCode=" + encryptionCode
				+ ", memberSrc=" + memberSrc + ", openIdGzhWx=" + openIdGzhWx + ", openIdXcxWx=" + openIdXcxWx
				+ ", noWx=" + noWx + ", nickNameWx=" + nickNameWx + ", cityWx=" + cityWx + ", countryWx=" + countryWx
				+ ", provinceWx=" + provinceWx + ", headAddress=" + headAddress + ", subsribeTime=" + subsribeTime
				+ ", familyCode=" + familyCode + ", familyName=" + familyName + ", interest=" + interest + ", areaCode="
				+ areaCode + ", areaName=" + areaName + ", provinceCode=" + provinceCode + ", cityCode=" + cityCode
				+ ", cityAreaCode=" + cityAreaCode + ", codePm=" + codePm + ", merchantNo=" + merchantNo
				+ ", merchantName=" + merchantName + ", spruceUp=" + spruceUp + ", houses=" + houses + ", keepEye="
				+ keepEye + ", urgencyPm=" + urgencyPm + ", bomCode=" + bomCode + ", bomName=" + bomName
				+ ", nickNameRemarkWx=" + nickNameRemarkWx + ", pmTypeCode=" + pmTypeCode + ", operater=" + operater
				+ ", birthday=" + birthday + ", brandCompare=" + brandCompare + ", clientSpecial=" + clientSpecial
				+ ", expectPurchaseTime=" + expectPurchaseTime + ", expTime=" + expTime + ", remark=" + remark
				+ ", constellation=" + constellation + ", consumeFrequency=" + consumeFrequency + ", labels="
				+ Arrays.toString(labels) + ", cycle=" + cycle + ", noWxGm=" + noWxGm + ", memberNoGm=" + memberNoGm
				+ "]";
	}

}
