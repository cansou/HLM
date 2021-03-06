<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>公司素材类型管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#number.count").html(666);
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
		function CancelQuery(){
			$(':input','#searchForm')  
			 .not(':button, :submit, :reset')  
			 .val('')  
			 .removeAttr('checked')  
			 .removeAttr('selected'); 
		
			$("#pageNo").val(1);
			$("#searchForm").submit();
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
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/business/commonMaterialtype/list">公司素材类型列表</a></li>
<%-- 		<shiro:hasPermission name="member:guid:edit"> --%>
			<li><a href="${ctx}/business/commonMaterialtype/form">公司素材类型添加</a></li>
<%-- 		</shiro:hasPermission> --%>
	</ul>
 	<form id="searchForm" action="${ctx}/business/commonMaterialtype" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
<!-- 		<ul class="ul-form">
		    <li><label>导购姓名：</label>
		    	<input type="text" name="memberNo" class="input-medium" maxlength="100" placeholder="导购姓名">
			</li>
			<li><label>标题：</label>
				<input type="text" name=mobile class="input-medium" maxlength="100" placeholder="标题">
			</li>
			
			<li><label>类型：</label>
				<select name="status">
					<option value="1">正常</option>
					<option value="1">注销</option>
					<option value="1">冻结</option>
				</select>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="reset" onclick="CancelQuery()" value="取消查询"/></li>
			<li class="clearfix"></li>
		</ul> -->
	</form> 
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>素材类型名称</th>
				<th>所属导购</th>
 				<th>素材量</th>
				<!--<th>客户回应量</th>
				<th>客户关注率</th> -->
				<th>备注</th>
				<th>创建组织</th>
				<th>创建人</th>
<%-- 				<shiro:hasPermission name="member:guid:edit"> --%>
				<th>操作</th>
<%-- 				</shiro:hasPermission> --%>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="item" varStatus="number"> 
			<tr>
				<td>
					${item.typeName}
				</td>
				<td>
					${item.memberNameGm}
				</td>
				<td>
					${item.typeCount}
				</td>
				<!-- <td></td>
				<td></td>
				<td></td>
				<td></td> -->
				<td>
					${item.remark}
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
				<td>
					${item.createId}
				</td>
				
				<!-- 总管账号创建内容不允许修改删除 -->
				<c:choose>
					<c:when test="${empty merchantNo}">
						<td>
							<a href="${ctx}/business/commonMaterialtype/form?code=${item.code}">修改</a>
						</td>
					</c:when>
					<c:otherwise>
						<td>
							<c:if test="${not empty item.merchantNo}">
								<a href="${ctx}/business/commonMaterialtype/form?code=${item.code}">修改</a>
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