<%--page with list users--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div id="login">

    <%--message login error--%>
    <h5>${error}</h5>

    <%--authorisation form--%>
    <spring:url var="authUrl" value="/j_spring_security_check"/>
    <form method="post" action="${authUrl}" class="form-horizontal">
        <input type="hidden" name="page" value="Login"/>

        <legend><spring:message code="message.login"/></legend>
        <div class="control-group">
            <label class="control-label">Email</label>

            <div class="controls">
                <input type="text" name="j_username" placeholder="Email" required>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Password</label>

            <div class="controls">
                <input type="password" name="j_password" placeholder="Password" required>
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button id="login_submit" type="submit" class="btn btn-info"><spring:message code="button.login"/></button>
                <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>
            </div>
        </div>
    </form>
</div>