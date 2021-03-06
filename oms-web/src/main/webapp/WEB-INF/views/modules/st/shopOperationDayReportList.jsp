<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>终端运营日报</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//导出
			$("#btnExport").click(function(){
				if(!$("#infolist tr").length){
					alertx("没有数据无法导出!");
					return false;
				}
				top.$.jBox.confirm("确认要导出终端运营日报数据吗？","系统提示",function(v,h,f){
					if(v=="ok"){
						$("#searchForm").attr("action","${ctx}/st/shopOperationDayReport/export?export=1");
						$("#searchForm").submit();
					}
				},{buttonsFocus:1});
			});
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").attr("action","${ctx}/st/shopOperationDayReport");
			$("#searchForm").submit();
        	return false;
        }
	
	</script>
		<style type="text/css">
	.container{
	padding: 10px 30px;
    width: 100%;
    min-height: 800px;
    background: #fff;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
	}
	#contentTable th{
		text-align: center;
		vertical-align: middle;
		border:1px solid grey;!important;
	}
	#contentTable td{
		text-align: right;
		vertical-align: middle;
		border:1px solid grey;!important;
	}
	</style>
</head>
<body>
<div class="container">
	
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/st/shopOperationDayReport">终端运营日报</a></li>
	</ul>
	<form id="searchForm" action="${ctx}/st/shopOperationDayReport" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<c:choose>
				<c:when test="${isShop}">
					<li><label>日期：</label>
						<input id="reportDateBegin" name="reportDateBegin" type="text" readonly="readonly" maxlength="20"  class="input-mini Wdate"
		 				value="<fmt:formatDate value="${findShopOperationDayReportPage.reportDateBegin}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>&nbsp; 
						-&nbsp; <input id="reportDateEnd" name="reportDateEnd" type="text" readonly="readonly" maxlength="20"  class="input-mini Wdate" 
		 				value="<fmt:formatDate value="${findShopOperationDayReportPage.reportDateEnd}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>&nbsp;&nbsp;
					</li>
				</c:when>
				<c:when test="${isCompany}">
					<li><label>日期：</label>
						<input id="reportDateBegin" name="reportDateBegin" type="text" readonly="readonly" maxlength="20"  class="input-mini Wdate"
		 				value="<fmt:formatDate value="${findShopOperationDayReportPage.reportDateBegin}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>&nbsp; 
						-&nbsp; <input id="reportDateEnd" name="reportDateEnd" type="text" readonly="readonly" maxlength="20"  class="input-mini Wdate" 
		 				value="<fmt:formatDate value="${findShopOperationDayReportPage.reportDateEnd}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>&nbsp;&nbsp;
					</li>
					<li><label>终端代码：</label><input type="text" name="shopCode" class="input-medium" maxlength="30" placeholder="终端代码" value="${param.shopCode}"></li>
					<li><label>终端名称：</label><input type="text" name="shopName" class="input-medium" maxlength="80" placeholder="终端名称" value="${param.shopName}"></li>
				</c:when>
				<c:otherwise>
					<li><label>日期：</label>
						<input id="reportDate" name="reportDate" type="text" readonly="readonly" maxlength="20"  class="input-mini Wdate"
		 				value="<fmt:formatDate value="${findShopOperationDayReportPage.reportDate}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/> 
					</li>
					<li><label>经销商代码：</label><input type="text" name="dealerCode" class="input-medium" maxlength="30" placeholder="经销商代码" value="${param.dealerCode}"></li>
					<li><label>经销商名称：</label><input type="text" name="companyName" class="input-medium" maxlength="80" placeholder="经销商名称" value="${param.companyName}"></li>
					<li><label>终端代码：</label><input type="text" name="shopCode" class="input-medium" maxlength="30" placeholder="终端代码" value="${param.shopCode}"></li>
					<li><label>终端名称：</label><input type="text" name="shopName" class="input-medium" maxlength="80" placeholder="终端名称" value="${param.shopName}"></li>
					</ul>
					<ul class="ul-form">
				</c:otherwise>
			</c:choose>
			
			<li class="btns" style="margin-left: 124px;" ><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询" onclick="return page();"/></li>
			<shiro:hasPermission name="st:shopOperationDayReport:view">
			<li class="btns"><input id="btnExport" class="btn btn-primary" type="button" value="导出"/></li>
			</shiro:hasPermission>
			<li class="clearfix"></li>
		</ul> 
	</form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th rowspan="2" >序号</th>
				<th rowspan="2" >日期</th>
				<c:choose>
				<c:when test="${isShop}">
				</c:when>
				<c:when test="${isCompany}">
					<th rowspan="2" >终端代码</th>
					<th rowspan="2" >终端名称</th>
				</c:when>
				<c:otherwise>
					<th rowspan="2">终端代码</th>
					<th rowspan="2">终端名称</th>
					<th rowspan="2">经销商代码</th>
					<th rowspan="2">经销商名称</th>
				</c:otherwise>
				</c:choose>
				<th colspan="2">客户情况</th>
				<th colspan="6">下单情况</th>
				<th colspan="6">成交情况</th>
				<th colspan="4">客户访问情况</th>
				<th>其他</th>
			</tr>
			<tr>
				<th>总客户数</th>
				<th>今日新增</th>
				<th>商品件数</th>
				<th>订单数</th>
				<th>订单总额</th>
				<th>客单价</th>
				<th>优惠总额</th>
				<th >实际支付总额</th>
				<th>商品件数</th>
				<th>订单数</th>
				<th>订单总额</th>
				<th>客单价</th>
				<th>优惠总额</th>
				<th >实际支付总额</th>
				<th>商城主页<br>访问次数</th>
				<th>商城主页<br>访问人数</th>
				<th>商品详情页<br>访问次数</th>
				<th>商品详情页<br>访问人数</th>
				<th>短信数量</th>
			</tr>
		</thead>
		<tbody id="infolist">
		<c:forEach items="${page.list}" var="item" varStatus="number"> 
			<tr>
				<td style="text-align: center;">${number.count}</td>
				<td style="text-align: center;"><fmt:formatDate value="${item.reportDate}" pattern="yyyy-MM-dd"/></td>
				<c:choose>
				<c:when test="${isShop}">
				</c:when>
				<c:when test="${isCompany}">
					<td style="text-align: center;">${item.shopCode}</td>
					<td style="text-align: center;">${item.shopName}</td>
				</c:when>
				<c:otherwise>
					<td style="text-align: center;">${item.shopCode}</td>
					<td style="text-align: center;">${item.shopName}</td>
					<td style="text-align: center;">${item.dealerCode}</td>
					<td style="text-align: center;">${item.companyName}</td>
				</c:otherwise>
				</c:choose>
				<td>${item.mbrTotalCount}</td>
				<td>${item.mbrTodayCount}</td>
				<td>${item.ordGoodCount}</td>
				<td>${item.ordOrderCount}</td>
				<td><fmt:formatNumber value="${item.ordOrderAmount/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.ordCustomerPrice/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.ordActivitieAmount/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.ordPayAmount/100}" type="currency" pattern="#0.00"/></td>
				<td>${item.succGoodCount}</td>
				<td>${item.succOrderCount}</td>
				<td><fmt:formatNumber value="${item.succOrderAmount/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.succCustomerPrice/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.succActivitieAmount/100}" type="currency" pattern="#0.00"/></td>
				<td><fmt:formatNumber value="${item.succPayAmount/100}" type="currency" pattern="#0.00"/></td>
				<td>${item.pvIndexTotalCount}</td>
				<td>${item.pvIndexMemberCount}</td>
				<td>${item.pvDetailTotalCount}</td>
				<td>${item.pvDetailMemberCount}</td>
				<td>${item.smsCount}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	<br>
	<br>
	<br>
	
</div>	
</body>
</html>