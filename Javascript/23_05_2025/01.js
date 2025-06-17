document.addEventListener("DOMContentLoaded", () => {
    const employeeForm = document.getElementById("employeeForm");
    const employeeList = document.getElementById("employeeList");

    let employees = JSON.parse(localStorage.getItem("employees")) || [];

    function updateLocalStorage() {
        localStorage.setItem("employees", JSON.stringify(employees));
    }

    function renderEmployees() {
        employeeList.innerHTML = "";
        employees.forEach((emp, index) => {
            const row = document.createElement("tr");

            row.innerHTML = `
                <td>${emp.name}</td>
                <td>${emp.position}</td>
                <td>${emp.department}</td>
                <td>
                    <button onclick="editEmployee(${index})">Edit</button>
                    <button onclick="deleteEmployee(${index})">Delete</button>
                </td>
            `;

            employeeList.appendChild(row);
        });
    }

    employeeForm.addEventListener("submit", (e) => {
        e.preventDefault();
        const name = document.getElementById("name").value;
        const position = document.getElementById("position").value;
        const department = document.getElementById("department").value;

        employees.push({ name, position, department });
        updateLocalStorage();
        renderEmployees();
        employeeForm.reset();
    });

    window.editEmployee = (index) => {
        const emp = employees[index];
        document.getElementById("name").value = emp.name;
        document.getElementById("position").value = emp.position;
        document.getElementById("department").value = emp.department;

        employees.splice(index, 1);
        updateLocalStorage();
        renderEmployees();
    };

    window.deleteEmployee = (index) => {
        employees.splice(index, 1);
        updateLocalStorage();
        renderEmployees();
    };

    renderEmployees();
});