<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2023
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dangki</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
    .bg-image-vertical {
        position: relative;
        overflow: hidden;
        background-repeat: no-repeat;
        background-position: right center;
        background-size: auto 100%;
    }

    @media (min-width: 1025px) {
        .h-custom-2 {
            height: 100%;
        }
    }
</style>
<body>
<section class="vh-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-8 text-black">
                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form style="width: 23rem;" action='dangkicontrol-servlet' method='POST'>

                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Dăng kí</h3>
                        <div class="form-outline mb-4">
                            <input type="text" id="form2Example17" name="UserName" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example18">Tên đăng nhập</label>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="email" id="form2Example18" name="Email" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example18">Email</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="sdt" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example18">SDT</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="password" name="password" id="form2Example28" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example28">Mật khẩu</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="password" name="repassword" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example28">Xác nhận mật khẩu</label>
                        </div>

                        <div class="pt-1 mb-4">
                            <button class="btn btn-info btn-lg btn-block" type="submit">Đăng kí</button>
                        </div>

<%--                        <p class="small mb-5 pb-lg-2"><a class="text-muted" href="#!">Forgot password?</a></p>--%>
                        <p>? <a href="DangNhap-servlet" class="link-info">DĂNG NHẬP Ở ĐÂY</a></p>

                    </form>

                </div>

            </div>
        </div>
    </div>
</section>
</body>
</html>
