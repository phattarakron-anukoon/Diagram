public class User {
    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    public User(int user_id, int department_id, String user_username,
                String user_password, String user_name,
                Gender user_gender, String user_email,
                RoleUser user_role) {

        this.user_id = user_id;
        this.department_id = department_id;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_role = user_role;
    }

    public boolean userLogin() {
        System.out.println("User login");
        return true;
    }

    public void addProposal() {
        System.out.println("Add proposal");
    }

    public void viewProposal() {
        System.out.println("View proposal");
    }

    public void confirmProposal() {
        System.out.println("Confirm proposal");
    }

    public void createReports() {
        System.out.println("Create report");
    }

    public void viewReports() {
        System.out.println("View report");
    }

    public void updateDepartment() {
        System.out.println("Update department");
    }
}