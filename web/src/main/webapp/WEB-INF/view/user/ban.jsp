<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div>

    <h1><spring:message code="message.banText"/></h1>

    <img src="${pageContext.request.contextPath}/assests/img/bun.gif" class="img-polaroid">

    <br>

    <c:url value="/j_spring_security_logout" var="logoutUrl"/>
    <a href="${logoutUrl}" class="btn btn-info"><spring:message code="button.loser"/></a>
</div>






