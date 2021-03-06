<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>文本库</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		//是否包含字符串
		function isContains(str, substr) {
		    return str.indexOf(substr) >= 0;
		}
	
		$(document).ready(function() {
			var repMsg=$("#repMsg").val();
			if(repMsg){
				if(isContains(repMsg,"成功")&& (isContains(repMsg,"保存")||isContains(repMsg,"编辑"))){
					window.parent.frames[0].location.href="${ctx}/cm/materialText/";//刷新指定iframe";
					top.$.jBox.close(true);
				}else{
					showTip(repMsg);
					$("#repMsg").val("");
				}
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
		<li class="active"><a href="${ctx}/cm/materialText/">文本库</a></li>		
			<li><a href="${ctx}/cm/materialText/form">新增文本</a></li>	
	</ul>
	<form id="searchForm" action="${ctx}/cm/materialText/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>文本内容：</label>
				<input type="text" name="content" class="input-medium" value="" maxlength="200" placeholder="文本内容">
			</li>
			<li>
				<label>修改时间：</label>
				<input id="begainTime" name="begainTime" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate" value="<fmt:formatDate value="${findMaterialTextPage.begainTime}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>
				-- 
				<input id="endTime" name="endTime" type="text" readonly="readonly" maxlength="20" class="input-mini Wdate" value="<fmt:formatDate value="${findMaterialTextPage.endTime}" pattern="yyyy-MM-dd"/>"  onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>&nbsp;&nbsp;
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
		</ul>
	</form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>内容</th>
				<th>修改时间</th>
				<th>创建组织</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="item" varStatus="number"> 
			<tr>		
				<td>
				  	 ${item.content}
				</td>
				<td>
					<fmt:formatDate value="${item.updateTime}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
				<c:choose>
					<c:when test="${empty item.officeName}">
						总管账号
					</c:when>
					<c:otherwise>
						${item.officeName}
					</c:otherwise>
				</c:choose>	
				</td>
				<!-- 总管账号创建内容不允许修改删除 -->
				<c:choose>
					<c:when test="${empty merchantNo}">
						<td>
							<a href="${ctx}/cm/materialText/form?code=${item.code}&content=${item.content}">修改</a>&nbsp;&nbsp;
							<a href="${ctx}/cm/materialText/delete?code=${item.code}" onclick="return confirmx('确认要删除吗？', this.href)">删除</a>&nbsp;&nbsp;
						</td>
					</c:when>
					<c:otherwise>
						<td>
							<c:if test="${not empty item.merchantNo}">
								<a href="${ctx}/cm/materialText/form?code=${item.code}&content=${item.content}">修改</a>&nbsp;&nbsp;
								<a href="${ctx}/cm/materialText/delete?code=${item.code}" onclick="return confirmx('确认要删除吗？', this.href)">删除</a>&nbsp;&nbsp;
							</c:if>
						</td>
					</c:otherwise>
				</c:choose>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	</div>
</body>
</html>