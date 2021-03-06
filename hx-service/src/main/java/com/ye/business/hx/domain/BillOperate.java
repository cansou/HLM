package com.ye.business.hx.domain;

import java.util.Date;

public class BillOperate {
    /** CODE*/
    private String code;

    /** 账单code*/
    private String billCode;

    /** 操作类型（PAY收费，DEBT：收欠费，REFUND退款）*/
    private String operateType;

    /** 状态（INIT待处理，FINISH已处理，CANCEL取消）*/
    private String status;

    /** 进度（UNCHECK待审核，UNPAY待收费，UNREFUND待退费，FINISH已处理）*/
    private String process;

    /** 审核状态（UNCHECK待审核，PASS已批准，UNPASS已拒绝）*/
    private String checkStatus;

    /** 操作人编号*/
    private String memberNoGuid;

    /** 操作人姓名*/
    private String memberNameGuid;

    /** 审核人编号*/
    private String checkerNoGuid;

    /** 审核人姓名*/
    private String checkerNameGuid;

    /** 申请时间*/
    private Date applyTime;

    /** 审批时间*/
    private Date checkTime;

    /** 支付方式*/
    private String payType;

    /** 支付方式描述*/
    private String payTypeName;

    /** 支付方式及其金额（格式：PAY_TYPE1:支付金额2,PAY_TYPE1:支付金额2）*/
    private String payRemark;

    /** 费用金额（分为单位）*/
    private Long payAmount;

    /** 收费时间*/
    private Date payTime;

    /** 收费人编号*/
    private String recieverNo;

    /** 收费人姓名*/
    private String recieverName;

    /** 账单原欠费总金额（分为单位）*/
    private Long originalAmount;

    /** 还款折扣后应收金额（分为单位）*/
    private Long reallyAmount;

    /** 还款折扣(万分比，如8折则值为8000）*/
    private Integer discountNum;

    /** 还款后账单剩余欠费总金额（分为单位）*/
    private Long debtAmount;
    
    /** 账单已收总额(账单收费总额-账单已退总额）*/
    private Long billPayAmount;
    
    /** 更新人*/
    private String updateId;

    /** 更新时间*/
    private Date updateDate;

    /** 创建人*/
    private String createId;

    /** 创建时间*/
    private Date createDate;

    /** 备注*/
    private String remark;

    /** 备注1*/
    private String remark1;

    /** 备注2*/
    private String remark2;

    /** 备注3*/
    private String remark3;

    /** 备注4*/
    private String remark4;

    /** 退款类型（ALL:整单退，ITEM：按项目数量退，PART:退一部分金额）*/
    private String refundType;
    /** 门诊编号*/
    private String shopNo;

    /** 门诊名称*/
    private String shopName;

    /** 商户编号*/
    private String merchantNo;

    /** 商户名称*/
    private String merchantName;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getMemberNoGuid() {
        return memberNoGuid;
    }

    public void setMemberNoGuid(String memberNoGuid) {
        this.memberNoGuid = memberNoGuid == null ? null : memberNoGuid.trim();
    }

    public String getMemberNameGuid() {
        return memberNameGuid;
    }

    public void setMemberNameGuid(String memberNameGuid) {
        this.memberNameGuid = memberNameGuid == null ? null : memberNameGuid.trim();
    }

    public String getCheckerNoGuid() {
        return checkerNoGuid;
    }

    public void setCheckerNoGuid(String checkerNoGuid) {
        this.checkerNoGuid = checkerNoGuid == null ? null : checkerNoGuid.trim();
    }

    public String getCheckerNameGuid() {
        return checkerNameGuid;
    }

    public void setCheckerNameGuid(String checkerNameGuid) {
        this.checkerNameGuid = checkerNameGuid == null ? null : checkerNameGuid.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName == null ? null : payTypeName.trim();
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark == null ? null : payRemark.trim();
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getRecieverNo() {
        return recieverNo;
    }

    public void setRecieverNo(String recieverNo) {
        this.recieverNo = recieverNo == null ? null : recieverNo.trim();
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName == null ? null : recieverName.trim();
    }

    public Long getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Long originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Long getReallyAmount() {
        return reallyAmount;
    }

    public void setReallyAmount(Long reallyAmount) {
        this.reallyAmount = reallyAmount;
    }

    public Integer getDiscountNum() {
        return discountNum;
    }

    public void setDiscountNum(Integer discountNum) {
        this.discountNum = discountNum;
    }

    public Long getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Long debtAmount) {
        this.debtAmount = debtAmount;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType == null ? null : refundType.trim();
    }

	public String getShopNo() {
		return shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Long getBillPayAmount() {
		return billPayAmount;
	}

	public void setBillPayAmount(Long billPayAmount) {
		this.billPayAmount = billPayAmount;
	}
    
}