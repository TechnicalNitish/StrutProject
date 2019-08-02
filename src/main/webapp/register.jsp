<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">
<s:textfield name="id" label="id"></s:textfield>
<s:textfield name="name" label="name"/>
<s:textfield name="email" label="email"/>
<s:textfield name="password" label="password"/>
<s:textfield name="contacts" label="contacts"/>
<s:submit></s:submit>
</s:form>
</body>
</html>