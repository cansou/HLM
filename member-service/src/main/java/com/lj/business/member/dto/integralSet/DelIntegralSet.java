package com.lj.business.member.dto.integralSet;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class DelIntegralSet.
 */
public class DelIntegralSet implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5465023962473466712L; 
	
	/** The code. */
	private String code;

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DelIntegralSet [code=").append(code).append("]");
		return builder.toString();
	}
	
}
