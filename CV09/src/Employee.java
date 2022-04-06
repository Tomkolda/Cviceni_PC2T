public class Employee {
    private String nickname;
    private String email;
    private char[] password;

    enum employeeType {ACTIVE, INACTIVE, DELETED};

    public Employee(String nickname, String email, char[] password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public int compareTo(Employee Emp)
    {
        return this.getEmail().compareTo(Emp.getEmail());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
