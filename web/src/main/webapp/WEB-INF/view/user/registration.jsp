<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div id="login">

    <%--message login error--%>
    <h5>${message}</h5>

    <%--registration form--%>
    <form method="post" action="/shop/registration.do" class="form-horizontal">

        <legend><spring:message code="message.registration"/></legend>

        <div class="control-group">
            <label class="control-label">Почта</label>
            <div class="controls">
                <input type="email" name="mail" placeholder="Mail" required>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Password</label>
            <div class="controls">
                <input type="password" name="password" placeholder="Password" required>
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button type="submit" class="btn btn-info"><spring:message code="button.save"/></button>
                <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>
            </div>
        </div>
    </form>
</div>
