<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>机构管理</title>
	<meta name="decorator" content="default"/>
	<style type="text/css">
		#l-map{height:300px;width:70%;}
		#r-result{width:100%;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=90pIG6bfMS6vGipBc8m7lukE"></script>
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
                	<form:option value="detail_base">基地</form:option>
			</form:select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="description" htmlEscape="false" rows="3" maxlength="200" class="input-xlarge"/>
			</div>
		</div>
		<div class="control-group" id="r-result">
			<label class="control-label">地点:</label>
			<div class="controls" >
				<form:input path="location" htmlEscape="false" maxlength="50" class="required" size="20" value="广西南宁市" id="suggestId" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">经纬度:</label>
			<div class="controls">
				<form:input path="point" htmlEscape="false" maxlength="50" class="required" id="result_"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div id="searchResultPanel" style="border:1px solid #C0C0C0;width:150px;height:auto; display:none;"></div>
				<div id="l-map"></div>
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
	
	<script type="text/javascript">
	// 百度地图API功能
	function G(id) {
		return document.getElementById(id);
	}

	var map = new BMap.Map("l-map");
	map.centerAndZoom("北京",12);                   // 初始化地图,设置城市和地图级别。

	var ac = new BMap.Autocomplete(    //建立一个自动完成的对象
		{"input" : "suggestId"
		,"location" : map
	});

	ac.addEventListener("onhighlight", function(e) {  //鼠标放在下拉列表上的事件
	var str = "";
		var _value = e.fromitem.value;
		var value = "";
		if (e.fromitem.index > -1) {
			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
		}    
		str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;
		
		value = "";
		if (e.toitem.index > -1) {
			_value = e.toitem.value;
			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
		}    
		str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
		G("searchResultPanel").innerHTML = str;
	});

	var myValue;
	ac.addEventListener("onconfirm", function(e) {    //鼠标点击下拉列表后的事件
	var _value = e.item.value;
		myValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
		G("searchResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myValue;
		
		setPlace();
	});

	function setPlace(){
		map.clearOverlays();    //清除地图上所有覆盖物
		function myFun(){
			var pp = local.getResults().getPoi(0).point;    //获取第一个智能搜索的结果
          document.getElementById("result_").value = pp.lng + "," + pp.lat;
			map.centerAndZoom(pp, 18);
			map.addOverlay(new BMap.Marker(pp));    //添加标注
		}
		var local = new BMap.LocalSearch(map, { //智能搜索
		  onSearchComplete: myFun
		});
		local.search(myValue);
	}
</script>
</body>
</html>
