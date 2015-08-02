<%--tiles with menu--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="span2 sidebar">

    <a href="/shop/welcome.do" class="btn btn-info">
        <spring:message code="menu_button.goods"/>
    </a>

    <a href="/shop/categories.do" class="btn btn-info">
        <spring:message code="menu_button.categories"/>
    </a>

</div>
