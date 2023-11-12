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
    <form action="FindpR-servlet" method="post">
        <div class="input-group input-group-sm mb-3">
            <input type="text" name="namepr" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
            <button type="submit" class="btn btn-primary">Tìm kiếm</button>
        </div>
    </form>
<table class="table table-hover text-center">
    <thead class="table-dark">
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Tên Phụ Tùng</th>
        <th scope="col">Giá Bán</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="listsanpham" scope="request" type="java.util.List"/>
    <c:forEach var="item" items="${listsanpham}">
        <tr>
            <td>${item.getIdsanpham()}</td>
            <td>${item.getTensampham()}</td>
            <td>${item.getGiahang()}</td>
            <td>
                <a href="/quanlybanhang/ShowDetail-servlet?sid=${item.getIdsanpham()}" class="link-dark"><i class="fa-solid fa-pen-to-square fs-5 me-3"></i></a>
                <button type="button" class="btn btn-primary">Thêm</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
