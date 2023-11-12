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
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<div class="container">
    <table class="table table-hover text-center">
        <thead class="table-dark">
        <tr>
            <th>id</th>
            <th>Tên Nhà Cung Cấp</th>
            <th>Địa Chỉ</th>
            <th>SDT</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <jsp:useBean id="listsuppler" scope="request" type="java.util.List"/>
        <c:forEach var="item" items="${listsuppler}">
            <tr>
                <td>${item.getIdnhacungcap()}</td>
                <td>${item.getTenNhaCungCap()}</td>
                <td>${item.getDiaChi()}</td>
                <td>${item.getSdt()}</td>
                <td>
                    <a href="/quanlybanhang/GetDetailHoaDon-servlet?sid=${item.getIdnhacungcap()}" ><i class="fa-solid fa-pen-to-square fs-5 me-3"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
