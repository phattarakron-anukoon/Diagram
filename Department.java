public class Department {
    private int department_id;
    private String department_name;

    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public void insertDepartment() {
        System.out.println("Insert department");
    }

    public void updateDepartment() {
        System.out.println("Update department");
    }

    public void deleteDepartment() {
        System.out.println("Delete department");
    }
}