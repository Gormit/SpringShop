<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div>

    <h1><spring:message code="message.thanksText"/></h1>

    <img src="${pageContext.request.contextPath}/assests/img/pop.gif" class="img-polaroid">

    <br>

    <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>

</div>


