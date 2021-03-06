/**  
 * All rights Reserved, Designed By www.kehuzhitongche.com
 * @Title:  TreatmentPlanAction.java   
 * @Package com.lj.business.api.controller.hx   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 贾光朝     
 * @date:   2019-10-31 18:14   
 * @version V1.0 
 * @Copyright: 2019 www.tydic.com Inc. All rights reserved. 
 * 注意：本内容仅限于深圳扬恩科技有限公司内部传阅，禁止外泄
 */
package com.lj.business.api.controller.hx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.base.core.pagination.Page;
import com.lj.base.core.util.AssertUtils;
import com.lj.base.core.util.GUID;
import com.lj.base.core.util.StringUtils;
import com.lj.business.api.controller.Action;
import com.lj.business.api.domain.GeneralResponse;
import com.ye.business.hx.dto.FindTreatmentPlanPage;
import com.ye.business.hx.dto.OrthodonticsPlanDto;
import com.ye.business.hx.dto.TreatmentPlanDto;
import com.ye.business.hx.service.IOrthodonticsPlanService;
import com.ye.business.hx.service.ITreatmentPlanService;

/**
 * @ClassName: TreatmentPlanAction
 * @Description:TODO(治疗计划)
 * @author: 贾光朝
 * @date: 2019-10-31 18:14
 * 
 * @Copyright: 2019 www.kehuzhitongche.com Inc. All rights reserved.
 *             注意：本内容仅限于深圳扬恩科技有限公司内部传阅，禁止外泄
 */
@Controller
@RequestMapping(value = "/hx/treatmentPlan")
public class TreatmentPlanAction extends Action {

	@Resource
	private ITreatmentPlanService treatmentPlanService;

	@Resource
	private IOrthodonticsPlanService orthodonticsPlanService;

	@ResponseBody
	@RequestMapping(value = "/add.do", produces = "application/json; charset=UTF-8")
	public GeneralResponse add(TreatmentPlanDto treatmentPlanDto) {
		treatmentPlanDto.setCode(GUID.generateByUUID());
		treatmentPlanDto.setCreateDate(new Date());
		treatmentPlanService.addTreatmentPlan(treatmentPlanDto);
		return GeneralResponse.generateSuccessResponse();
	}

	@ResponseBody
	@RequestMapping(value = "/edit.do", produces = "application/json; charset=UTF-8")
	public GeneralResponse edit(TreatmentPlanDto treatmentPlanDto) {
		AssertUtils.notNullAndEmpty(treatmentPlanDto.getCode(), "code不能为空!");
		treatmentPlanService.updateTreatmentPlan(treatmentPlanDto);
		return GeneralResponse.generateSuccessResponse();
	}

	@ResponseBody
	@RequestMapping(value = "/del.do", produces = "application/json; charset=UTF-8")
	public GeneralResponse delete(TreatmentPlanDto treatmentPlanDto) {
		AssertUtils.notNullAndEmpty(treatmentPlanDto.getCode(), "code不能为空!");
		treatmentPlanService.delete(treatmentPlanDto);
		return GeneralResponse.generateSuccessResponse();
	}

	@ResponseBody
	@RequestMapping(value = "/get.do", produces = "application/json; charset=UTF-8")
	public GeneralResponse get(TreatmentPlanDto treatmentPlanDto) {
		AssertUtils.notNullAndEmpty(treatmentPlanDto.getStep(), "step不能为空!");
		List<OrthodonticsPlanDto> list = new ArrayList<>();
		String[] codes = treatmentPlanDto.getStep().split(",");
		for (String code : codes) {
			OrthodonticsPlanDto orthodonticsPlanDto = new OrthodonticsPlanDto();
			orthodonticsPlanDto.setCode(code);
			orthodonticsPlanDto.setPatientNo(treatmentPlanDto.getPatientNo());
			OrthodonticsPlanDto findOrthodonticsPlan = orthodonticsPlanService
					.findOrthodonticsPlan(orthodonticsPlanDto);
			list.add(findOrthodonticsPlan);
		}
		return GeneralResponse.generateSuccessResponse(list);
	}

	@ResponseBody
	@RequestMapping(value = "/list.do", produces = "application/json; charset=UTF-8")
	public GeneralResponse list(FindTreatmentPlanPage findTreatmentPlanPage, TreatmentPlanDto param) {
		AssertUtils.notNullAndEmpty(param);
		findTreatmentPlanPage.setParam(param);
		Page<TreatmentPlanDto> page = treatmentPlanService.findTreatmentPlanPage(findTreatmentPlanPage);
		return GeneralResponse.generateSuccessResponse(page);
	}
}
