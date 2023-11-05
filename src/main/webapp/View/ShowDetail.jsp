<%--<jsp:useBean id="Giaban" scope="request" type=""/>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2023
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show list</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<div class="container">
    <table class="table table-hover text-center">
        <thead class="table">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Mã số sản phẩm</th>
            <th scope="col">giá bán</th>
            <th scope="col">Số Lượng</th>
        </tr>
        </thead>
        <tbody>
        <jsp:useBean id="list" scope="request" type="java.util.List"/>
        <c:forEach var="item" items="${list}">
            <tr>
                <td>${item.getIsohdchitiet()}</td>
                <td>${item.getIdsanpham()}</td>
                <td>${item.getFsoluongNhap()}</td>
                <td>${item.getGiaban()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
   <c:if test="${giaban!=0}">
       <form action="GetDetailHoaDon-servlet" method="post">
           <h1>tổng tiền: ${Giaban}</h1>
           <button type="submit" class="btn btn-success">thanh toan</button>
       </form>
   </c:if>
</div>
</body>
</html>
