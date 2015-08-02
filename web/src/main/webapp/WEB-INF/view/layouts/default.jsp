<%--default page--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core"
      xmlns:spring="http://www.springframework.org/tags"
      xmlns:tiles="http://tiles.apache.org/tags-tiles">
<head>
    <tiles:insertAttribute name="title"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assests/style/style.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assests/style/bootstrap.min.css"/>
    <link rel="stylesheet" type="javascript" href="${pageContext.request.contextPath}/assests/js/bootstrap.min.js"/>
</head>
<body>

<div class="container">
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="buttons"/>

    <div class="row" id="content">
        <tiles:insertAttribute name="menu"/>
        <tiles:insertAttribute name="body"/>
    </div>
    <tiles:insertAttribute name="footer"/>
    <%--<tiles:insertAttribute name="banCheck"/>--%>
</div>
</body>
</html>
