package com.ye.business.hx.service;

/**
 * Copyright &copy; 2017-2020  All rights reserved.
 *
 * Licensed under the 深圳市扬恩科技 License, Version 1.0 (the "License");
 * 
 */
import com.ye.business.hx.dto.ShopOrderDto;
import com.ye.business.hx.dto.FindShopOrderPage;


import com.lj.base.core.pagination.Page;
import com.lj.base.exception.TsfaServiceException;

import java.util.List;
/**
 * 类说明：接口类
 * 
 * 
 * <p>
 * 详细描述：.
 *
 * @author lhy
 * 
 * 
 * CreateDate: 2019.02.19
 */
public interface IShopOrderService {
	
	/**
	 * 
	 *
	 * 方法说明：添加门店订单信息
	 *
	 * @param shopOrderDto
	 * @return
	 * @throws TsfaServiceException
	 *
	 * @author lhy CreateDate: 2019-03-08
	 *
	 */
	public ShopOrderDto addShopOrder(ShopOrderDto shopOrderDto) throws TsfaServiceException;
	
	/**
	 * 
	 *
	 * 方法说明：查找门店订单信息
	 *
	 * @param findShopOrder
	 * @return
	 * @throws TsfaServiceException
	 *
	 * @author lhy CreateDate: 2019-03-08
	 *
	 */
	public ShopOrderDto findShopOrder(ShopOrderDto shopOrderDto) throws TsfaServiceException;
	
	
	/**
	 * 
	 *
	 * 方法说明：不分页查询门店订单信息
	 *
	 * @param findShopOrderPage
	 * @return
	 * @throws TsfaServiceException
	 *
	 * @author lhy CreateDate: 2019-03-08
	 *
	 */
	public List<ShopOrderDto>  findShopOrders(FindShopOrderPage findShopOrderPage)throws TsfaServiceException;

	/**
	 * 
	 *
	 * 方法说明：修改门店订单信息
	 *
	 * @param updateShopOrder
	 * @return
	 * @throws TsfaServiceException
	 *
	 * @author lhy CreateDate: 2019-03-08
	 *
	 */
	public void updateShopOrder(ShopOrderDto shopOrderDto)throws TsfaServiceException;

	/**
	 * 
	 *
	 * 方法说明：分页查询门店订单信息
	 *
	 * @param findShopOrderPage
	 * @return
	 * @throws TsfaServiceException
	 *
	 * @author lhy CreateDate: 2019-03-08
	 *
	 */
	public Page<ShopOrderDto> findShopOrderPage(FindShopOrderPage findShopOrderPage) throws TsfaServiceException;
	

}
