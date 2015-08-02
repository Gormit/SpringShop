<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="span12">
    <sec:authorize access="hasRole('anonymous')">
        <a href="/shop/login.do" class="btn btn-info"><spring:message code="button.login"/></a>
        <a href="registration.jsp" class="btn btn-info"><spring:message code="button.registration"/></a>
    </sec:authorize>

    <sec:authorize access="hasAnyRole('user', 'admin')">
        <c:url value="/j_spring_security_logout" var="logoutUrl"/>
        <a href="${logoutUrl}" class="btn btn-info"><spring:message code="button.logout"/></a>
    </sec:authorize>

    <%--visible only admin--%>
    <sec:authorize access="hasRole('admin')">
        <a href="/shop/admin/users.do" class="btn btn-danger">
            <spring:message code="button.users"/>
        </a>
        <a href="/shop/admin/editGood/.do" class="btn btn-danger">
            <spring:message code="button.addGood"/>
        </a>
    </sec:authorize>
</div>

