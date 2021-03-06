<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="span9">

    <table id="hello-table" class="table table-striped table-hover">
        <thead>
        <th><spring:message code="table_text.product_name"/></th>
        <th><spring:message code="table_text.price"/></th>
        <th><spring:message code="table_text.in_stock"/></th>
        <th></th>
        </thead>
        <tbody>
        <c:forEach var="good" items="${goods}">
            <tr>
                <td><a href="/shop/good/viewGood/${good.goodId}.do">${good.name}</a></td>
                <td>${good.price}</td>
                <td id="count">
                    <c:choose>
                        <c:when test="${good.count > 0}">
                            ${good.count}
                        </c:when>
                        <c:otherwise>
                            Прикинь, разобраллли!!!
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <sec:authorize access="hasRole('user')">
                        <c:choose>
                            <c:when test="${good.count > 0}">
                                <a href="/shop/good/buyGood/${good.goodId}.do" class="btn btn-success"><spring:message code="button.buy"/></a>
                            </c:when>
                            <c:otherwise>
                                <a href="#" class="btn btn-success disabled"><spring:message code="button.buy"/></a>
                            </c:otherwise>
                        </c:choose>

                    </sec:authorize>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

