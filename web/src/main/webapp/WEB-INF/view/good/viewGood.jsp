<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="span9">

    <table id="view-table" class="table table-striped table-hover table-bordered">
        <tr>
            <td>Наименование товара</td>
            <td>
                ${good.name}
            </td>
        </tr>
        <tr>
            <td>Категория</td>
            <td>
                ${good.category.categoryName}
            </td>
        </tr>
        <tr>
            <td>Производитель</td>
            <td>
                ${good.manufacturer.manufacturerName}
            </td>
        </tr>
        <tr>
            <td>Есть на складе</td>
            <td>
                <c:choose>
                    <c:when test="${good.count > 0}">
                        ${good.count}
                    </c:when>
                    <c:otherwise>
                        <span style="color: red; ">Нет этой фигни на складе</span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <tr>
            <td>Цена</td>
            <td>
                ${good.price}
            </td>
        </tr>
        <tr>
            <td>Описание Товара</td>
            <td id="textarea">
                ${good.description}
            </td>
        </tr>
    </table>

    <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>
    <sec:authorize access="hasRole('admin')">
        <a href="/shop/admin/editGood/${good.goodId}.do" class="btn btn-info"><spring:message code="button.editGood"/></a>
    </sec:authorize>
</div>