package com.lj.business.member.dto;

import java.io.Serializable;
import java.util.List;

/**
 * The Class FindPmWxBpInfo.
 */
public class FindPmWxInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7967228816554861095L;


	/**
	 * 商户编号(必填) .
	 */
	private String merchantNo;

	/**
	 * 导购编号(必填) .
	 */
	private String memberNoGm;

	/**
	 * 客户编号(必填) .
	 */
	private List<String> memberNoAr;
	
	/**
     * 微信OPENID,存储用于对外接口返回
     */
    private String wxOpenId;

	/**
	 * Gets the 商户编号(必填) .
	 *
	 * @return the 商户编号(必填) 
	 */
	public String getMerchantNo() {
		return merchantNo;
	}

	/**
	 * Sets the 商户编号(必填) .
	 *
	 * @param merchantNo the new 商户编号(必填) 
	 */
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	/**
	 * Gets the 导购编号(必填) .
	 *
	 * @return the 导购编号(必填) 
	 */
	public String getMemberNoGm() {
		return memberNoGm;
	}

	/**
	 * Sets the 导购编号(必填) .
	 *
	 * @param memberNoGm the new 导购编号(必填) 
	 */
	public void setMemberNoGm(String memberNoGm) {
		this.memberNoGm = memberNoGm;
	}

	/**
	 * Gets the 客户编号(必填) .
	 *
	 * @return the 客户编号(必填) 
	 */
	public List<String> getMemberNoAr() {
		return memberNoAr;
	}

	/**
	 * Sets the 客户编号(必填) .
	 *
	 * @param memberNoAr the new 客户编号(必填) 
	 */
	public void setMemberNoAr(List<String> memberNoAr) {
		this.memberNoAr = memberNoAr;
	}
	
	/**
     * 微信OPENID,存储用于对外接口返回
     */
	public String getWxOpenId() {
		return wxOpenId;
	}
	/**
     * 微信OPENID,存储用于对外接口返回
     */
	public void setWxOpenId(String wxOpenId) {
		this.wxOpenId = wxOpenId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FindPmWxBpInfo [merchantNo=").append(merchantNo)
				.append(", memberNoGm=").append(memberNoGm)
				.append(", memberNoAr=").append(memberNoAr)
				.append(", wxOpenId=").append(wxOpenId)
				.append("]");
		return builder.toString();
	}

	

}
