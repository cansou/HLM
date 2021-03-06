package com.lj.business.member.dto.company;

import java.io.Serializable;

import com.lj.business.enums.BankCode;

public class AddCompanyBankAccount implements Serializable { 

	private static final long serialVersionUID = -5179312524226393211L;

    /**
     * 分公司编号 .
     */
    private String companyNo;

    /**
     * 分公司名称 .
     */
    private String companyName;

    /**
     * 银行卡号 .
     */
    private String bankcardNo;

    /**
     * 银行CODE .
     */
    private BankCode bankCode;

    /**
     * 客户名称 .
     */
    private String custName;

    /**
     * 开户行所在省CODE
     */
    private String provinceCode;
    
    /**
     * 开户行所在省名称	
     */
    private String provinceName;
    
    /**
     * 开户行所在市CODE
     */
    private String cityCode;
    
    /**
     * 开户行所在市名称
     */
    private String cityName;
    
    /**
     * 开户支行 .
     */
    private String branch;

    /**
     * 默认账户 .
     */
    private boolean isDefault = Boolean.TRUE;

    /**
     * 所属商户编号 .
     */
    private String merchantNo;


	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
     * 分公司编号 .
     *
     */
    public String getCompanyNo() {
        return companyNo;
    }

    /**
     * 分公司编号 .
     *
     */
    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo == null ? null : companyNo.trim();
    }

    /**
     * 分公司名称 .
     *
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 分公司名称 .
     *
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 银行卡号 .
     *
     */
    public String getBankcardNo() {
        return bankcardNo;
    }

    /**
     * 银行卡号 .
     *
     */
    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    /**
     * 银行CODE .
     *
     */
    public BankCode getBankCode() {
        return bankCode;
    }

    /**
     * 银行CODE .
     *
     */
    public void setBankCode(BankCode bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 客户名称 .
     *
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 客户名称 .
     *
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 开户支行 .
     *
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 开户支行 .
     *
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * 默认账户 .
     *
     */
    public boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 默认账户 .
     *
     */
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 所属商户编号 .
     *
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 所属商户编号 .
     *
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddCompanyBankAccount [companyNo=");
		builder.append(companyNo);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", bankcardNo=");
		builder.append(bankcardNo);
		builder.append(", bankCode=");
		builder.append(bankCode);
		builder.append(", custName=");
		builder.append(custName);
		builder.append(", provinceCode=");
		builder.append(provinceCode);
		builder.append(", provinceName=");
		builder.append(provinceName);
		builder.append(", cityCode=");
		builder.append(cityCode);
		builder.append(", cityName=");
		builder.append(cityName);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", isDefault=");
		builder.append(isDefault);
		builder.append(", merchantNo=");
		builder.append(merchantNo);
		builder.append("]");
		return builder.toString();
	}

}
