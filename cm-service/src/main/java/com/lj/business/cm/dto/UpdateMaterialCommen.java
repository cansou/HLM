package com.lj.business.cm.dto;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateMaterialCommen.
 */
public class UpdateMaterialCommen implements Serializable { 

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5767131748229740182L;

	/**
     * CODE .
     */
    private String code;

    /**
     * 类型CODE .
     */
    private String materialTypeCode;

    /**
     * 类型名称 .
     */
    private String materialTypeName;

    /**
     * 标题 .
     */
    private String title;

    /**
     * 内容 .
     */
    private String content;
    
    /**
     * 简介 .
     */
    private String brief;

    /**
     * 图片地址 .
     */
    private String imgAddr;

    /** 回应数量. */
    private int respondNum;

    /**
     * 创建人 .
     */
    private String createId;

    /**
     * 创建时间 .
     */
    private Date createDate;
    
    /** 终端编号. */
    
    
    /** 终端名称. */
    
     
     /** 维护维度. */
    private String dimensionSt;
    
    /** 网址链接. */
   private String linkUrl;
    
   /** 终端类型. */
   private String shopType;
   
   /** 模版ID. */
   private String tempId;
   
   private Date startTime;
   private Date endTime;
   
   
   
   public Date getStartTime() {
	return startTime;
   }

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
    * Gets the 模版ID.
    *
    * @return the tempId
    */
	public String getTempId() {
		return tempId;
	}

	/**
	 * Sets the 模版ID.
	 *
	 * @param tempId the tempId to set
	 */
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
   
	/**
	 * Gets the 终端类型.
	 *
	 * @return the 终端类型
	 */
	public String getShopType() {
	return shopType;
}

/**
 * Sets the 终端类型.
 *
 * @param shopType the new 终端类型
 */
public void setShopType(String shopType) {
	this.shopType = shopType;
}

	/**
	 * Gets the 网址链接.
	 *
	 * @return the 网址链接
	 */
	public String getLinkUrl() {
		return linkUrl;
	}

	/**
	 * Sets the 网址链接.
	 *
	 * @param linkUrl the new 网址链接
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}


	/**
	 * Gets the dimension st.
	 *
	 * @return the dimension st
	 */
	public String getDimensionSt() {
		return dimensionSt;
	}

	/**
	 * Sets the dimension st.
	 *
	 * @param dimensionSt the dimension st
	 */
	public void setDimensionSt(String dimensionSt) {
		this.dimensionSt = dimensionSt;
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
	 * Gets the 类型CODE .
	 *
	 * @return the 类型CODE 
	 */
	public String getMaterialTypeCode() {
		return materialTypeCode;
	}

	/**
	 * Sets the 类型CODE .
	 *
	 * @param materialTypeCode the new 类型CODE 
	 */
	public void setMaterialTypeCode(String materialTypeCode) {
		this.materialTypeCode = materialTypeCode;
	}

	/**
	 * Gets the 类型名称 .
	 *
	 * @return the 类型名称 
	 */
	public String getMaterialTypeName() {
		return materialTypeName;
	}

	/**
	 * Sets the 类型名称 .
	 *
	 * @param materialTypeName the new 类型名称 
	 */
	public void setMaterialTypeName(String materialTypeName) {
		this.materialTypeName = materialTypeName;
	}

	/**
	 * Gets the 标题 .
	 *
	 * @return the 标题 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the 标题 .
	 *
	 * @param title the new 标题 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the 内容 .
	 *
	 * @return the 内容 
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the 内容 .
	 *
	 * @param content the new 内容 
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Gets the 图片地址 .
	 *
	 * @return the 图片地址 
	 */
	public String getImgAddr() {
		return imgAddr;
	}

	/**
	 * Sets the 图片地址 .
	 *
	 * @param imgAddr the new 图片地址 
	 */
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	/**
	 * Gets the 回应数量 .
	 *
	 * @return the 回应数量
	 */
	public int getRespondNum() {
		return respondNum;
	}

	/**
	 * Sets the 回应数量 .
	 *
	 * @param respondNum the new 回应数量
	 */
	public void setRespondNum(int respondNum) {
		this.respondNum = respondNum;
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
	 * Gets the 创建时间 .
	 *
	 * @return the 创建时间 
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the 创建时间 .
	 *
	 * @param createDate the new 创建时间 
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateMaterialCommen [code=").append(code)
				.append(", materialTypeCode=").append(materialTypeCode)
				.append(", materialTypeName=").append(materialTypeName)
				.append(", title=").append(title).append(", content=")
				.append(content).append(", brief=").append(brief)
				.append(", imgAddr=").append(imgAddr).append(", respondNum=")
				.append(respondNum).append(", createId=").append(createId)
				.append(", createDate=").append(createDate)
				.append(", dimensionSt=").append(dimensionSt)
				.append(", linkUrl=").append(linkUrl).append(", shopType=")
				.append(shopType).append(", tempId=").append(tempId)
				.append("]");
		return builder.toString();
	}

	/**
	 * Gets the 简介 .
	 *
	 * @return the 简介 
	 */
	public String getBrief() {
		return brief;
	}

	/**
	 * Sets the 简介 .
	 *
	 * @param brief the new 简介 
	 */
	public void setBrief(String brief) {
		this.brief = brief;
	}
    
    
}
