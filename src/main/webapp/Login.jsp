<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="login">
<s:textfield name="email" label="email"></s:textfield>
<s:textfield name="password" label="password"></s:textfield>
<s:submit></s:submit>
</s:form>

