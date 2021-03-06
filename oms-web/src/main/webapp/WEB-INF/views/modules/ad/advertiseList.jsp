<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>广告管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			var repMsg=$("#repMsg").val();
			if(repMsg){
				showTip(repMsg);
				$("#repMsg").val("");
			}
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
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
	</style>
</head>
<body>
<div class="container">
	<input id="repMsg" name="repMsg" style="display:none" value="${repMsg}"/>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/ad/advertise/">广告列表</a></li>		
		<li><a href="${ctx}/ad/advertise/form">广告添加</a></li>	
	</ul>
	<form id="searchForm" action="${ctx}/ad/advertise/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li>
				<label>来源：</label>
				<input type="text" name="source" class="input-medium" value="${findAdvertisePage.param.source}" maxlength="200" placeholder="来源">
			</li>
			<li>
				<label>广告分类：</label>
				<select style="width: 177px;" name="advTypeCode">
                    <option value="">全部</option>
                    <c:forEach items="${findAdvertiseTypeList }" var="item">
                    	<option value="${item.code }" ${item.code eq findAdvertisePage.param.advTypeCode ? 'selected="selected"' : '' }>${item.typeName }</option>
                    </c:forEach>
                </select>
			</li>
			<li>
				<label>广告类型：</label>
				<select style="width: 177px;" name="type">
                    <option value="">全部</option>
                    <option value="pay" ${'pay' eq findAdvertisePage.param.advState ? 'selected="selected"' : '' }>互助广告</option>
                    <option value="free" ${'free' eq findAdvertisePage.param.advState ? 'selected="selected"' : '' }>自助广告</option>
                </select>
			</li>
			<li>
				<label>状态：</label>
				<select style="width: 177px;" name="state">
                    <option value="">全部</option>
                    <option value="normal" ${'normal' eq findAdvertisePage.param.state ? 'selected="selected"' : '' }>正常</option>
                    <option value="forbid" ${'forbid' eq findAdvertisePage.param.state ? 'selected="selected"' : '' }>禁用</option>
                    <option value="review" ${'review' eq findAdvertisePage.param.state ? 'selected="selected"' : '' }>审核</option>
                </select>
			</li>
			<li>
				<label>广告状态：</label>
				<select style="width: 177px;" name="advStatus">
                    <option value="">全部</option>
                    <option value="no" ${'no' eq findAdvertisePage.param.advStatus ? 'selected="selected"' : '' }>未上架</option>
                    <option value="up" ${'up' eq findAdvertisePage.param.advStatus ? 'selected="selected"' : '' }>已上架</option>
                    <option value="down" ${'down' eq findAdvertisePage.param.advStatus ? 'selected="selected"' : '' }>已下架</option>
                </select>
			</li>
			<li>
				<label>是否显示展示次数：</label>
				<select style="width: 177px;" name="hasTrack">
                    <option value="true" ${findAdvertisePage.param.hasTrack ? 'selected="selected"' : '' }>是</option>
                    <option value="false" ${!findAdvertisePage.param.hasTrack ? 'selected="selected"' : '' }>否</option>
                </select>
			</li>
			<li>
				<label>上架时间：</label>
				<input id="beginDateUp" name="beginDateUp" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate"
				value="${findAdvertisePage.param.beginDateUp}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>
				-- 
				<input id="endDateUp" name="endDateUp" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate"
				value="${findAdvertisePage.param.endDateUp}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"
				/>
			</li>
			<li>
				<label>下架时间：</label>
				<input id="beginDateDown" name="beginDateDown" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate"
				value="${findAdvertisePage.param.beginDateDown}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>
				-- 
				<input id="endDateDown" name="endDateDown" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate"
				value="${findAdvertisePage.param.endDateDown}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"
				/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>会员ID</th>
				<th>客户姓名（备注）</th>
				<th>手机号</th>
				<th>会员类型</th>
				<th>所在地区</th>
				<th>广告分类</th>
				<th>广告类型</th>
				<th>显示单价</th>
				<th>点击单价</th>
				<th>总价</th>
				<th>剩余广告豆</th>
				<th>广告图</th>
				<th>广告链接</th>
				<th>广告状态</th>
				<th>状态</th>
				<c:if test="${findAdvertisePage.param.hasTrack }">
					<th>显示次数</th>
					<th>点击次数</th>
				</c:if>
				<th>排序</th>
				<th>发布时间</th>
				<th>上架时间</th>
				<th>下架时间</th>
				<th>操作人</th>
				<shiro:hasPermission name="ad:advertise:edit">
				<th>操作</th>
				</shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="item" varStatus="number">
			<c:set var="rwUserMap" value="${findRwUserMap[item.memberNoGuid] }" /> 
			<c:set var="guidMemberPageReturnMap" value="${findGuidMemberPageReturnMap[item.memberNoGuid] }" /> 
			<tr>
				<c:choose>
					<c:when test="${not empty guidMemberPageReturnMap }">
						<td>${guidMemberPageReturnMap.memberNo }</td>
						<td>${guidMemberPageReturnMap.memberName }</td>
						<td>${guidMemberPageReturnMap.mobile }</td>
						<td>商户</td>
						<td>${guidMemberPageReturnMap.areaName }</td>	
					</c:when>
					<c:when test="${not empty rwUserMap }">
						<td>${rwUserMap.memberNoGuid }</td>
						<td>${rwUserMap.nickName }</td>
						<td>${rwUserMap.mobile }</td>
						<td>${rwUserMap.userLevel eq '1' ? '普通用户' : rwUserMap.userLevel eq '2' ? '个体用户' : rwUserMap.userLevel eq '3' ? '商户' : '其他' }</td>
						<td>${rwUserMap.areaName }</td>	
					</c:when>
					<c:otherwise>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</c:otherwise>
				</c:choose>
				<td>${item.advType }</td>
				<td>${item.advState eq 'pay' ? '互助广告' : item.advState eq 'free' ? '自助广告' : '' }</td>
				<td>${item.priceView }</td>
				<td>${item.priceClick }</td>
				<td>${item.priceSum }</td>
				<td>${item.shopNo }</td>
				<td>
					<c:choose>
						<c:when test="${'video' eq item.type }">
							<video src="${item.link }" controls="controls" width="500" height="200"></video>
						</c:when>
						<c:when test="${'image' eq item.type }">
							<img alt="${item.link }" src="${item.link }" width="150" height="150">
						</c:when>
						<c:otherwise>其它</c:otherwise>
					</c:choose>
				</td>
				<td>${item.advLink }</td>
				<td>${item.advStatus eq 'no' ? '未上架' : item.advStatus eq 'up' ? '已上架' : item.advStatus eq 'down' ? '已下架' : '' }</td>
				<td>${'normal' eq item.state ? '正常' : 'forbid' eq item.state ? '禁用' : 'review' eq item.state ? '审核' : '' }</td>
				<c:if test="${findAdvertisePage.param.hasTrack }">
					<td>${item.numShow }</td>
					<td>${item.numView }</td>
				</c:if>
				<td>${item.numOrder }</td>
				<td nowrap><fmt:formatDate value="${item.releaseDate }" pattern="yyyy-MM-dd HH:mm"/></td>
				<td nowrap><fmt:formatDate value="${item.upDate }" pattern="yyyy-MM-dd HH:mm"/></td>
				<td nowrap><fmt:formatDate value="${item.downDate }" pattern="yyyy-MM-dd"/></td>
				<td>${item.updateId }</td>
				<shiro:hasPermission name="ad:advertise:edit">		
				<td>
					<a href="${ctx}/ad/advertise/form?code=${item.code}">修改</a>
					<a href="${ctx}/ad/advertise/delete?code=${item.code}" onclick="return confirmx('确认要删除该广告吗？', this.href)">删除</a>
				</td>
				</shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	</div>
</body>
</html>