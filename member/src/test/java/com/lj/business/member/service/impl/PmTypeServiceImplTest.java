package com.lj.business.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.lj.base.core.pagination.Page;
import com.lj.base.exception.TsfaServiceException;
import com.lj.base.mvc.web.test.SpringTestCase;
import com.lj.business.member.dto.AddPmType;
import com.lj.business.member.dto.CheckPmTypeDto;
import com.lj.business.member.dto.DelPmType;
import com.lj.business.member.dto.FindPmType;
import com.lj.business.member.dto.FindPmTypeIndex;
import com.lj.business.member.dto.FindPmTypeIndexReturn;
import com.lj.business.member.dto.FindPmTypePage;
import com.lj.business.member.dto.FindPmTypePageReturn;
import com.lj.business.member.dto.UpdatePmType;
import com.lj.business.member.service.IPmTypeService;
import com.lj.business.member.util.TestHelp;


/**
 * 类说明：测试类
 * 
 * 
 * <p>
 * 详细描述：.
 *
 * @author 彭阳
 * 
 * 
 * CreateDate: 2017-06-14
 */
public class PmTypeServiceImplTest extends SpringTestCase{

	@Resource
	private IPmTypeService pmTypeService;
	
	/**
	 * 
	 *
	 * 方法说明：添加客户分类表信息
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年6月10日
	 *
	 */
	@Test
	public void addPmType() throws TsfaServiceException{
		AddPmType addPmType = new AddPmType();
		//add数据录入
		addPmType.setMerchantNo("MerchantNo");
		addPmType.setMemberNo("MemberNo");
		addPmType.setMemberName("MemberName");
		addPmType.setTypeName("TypeName");
		addPmType.setPmTypeType("PmTypeType");
		addPmType.setStatus("1");
		addPmType.setCreateId("CreateId");
		addPmType.setRemark("Remark");
		addPmType.setRemark2("Remark2");
		addPmType.setRemark3("Remark3");
		addPmType.setRemark4("Remark4");
		
		Assert.assertNotNull(pmTypeService.addPmType(addPmType ));
		
	}
	
	/**
	 * 
	 *
	 * 方法说明：修改客户分类表信息
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年6月10日
	 *
	 */
	@Test
	public void updatePmType() throws TsfaServiceException{
		UpdatePmType updatePmType = new UpdatePmType();
		//update数据录入
		updatePmType.setCode("Code");
		updatePmType.setMerchantNo("MerchantNo");
		updatePmType.setMemberNo("MemberNo");
		updatePmType.setMemberName("MemberName");
		updatePmType.setTypeName("TypeName");
		updatePmType.setPmTypeType("PmTypeType");
		updatePmType.setStatus("Status");
		updatePmType.setRemark("Remark");
		updatePmType.setRemark2("Remark2");
		updatePmType.setRemark3("Remark3");
		updatePmType.setRemark4("Remark4");

		pmTypeService.updatePmType(updatePmType );
		
	}
	
	/**
	 * 
	 *
	 * 方法说明：查找客户分类表信息
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年6月10日
	 *
	 */
	@Test
	public void findPmType() throws TsfaServiceException{
		FindPmType findPmType = new FindPmType();
		findPmType.setCode("");
		pmTypeService.findPmType(findPmType);
	}
	
	
	@Test
	public void checkPmType() throws TsfaServiceException{
		CheckPmTypeDto checkPmTypeDto = new CheckPmTypeDto();
		checkPmTypeDto.setMemberNo("c37754c450fc4ec6959a97cf6473cbc4");
		checkPmTypeDto.setMemberNoGm("d7b963349b8f4bcbbed9a36fe41ae626");
		checkPmTypeDto.setMerchantNo("e79d975846ee41ba8c3c55738fda66a9");
		pmTypeService.checkPmType(checkPmTypeDto);
	}
	
	
	/**
	 * 
	 *
	 * 方法说明：查找客户分类表信息
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年6月10日
	 *
	 */
	@Test
	public void findPmTypePage() throws TsfaServiceException{
		FindPmTypePage findPmTypePage = new FindPmTypePage();
		Page<FindPmTypePageReturn> page = pmTypeService.findPmTypePage(findPmTypePage);
		Assert.assertNotNull(page);
		
	}
	
	/**
	 * 
	 *
	 * 方法说明：删除客户分类表信息
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年6月10日
	 *
	 */
	@Test
	public void delPmType() throws TsfaServiceException{
		DelPmType delPmType = new DelPmType();
		delPmType.setCode("");
		Assert.assertNotNull(pmTypeService.delPmType(delPmType));
		
	}
	@Test
	public void findLists() throws TsfaServiceException{
		FindPmTypePageReturn findPmTypePageReturn=new FindPmTypePageReturn();
		pmTypeService.findPmTypePages(findPmTypePageReturn);
	}
	
	
	/**
	 * 
	 *
	 * 方法说明：客户管理首页：分类信息查询
	 *
	 * @throws TsfaServiceException
	 *
	 * @author 彭阳 CreateDate: 2017年7月10日
	 *
	 */
	@Test
	public void findPmTypeIndex() throws TsfaServiceException{
		FindPmTypeIndex findPmTypeIndex = new FindPmTypeIndex();
		//findPmTypeIndex.setMemberNoGm(TestHelp.memberNoGm_test);
		findPmTypeIndex.setMerchantNo(TestHelp.merchantNo_test);
//		findPmTypeIndex.setShopNo(TestHelp.shopNo_test);
		List<FindPmTypeIndexReturn> page = pmTypeService.findPmTypeIndex(findPmTypeIndex);
		Assert.assertNotNull(page);
	}
	
	
}
