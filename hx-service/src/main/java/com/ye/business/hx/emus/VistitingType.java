package com.ye.business.hx.emus;

/**
 * 类说明：就诊类型
 * 
 * @Company: 扬恩科技有限公司
 * @author sjiying CreateDate: 2019年03月08日
 *
 */
public enum VistitingType {

	NEWDIAGNOSIS("初诊"),

	REVIEW("复诊");

	VistitingType(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
