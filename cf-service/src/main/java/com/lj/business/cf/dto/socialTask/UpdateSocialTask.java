package com.lj.business.cf.dto.socialTask;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class UpdateSocialTask.
 */
public class UpdateSocialTask implements Serializable { 

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2458030171386671367L;

	/**
     * CODE .
     */
    private String code;

    /**
     * 商户编号 .
     */
    private String merchantNo;

    /**
     * 分店编号 .
     */
    private String shopNo;

    /**
     * 分店名称 .
     */
    private String shopName;

    /**
     * 导购编号 .
     */
    private String memberNoGm;

    /**
     * 导购姓名 .
     */
    private String memberNameGm;

    /**
     * 项目CODE .
     */
    private String codeList;

    /**
     * 项目名称 .
     */
    private String nameList;

    /**
     * 客户编号 .
     */
    private String memberNo;

    /**
     * 客户名称 .
     */
    private String memberName;

    /**
     * 工作日期 .
     */
    private Date workDate;
    
    /**
     * 工作完成日期 .
     */
    private Date workFinishDate;

    /**
     * 工作是否完成
             是：Y
             否：N .
     */
    private String finish;
    
    /**
     * 任务动作
		去评论：COMMENTING
		已评论：COMMENTED
		去回复：REPLY.
     */
    private String actionTask;

    /**
     * 未完成原因 .
     */
    private String reason;

    /**
     * 朋友圈ID .
     */
    private String idWx;

    /**
     * 朋友圈更新时间 .
     */
    private Date friendUpdateDate;

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
	 * Gets the 分店编号 .
	 *
	 * @return the 分店编号 
	 */
	public String getShopNo() {
		return shopNo;
	}

	/**
	 * Sets the 分店编号 .
	 *
	 * @param shopNo the new 分店编号 
	 */
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	/**
	 * Gets the 分店名称 .
	 *
	 * @return the 分店名称 
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * Sets the 分店名称 .
	 *
	 * @param shopName the new 分店名称 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	 * Gets the 项目CODE .
	 *
	 * @return the 项目CODE 
	 */
	public String getCodeList() {
		return codeList;
	}

	/**
	 * Sets the 项目CODE .
	 *
	 * @param codeList the new 项目CODE 
	 */
	public void setCodeList(String codeList) {
		this.codeList = codeList;
	}

	/**
	 * Gets the 项目名称 .
	 *
	 * @return the 项目名称 
	 */
	public String getNameList() {
		return nameList;
	}

	/**
	 * Sets the 项目名称 .
	 *
	 * @param nameList the new 项目名称 
	 */
	public void setNameList(String nameList) {
		this.nameList = nameList;
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
	 * Gets the 工作日期 .
	 *
	 * @return the 工作日期 
	 */
	public Date getWorkDate() {
		return workDate;
	}

	public Date getWorkFinishDate() {
		return workFinishDate;
	}

	public void setWorkFinishDate(Date workFinishDate) {
		this.workFinishDate = workFinishDate;
	}

	/**
	 * Sets the 工作日期 .
	 *
	 * @param workDate the new 工作日期 
	 */
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	/**
	 * Gets the 工作是否完成 是：Y 否：N .
	 *
	 * @return the 工作是否完成 是：Y 否：N 
	 */
	public String getFinish() {
		return finish;
	}

	/**
	 * Sets the 工作是否完成 是：Y 否：N .
	 *
	 * @param finish the new 工作是否完成 是：Y 否：N 
	 */
	public void setFinish(String finish) {
		this.finish = finish;
	}

	/**
	 * Gets the 未完成原因 .
	 *
	 * @return the 未完成原因 
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the 未完成原因 .
	 *
	 * @param reason the new 未完成原因 
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * Gets the 朋友圈ID .
	 *
	 * @return the 朋友圈ID 
	 */
	public String getIdWx() {
		return idWx;
	}

	/**
	 * Sets the 朋友圈ID .
	 *
	 * @param idWx the new 朋友圈ID 
	 */
	public void setIdWx(String idWx) {
		this.idWx = idWx;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateSocialTask [code=").append(code)
				.append(", merchantNo=").append(merchantNo).append(", shopNo=")
				.append(shopNo).append(", shopName=").append(shopName)
				.append(", memberNoGm=").append(memberNoGm)
				.append(", memberNameGm=").append(memberNameGm)
				.append(", codeList=").append(codeList).append(", nameList=")
				.append(nameList).append(", memberNo=").append(memberNo)
				.append(", memberName=").append(memberName)
				.append(", workDate=").append(workDate)
				.append(", workFinishDate=").append(workFinishDate)
				.append(", finish=")
				.append(finish).append(", actionTask=").append(actionTask)
				.append(", reason=").append(reason).append(", idWx=")
				.append(idWx).append(", friendUpdateDate=")
				.append(friendUpdateDate).append(", remark4=").append(remark4)
				.append(", remark3=").append(remark3).append(", remark2=")
				.append(remark2).append(", remark=").append(remark).append("]");
		return builder.toString();
	}

	/**
	 * Gets the 任务动作 去评论：COMMENTING 已评论：COMMENTED 去回复：REPLY.
	 *
	 * @return the 任务动作 去评论：COMMENTING 已评论：COMMENTED 去回复：REPLY
	 */
	public String getActionTask() {
		return actionTask;
	}

	/**
	 * Sets the 任务动作 去评论：COMMENTING 已评论：COMMENTED 去回复：REPLY.
	 *
	 * @param actionTask the new 任务动作 去评论：COMMENTING 已评论：COMMENTED 去回复：REPLY
	 */
	public void setActionTask(String actionTask) {
		this.actionTask = actionTask;
	}

	/**
	 * Gets the 朋友圈更新时间 .
	 *
	 * @return the 朋友圈更新时间 
	 */
	public Date getFriendUpdateDate() {
		return friendUpdateDate;
	}

	/**
	 * Sets the 朋友圈更新时间 .
	 *
	 * @param friendUpdateDate the new 朋友圈更新时间 
	 */
	public void setFriendUpdateDate(Date friendUpdateDate) {
		this.friendUpdateDate = friendUpdateDate;
	}
}
