<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>机构管理</title>
	<meta name="decorator" content="default"/>
	<script src="${ctxStatic}/laydate/laydate.js" type="text/javascript"></script>
	<script>
	laydate({
	    elem: '#start', //目标元素。由于laydate.js封装了一个轻量级的选择器引擎，因此elem还允许你传入class、tag但必须按照这种方式 '#id .class'
	    event: 'focus' //响应事件。如果没有传入event，则按照默认的click
	});
	laydate({
	    elem: '#end', //目标元素。由于laydate.js封装了一个轻量级的选择器引擎，因此elem还允许你传入class、tag但必须按照这种方式 '#id .class'
	    event: 'focus' //响应事件。如果没有传入event，则按照默认的click
	});
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/sys/area/list?id=${area.parent.id}&parentIds=${area.parentIds}">节点列表</a></li>
		<li class="active"><a href="${ctx}/sys/area/form?id=${area.id}&parent.id=${area.parent.id}">节点<shiro:hasPermission name="sys:area:edit">${not empty area.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sys:area:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="area" action="${ctx}/sys/area/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">上级节点:</label>
			<div class="controls">
                <sys:treeselect id="office" name="parent.id" value="${area.parent.id}" labelName="parent.name" labelValue="${area.parent.name}"
					title="节点" url="/sys/area/treeData" extId="${area.id}" cssClass="" allowClear="${area.currentUser.id eq '1'}"/>
			</div>
		</div>
	
		<div class="control-group">
			<label class="control-label">节点名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="50" class="required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
	
	  <div class="control-group">
			<label class="control-label">节点类型:</label>
			<div class="controls">
			<form:select path="type" class="input-medium">
				<option>请选择类型</option>
           			<form:option value="detail_cycle">生长周期</form:option>
           			<form:option value="detail_parameter">环境参数</form:option>
			</form:select>
			</div>
		</div>
	
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="description" htmlEscape="false" rows="3" maxlength="200" class="input-xlarge"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">开始时间:</label>
			<div class="controls">
				<form:input path="start" htmlEscape="false" maxlength="50" id="start"/>
				<span class="laydate-icon" onclick="laydate({elem: '#start'});"></span>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">结束时间:</label>
			<div class="controls">
				<form:input path="end" htmlEscape="false" maxlength="50" id="end"/>
				<span class="laydate-icon" onclick="laydate({elem: '#end'});"></span>
			</div>
		</div>
		<c:if test="${empty area.id}">
			<div class="control-group">
				<label class="control-label">快速添加下级节点:</label>
				<div class="controls">
					<form:checkboxes path="childDeptList" items="${fns:getDictList('sys_area_common')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</div>
			</div>
		</c:if>
		<div class="form-actions">
			<shiro:hasPermission name="sys:area:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>