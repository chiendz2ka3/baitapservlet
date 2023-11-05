<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2023
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add new</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<div class="container">
    <div class="text-center mb-4">
        <h3>Add New Supperlie</h3>
        <p class="text-muted">Complete the form below to add a new Supperlie</p>
    </div>

    <div class="container d-flex justify-content-center">
        <form action="Supperlicontrol-servlet" method="post" style="width:50vw; min-width:300px;">
            <div class="row mb-3">
                <div class="col">
                    <label class="form-label">Supplier Name:</label>
                    <input type="text" class="form-control" name="SupplierName" placeholder="Albert">
                </div>

                <div class="col">
                    <label class="form-label">Address:</label>
                    <input type="text" class="form-control" name="Address" placeholder="">
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">PhoneNumber:</label>
                <input type="number" class="form-control" name="sdt" placeholder="">
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
