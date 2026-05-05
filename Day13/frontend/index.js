 function validateForm() {
            var username = document.getElementById("name").value;
            var password = document.getElementById("password").value;

            if (username === "admin" && password === "password123") {
                alert("Login successful!");
            } else {
                alert("Invalid username or password. Please try again.");
            }
        }