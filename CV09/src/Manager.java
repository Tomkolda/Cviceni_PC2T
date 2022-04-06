import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager {
    private String nickname;
    private String email;
    private char[] password;

    private List<Employee> listOfEmployee = new ArrayList<>();
    private List<Secretarian> listOfRelationships = new ArrayList<>();

    public Manager(String nickname, String email, char[] password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public void addRelation(Secretarian sec)
    {
        listOfRelationships.add(sec);
    }
    public void addEmployee(Employee emp)
    {
        listOfEmployee.add(emp);
    }

    public void listEmployees()
    {
        for (int i = 0; i < listOfEmployee.size(); i++)
        {
            System.out.println(listOfEmployee.get(i));
        }
    }
    public void listRelation()
    {
        for (int i = 0; i < listOfRelationships.size(); i ++)
        {
            System.out.println(listOfRelationships.get(i));
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
