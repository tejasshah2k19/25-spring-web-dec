<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Employee</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background-color: #f8f9fa;
    }
    .card {
        margin-top: 40px;
    }
</style>
</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Add New Employee</h4>
                </div>

                <div class="card-body">
                    <form action="saveEmployee" method="post">

                        <!-- First Name -->
                        <div class="mb-3">
                            <label class="form-label">First Name</label>
                            <input type="text" name="firstName" class="form-control"
                                   placeholder="Enter first name"  >
                                   <span class="text-danger"> 
                        ${result.getFieldError("firstName").defaultMessage}</span>
                        </div>

                        <!-- Last Name -->
                        <div class="mb-3">
                            <label class="form-label">Last Name</label>
                            <input type="text" name="lastName" class="form-control"
                                   placeholder="Enter last name"  >
                                   ${result.getFieldError("lastName").defaultMessage}
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control"
                                   placeholder="Enter email"  >
                                   ${result.getFieldError("email").defaultMessage}
                        </div>

                        <!-- Password -->
                        <div class="mb-3">
                            <label class="form-label">Password</label>
                            <input type="password" name="password" class="form-control"
                                   placeholder="Enter password"  >
                                   ${result.getFieldError("password").defaultMessage}
                        </div>

                        <!-- Birth Year -->
                        <div class="mb-3">
                            <label class="form-label">Birth Year</label>
                            <input type="number" name="birthYear" class="form-control"
                                   placeholder="e.g. 1995"    >
                                   ${result.getFieldError("birthYear").defaultMessage}
                        </div>

                        <!-- Position -->
                        <div class="mb-3">
                            <label class="form-label">Position</label>
                            <input type="text" name="position" class="form-control"
                                   placeholder="Enter Your Job Role"  >
                                   ${result.getFieldError("position").defaultMessage}
                        </div>

                        <!-- Buttons -->
                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                Save Employee
                            </button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
