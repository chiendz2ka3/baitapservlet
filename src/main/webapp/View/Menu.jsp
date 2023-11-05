<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2023
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Munu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        .block-list{
            justify-content: center;
            display: flex;
            padding-top: 30px;
        }
        #paaa{
            padding: 20px;
            margin: 30px;
        }
    </style>
</head>
<body>
    <div class="block-list ">
        <a href="/quanlybanhang/AddnewProduct-servlet" id="paaa" class="btn btn-primary">thêm sản phẩm</a>
        <a href="Supperlicontrol-servlet"  id="paaa" class="btn btn-primary">Thêm nhà phân phối</a>
        <a href="ListNhacungcap-servlet" id="paaa" class="btn btn-primary">Duyệt các đơn hàng</a>
        <a id="paaa" class="btn btn-primary">Them</a>
    </div>
</body>
</html>
