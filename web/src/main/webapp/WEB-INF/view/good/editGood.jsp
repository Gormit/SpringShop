<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="span9">

    <form action="/shop/admin/saveGood.do">
        <table id="view-table" class="table table-striped table-hover table-bordered">
            <input name="goodId" value="${good.goodId}" hidden/></td>
            <tr>
                <td>Наименование товара</td>
                <td>
                    <input name="name" value="${good.name}" />
                </td>
            </tr>
            <tr>
                <td>Категория</td>
                <td>
                    <select name="categoryId">
                        <option selected value="${good.category.categoryId}">${good.category.categoryName}</option>
                        <c:forEach items="${categoryList}" var="category">
                            <option value="${category.categoryId}">${category.categoryName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Производитель</td>
                <td>
                    <select name="manufacturerId">
                        <option selected value="${good.manufacturer.manufacturerId}">${good.manufacturer.manufacturerName}</option>
                        <c:forEach items="${manufacturerList}" var="manufacturer">
                            <option value="${manufacturer.manufacturerId}">${manufacturer.manufacturerName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>На склад</td>
                <td>
                    <input name="count" pattern="[0-9]{1,64}" required title="Алё, только циферки" value="${good.count}" />
                </td>
            </tr>
            <tr>
                <td>Цена</td>
                <td>
                    <input name="price" pattern="[0-9]{1,64}" required title="Алё, только циферки" value="${good.price}" />
                </td>
            </tr>
            <tr>
                <td>Описание Товара</td>
                <td id="textarea">
                    <input name="description" value="${good.description}" />
                </td>
            </tr>
        </table>

        <button id="submit" type="submit" class="btn btn-info"><spring:message code="button.save"/></button>
        <a href="/shop/" class="btn btn-info"><spring:message code="button.backToShop"/></a>

    </form>
</div>