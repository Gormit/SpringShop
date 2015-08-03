<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<div class="span9">

    <table id="hello-table" class="table table-striped table-hover">
        <thead>
        <th><spring:message code="table_text.mail"/></th>
        <th><spring:message code="table_text.role"/></th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    ${user.mail}
                </td>
                <td>
                    ${user.role.name}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>

</div>

