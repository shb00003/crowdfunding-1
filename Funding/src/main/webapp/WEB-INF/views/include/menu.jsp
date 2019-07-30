<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<a href="${path}">home</a> |
<a href="${path}/admin/main.do">관리자</a> |
<a href="${path}/admin/memberList.do">회원정보</a> |
<a href="${path}/admin/projectall.do">프로젝트 목록</a> |
