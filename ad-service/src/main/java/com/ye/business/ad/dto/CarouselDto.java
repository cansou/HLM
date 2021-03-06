package com.ye.business.ad.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CarouselDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1822149111328142742L;

	/** 是否跟踪 */
	private Boolean hasTrack;

	/** 展示次数 */
	private Integer numShow;

	/** 查看次数 */
	private Integer numView;

	// 上架开始结束时间
	private String beginDateUp;
	private String endDateUp;

	// 下架开始结束时间
	private String beginDateDown;
	private String endDateDown;

	// 开始结束时间
	private Date beginDate;
	private Date endDate;
	/**
	 * 时间维度：day,hour；默认：day
	 */
	private String timeDimension;
	
	private List<String> codeList;

	///////////////////////////////////////////////////////////////

	/**
	 * CODE .
	 */
	private String code;

	/**
	 * 员工编号 .
	 */
	private String memberNoGuid;

	/**
	 * 员工姓名 .
	 */
	private String memberNameGuid;

	/**
	 * 门诊编号 .
	 */
	private String shopNo;

	/**
	 * 门诊名称 .
	 */
	private String shopName;

	/**
	 * 商户编号 .
	 */
	private String merchantNo;

	/**
	 * 商户名称 .
	 */
	private String merchantName;

	/**
	 * 用户编号 .
	 */
	private String memberNo;

	/**
	 * 状态：normal-正常；forbid-禁用；review-审核 .
	 */
	private String state;

	/**
	 * 访问路径 .
	 */
	private String link;

	/**
	 * 广告地址 .
	 */
	private String advLink;

	/**
	 * 广告类型code .
	 */
	private String advTypeCode;

	/**
	 * 广告类型名称 .
	 */
	private String advType;

	/**
	 * 广告来源： .
	 */
	private String source;

	/**
	 * 排序 .
	 */
	private Integer numOrder;

	/**
	 * 备注 .
	 */
	private String remark;

	/**
	 * 创建人 .
	 */
	private String createId;

	/**
	 * 创建时间 .
	 */
	private Date createDate;

	/**
	 * 创建人 .
	 */
	private String updateId;

	/**
	 * 创建时间 .
	 */
	private Date updateDate;

	/**
	 * 广告总价 .
	 */
	private Integer priceSum;

	/**
	 * 点击单价 .
	 */
	private Integer priceClick;

	/**
	 * 展示单价 .
	 */
	private Integer priceView;

	/**
	 * 发布时间 .
	 */
	private Date releaseDate;

	/**
	 * 上架时间 .
	 */
	private Date upDate;

	/**
	 * 下架时间 .
	 */
	private Date downDate;

	/**
	 * 广告状态：no-未上架，up-已上架；down-已下架 .
	 */
	private String advStatus;

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
	 * 员工编号 .
	 *
	 */
	public String getMemberNoGuid() {
		return memberNoGuid;
	}

	/**
	 * 员工编号 .
	 *
	 */
	public void setMemberNoGuid(String memberNoGuid) {
		this.memberNoGuid = memberNoGuid == null ? null : memberNoGuid.trim();
	}

	/**
	 * 员工姓名 .
	 *
	 */
	public String getMemberNameGuid() {
		return memberNameGuid;
	}

	/**
	 * 员工姓名 .
	 *
	 */
	public void setMemberNameGuid(String memberNameGuid) {
		this.memberNameGuid = memberNameGuid == null ? null : memberNameGuid.trim();
	}

	/**
	 * 门诊编号 .
	 *
	 */
	public String getShopNo() {
		return shopNo;
	}

	/**
	 * 门诊编号 .
	 *
	 */
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo == null ? null : shopNo.trim();
	}

	/**
	 * 门诊名称 .
	 *
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * 门诊名称 .
	 *
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
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
	 * 用户编号 .
	 *
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * 用户编号 .
	 *
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo == null ? null : memberNo.trim();
	}

	/**
	 * 状态：normal-正常；forbid-禁用；review-审核 .
	 *
	 */
	public String getState() {
		return state;
	}

	/**
	 * 状态：normal-正常；forbid-禁用；review-审核 .
	 *
	 */
	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	/**
	 * 访问路径 .
	 *
	 */
	public String getLink() {
		return link;
	}

	/**
	 * 访问路径 .
	 *
	 */
	public void setLink(String link) {
		this.link = link == null ? null : link.trim();
	}

	/**
	 * 广告地址 .
	 *
	 */
	public String getAdvLink() {
		return advLink;
	}

	/**
	 * 广告地址 .
	 *
	 */
	public void setAdvLink(String advLink) {
		this.advLink = advLink == null ? null : advLink.trim();
	}

	/**
	 * 广告类型code .
	 *
	 */
	public String getAdvTypeCode() {
		return advTypeCode;
	}

	/**
	 * 广告类型code .
	 *
	 */
	public void setAdvTypeCode(String advTypeCode) {
		this.advTypeCode = advTypeCode == null ? null : advTypeCode.trim();
	}

	/**
	 * 广告类型名称 .
	 *
	 */
	public String getAdvType() {
		return advType;
	}

	/**
	 * 广告类型名称 .
	 *
	 */
	public void setAdvType(String advType) {
		this.advType = advType == null ? null : advType.trim();
	}

	/**
	 * 广告来源： .
	 *
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 广告来源： .
	 *
	 */
	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	/**
	 * 排序 .
	 *
	 */
	public Integer getNumOrder() {
		return numOrder;
	}

	/**
	 * 排序 .
	 *
	 */
	public void setNumOrder(Integer numOrder) {
		this.numOrder = numOrder;
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
	 * 创建人 .
	 *
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * 创建人 .
	 *
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId == null ? null : updateId.trim();
	}

	/**
	 * 创建时间 .
	 *
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 创建时间 .
	 *
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 广告总价 .
	 *
	 */
	public Integer getPriceSum() {
		return priceSum;
	}

	/**
	 * 广告总价 .
	 *
	 */
	public void setPriceSum(Integer priceSum) {
		this.priceSum = priceSum;
	}

	/**
	 * 点击单价 .
	 *
	 */
	public Integer getPriceClick() {
		return priceClick;
	}

	/**
	 * 点击单价 .
	 *
	 */
	public void setPriceClick(Integer priceClick) {
		this.priceClick = priceClick;
	}

	/**
	 * 展示单价 .
	 *
	 */
	public Integer getPriceView() {
		return priceView;
	}

	/**
	 * 展示单价 .
	 *
	 */
	public void setPriceView(Integer priceView) {
		this.priceView = priceView;
	}

	/**
	 * 发布时间 .
	 *
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * 发布时间 .
	 *
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * 上架时间 .
	 *
	 */
	public Date getUpDate() {
		return upDate;
	}

	/**
	 * 上架时间 .
	 *
	 */
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	/**
	 * 下架时间 .
	 *
	 */
	public Date getDownDate() {
		return downDate;
	}

	/**
	 * 下架时间 .
	 *
	 */
	public void setDownDate(Date downDate) {
		this.downDate = downDate;
	}

	/**
	 * 广告状态：no-未上架，up-已上架；down-已下架 .
	 *
	 */
	public String getAdvStatus() {
		return advStatus;
	}

	/**
	 * 广告状态：no-未上架，up-已上架；down-已下架 .
	 *
	 */
	public void setAdvStatus(String advStatus) {
		this.advStatus = advStatus == null ? null : advStatus.trim();
	}

	public Boolean getHasTrack() {
		return hasTrack;
	}

	public void setHasTrack(Boolean hasTrack) {
		this.hasTrack = hasTrack;
	}

	public Integer getNumShow() {
		return numShow;
	}

	public void setNumShow(Integer numShow) {
		this.numShow = numShow;
	}

	public Integer getNumView() {
		return numView;
	}

	public void setNumView(Integer numView) {
		this.numView = numView;
	}

	public String getBeginDateUp() {
		return beginDateUp;
	}

	public void setBeginDateUp(String beginDateUp) {
		this.beginDateUp = beginDateUp;
	}

	public String getEndDateUp() {
		return endDateUp;
	}

	public void setEndDateUp(String endDateUp) {
		this.endDateUp = endDateUp;
	}

	public String getBeginDateDown() {
		return beginDateDown;
	}

	public void setBeginDateDown(String beginDateDown) {
		this.beginDateDown = beginDateDown;
	}

	public String getEndDateDown() {
		return endDateDown;
	}

	public void setEndDateDown(String endDateDown) {
		this.endDateDown = endDateDown;
	}

	/**
	 * 输出BEAN数据信息
	 * 
	 * @author LeoPeng
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carousel [code=").append(code);
		builder.append(",memberNoGuid=").append(memberNoGuid);
		builder.append(",memberNameGuid=").append(memberNameGuid);
		builder.append(",shopNo=").append(shopNo);
		builder.append(",shopName=").append(shopName);
		builder.append(",merchantNo=").append(merchantNo);
		builder.append(",merchantName=").append(merchantName);
		builder.append(",memberNo=").append(memberNo);
		builder.append(",state=").append(state);
		builder.append(",link=").append(link);
		builder.append(",advLink=").append(advLink);
		builder.append(",advTypeCode=").append(advTypeCode);
		builder.append(",advType=").append(advType);
		builder.append(",source=").append(source);
		builder.append(",numOrder=").append(numOrder);
		builder.append(",remark=").append(remark);
		builder.append(",createId=").append(createId);
		builder.append(",createDate=").append(createDate);
		builder.append(",updateId=").append(updateId);
		builder.append(",updateDate=").append(updateDate);
		builder.append(",priceSum=").append(priceSum);
		builder.append(",priceClick=").append(priceClick);
		builder.append(",priceView=").append(priceView);
		builder.append(",releaseDate=").append(releaseDate);
		builder.append(",upDate=").append(upDate);
		builder.append(",downDate=").append(downDate);
		builder.append(",advStatus=").append(advStatus);
		builder.append("]");
		return builder.toString();
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTimeDimension() {
		return timeDimension;
	}

	public void setTimeDimension(String timeDimension) {
		this.timeDimension = timeDimension;
	}

	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

}
