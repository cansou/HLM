package com.lj.business.member.dto;

import com.lj.base.core.pagination.PageParamEntity;

/**
 * 类说明：查询客户提醒
 * <p>
 * <p>
 * <p>
 * 详细描述：
 *
 * @author 武鹏飞
 * <p>
 * CreateDate: 2017年7月22日
 * @Company: 扬恩科技有限公司
 */
public class FindUnContactMember extends PageParamEntity {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 5278547443592756621L;

    /**
     * yizhouYiyue：1周到1月未联系</br>
     * yiyueSanyue：1月到3月未联系</br>
     * sanyueLiuyue：3月到6月未联系</br>
     * liuyueEnd：6月以上未联系
     */
    private String codeUnContact;

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 导购编号
     */
    private String memberNoGm;

    /**
     * 开始日期
     */
    private String startDate;

    /**
     * 结束日期
     */
    private String endDate;
    
    /**
     * 分类code，温情提醒分组需求添加字段
     */
    private String pmTypeCode;
    
    /**
     * 分店编号.
     */
    
    
    public String getPmTypeCode() {
        return pmTypeCode;
    }

    public void setPmTypeCode(String pmTypeCode) {
        this.pmTypeCode = pmTypeCode;
    }

    public String getCodeUnContact() {
        return codeUnContact;
    }

    public void setCodeUnContact(String codeUnContact) {
        this.codeUnContact = codeUnContact;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMemberNoGm() {
        return memberNoGm;
    }

    public void setMemberNoGm(String memberNoGm) {
        this.memberNoGm = memberNoGm;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FindUnContactMember [codeUnContact=");
		builder.append(codeUnContact);
		builder.append(", merchantNo=");
		builder.append(merchantNo);
		builder.append(", memberNoGm=");
		builder.append(memberNoGm);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", pmTypeCode=");
		builder.append(pmTypeCode);
		builder.append("]");
		return builder.toString();
	}

}
