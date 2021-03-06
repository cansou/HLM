package com.lj.business.member.domain;

import java.util.Date;

/**
 * 类说明：客户标签关联表
 * 
 * 
 * <p>
 * 详细描述：
 * 
 *
 * @author 邹磊
 * 
 *         CreateDate: 2017年7月12日
 * @Company: 扬恩科技有限公司
 */
public class PmLabelPm {

	/**
	 * 会员号 .
	 */
	private String memberNo;

	/**
	 * 会员标签CODE .
	 */
	private String pmLabelCode;
	/**
	 * 会员标签名称 .
	 */
	private String pmLabelName;

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
	 * 终端微信
	 */
	private String shopWx;

	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getShopWx() {
		return shopWx;
	}

	public void setShopWx(String shopWx) {
		this.shopWx = shopWx;
	}

	public String getPmLabelName() {
		return pmLabelName;
	}

	public void setPmLabelName(String pmLabelName) {
		this.pmLabelName = pmLabelName;
	}

	/**
	 * 会员号 .
	 *
	 * @return the member no
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * 会员号 .
	 *
	 * @param memberNo the new member no
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo == null ? null : memberNo.trim();
	}

	/**
	 * 会员标签CODE .
	 *
	 * @return the pm label code
	 */
	public String getPmLabelCode() {
		return pmLabelCode;
	}

	/**
	 * 会员标签CODE .
	 *
	 * @param pmLabelCode the new pm label code
	 */
	public void setPmLabelCode(String pmLabelCode) {
		this.pmLabelCode = pmLabelCode == null ? null : pmLabelCode.trim();
	}

	/**
	 * 创建时间 .
	 *
	 * @return the creates the date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 创建时间 .
	 *
	 * @param createDate the new creates the date
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 备注 .
	 *
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注 .
	 *
	 * @param remark the new remark
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * 备注 .
	 *
	 * @return the remark 2
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * 备注 .
	 *
	 * @param remark2 the new remark 2
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2 == null ? null : remark2.trim();
	}

	/**
	 * 备注 .
	 *
	 * @return the remark 3
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * 备注 .
	 *
	 * @param remark3 the new remark 3
	 */
	public void setRemark3(String remark3) {
		this.remark3 = remark3 == null ? null : remark3.trim();
	}

	/**
	 * 备注 .
	 *
	 * @return the remark 4
	 */
	public String getRemark4() {
		return remark4;
	}

	/**
	 * 备注 .
	 *
	 * @param remark4 the new remark 4
	 */
	public void setRemark4(String remark4) {
		this.remark4 = remark4 == null ? null : remark4.trim();
	}

	@Override
	public String toString() {
		return "PmLabelPm [memberNo=" + memberNo + ", pmLabelCode=" + pmLabelCode + ", pmLabelName=" + pmLabelName
				+ ", createDate=" + createDate + ", remark=" + remark + ", remark2=" + remark2 + ", remark3=" + remark3
				+ ", remark4=" + remark4 + ", shopWx=" + shopWx + ", type=" + type + "]";
	}

}