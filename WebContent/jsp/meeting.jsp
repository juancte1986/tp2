<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Meeting</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- css -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.css" type="text/css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.datetimepicker.css"type="text/css" />
		<!-- js -->
		<script src="${pageContext.request.contextPath}/js/lib/jquery-1.11.3.js"></script>
		<script src="${pageContext.request.contextPath}/js/lib/jquery-ui.js"></script>
		<script src="${pageContext.request.contextPath}/js/lib/jquery.datetimepicker.full.js"></script>
		<script src="${pageContext.request.contextPath}/js/widgets/jquery.event.js"></script>
		<script>
			$(function() {
				$("#content").applyEvent({
					urlContext : '${pageContext.request.contextPath}',
					isMeeting : true
					
				});
			});
		</script>
	</head>
	<body>
		<!-- editar, crear y borrar event -->
		<div id="content">
			<form:form commandName="formMeeting" action='${pageContext.request.contextPath}/saveMeeting.htm' method="POST">
		    	<form:label path="name">
					<fmt:message key="label.name" />
				</form:label>
				<form:input path="name"/>
				<form:errors path="name" cssStyle="color: red" />
				<br/>
				<form:label path="theme">
					<fmt:message key="label.theme" />
				</form:label>
				<form:input path="theme"/>
				<br/>
				<form:label path="startTime">
					<fmt:message key="label.startTime" />
				</form:label>
				<form:input id="startTimepicker" path="startTime"/>
				<form:errors path="startTime" cssStyle="color: red" />
				<br/>
				<form:label path="endTime">
					<fmt:message key="label.endTime" />
				</form:label>
				<form:input id="endTimepicker" path="endTime"/>
				<form:errors path="endTime" cssStyle="color: red" />
				<br/>
				<form:label path="guests">
					<fmt:message key="label.guests" />
				</form:label>
				<form:input id="inputGuests" path="guests"/>
				<br/>
<%-- 				<form:label path="hall"> --%>
<%-- 					<fmt:message key="label.hall" /> --%>
<%-- 				</form:label> --%>
<%-- 				<form:input id="inputHalls" path="hall"/> --%>
				<input type="text" id="inputHalls"/>
				<br/>
				<form:button><fmt:message key="label.save"/></form:button>
			</form:form>
		</div>
	</body>
</html>