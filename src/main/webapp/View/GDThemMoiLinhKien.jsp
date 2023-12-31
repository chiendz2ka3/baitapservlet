<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2023
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add newpr</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

<div class="container">
    <div class="text-center mb-4">
        <h3>Thêm mới phụ tùng</h3>
<%--        <p class="text-muted">Complete the form below to add a new Product</p>--%>
    </div>

    <div class="container d-flex justify-content-center">
        <form action="AddnewProduct-servlet" method="post" style="width:50vw; min-width:300px;">
            <div class="row mb-3">
                <div class="col">
                    <label class="form-label">Tên:</label>
                    <input type="text" class="form-control" name="ProductName" placeholder="Nhập tên phụ tùng">
                </div>

                <div class="col">
                    <label class="form-label">Giá bán:</label>
                    <input type="number" class="form-control" name="Price" placeholder="Nhập giá">
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">Số lượng:</label>
                <input type="number" class="form-control" name="soluong" placeholder="Nhập số lượng">
            </div>

            <div class="form-group mb-3">
                <select name='supperli' id="cars">
                    <jsp:useBean id="listsuppler" scope="request" type="java.util.List"/>
                    <c:forEach var="item" items="${listsuppler}">
                        <option value="${item.getIdnhacungcap()}">${item.getTenNhaCungCap()}</option>
                    </c:forEach>
                </select>
            </div>

            <div>
                <button type="submit" class="btn btn-success" name="submit">Save</button>
                <a href="" class="btn btn-danger">Cancel</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
