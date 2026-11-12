import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee
{
    String name;
    int age;
    String dept;
    public Employee(String name,int age,String dept)
    {
        this.name=name;
        this.age=age;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class EmployeManagementCaseStudy1
{
    static List<Employee> lt = new ArrayList<>();
    static void filldata()
    {
        lt.add(new Employee("ram",21,"it"));
        lt.add(new Employee("ravi",35,"sales"));
        lt.add(new Employee("shiva",37,"hr"));
        lt.add(new Employee("karthik",28,"sales"));
        lt.add(new Employee("roshan",45,"it"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        filldata();
        while(true)
        {
            System.out.println("1.group by dept");
            System.out.println("2.group by age");
            System.out.println("3.find oldest employee");
            System.out.println("4.find youngest employee");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println(lt.stream().collect(Collectors.groupingBy(e->e.dept)));
                    break;
                }
                case 2:
                {
                    System.out.println(lt.stream().collect(Collectors.groupingBy(e->e.age<=30?"small":e.age<=40?"medium":e.age<=50?"large":"very large")));
                    break;
                }
                case 3:
                {
                    System.out.println(lt.stream().max(Comparator.comparing(e->e.age)));
                    break;
                }
                case 4:
                {
                    System.out.println(lt.stream().min(Comparator.comparing(e->e.age)));
                    break;
                }
                case 5: return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
