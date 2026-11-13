import java.util.*;
import java.util.stream.Collectors;

class EmployeeD
{
    int id;
    String name;
    String job;
    String qualification;
    String doj;
    int salary;
    String dept;
    List<String> skills;
    public EmployeeD(int id,String name,String job,String qualification,String doj,int salary,String dept,List<String> skills)
    {
        this.id=id;
        this.name=name;
        this.job=job;
        this.qualification=qualification;
        this.doj=doj;
        this.salary=salary;
        this.dept=dept;
        this.skills=skills;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+job+" "+qualification+" "+doj+" "+salary+" "+dept+" "+skills;
    }
}
public class Casestudy3 {
    static  List<EmployeeD>li=new ArrayList<>();
    static  void filldata()
    {
        li.add(new EmployeeD(1, "ram", "developer", "btech", "29apr2004", 100000, "it", Arrays.asList("java", "cpp", "c")));
        li.add(new EmployeeD(2, "krishna", "tester", "mtech", "15jun2001", 75000, "testing", Arrays.asList("selenium", "java", "sql")));
        li.add(new EmployeeD(3, "reddy", "manager", "mba", "10jan1999", 150000, "hr", Arrays.asList("management", "communication", "leadership")));
        li.add(new EmployeeD(4, "suresh", "manager", "bsc", "20aug2002", 60000, "finance", Arrays.asList("excel", "sql", "python")));
        li.add(new EmployeeD(5, "priya", "tester", "btech", "05dec2003", 90000, "testing", Arrays.asList("playwright", "sql", "javascript")));
        li.add(new EmployeeD(6, "arjun", "developer", "btech", "12mar2002", 85000, "it", Arrays.asList("java", "spring", "mysql")));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        filldata();
        while(true)
        {
            System.out.println("1.top earning employee in each dept");
            System.out.println("2.get employees in it dept who earning more than 80,000 salary and in sorted alphabetical order");
            System.out.println("3.get Deduplicate list of employee skills starts with 'j'");
            System.out.println("4.group emp by dept and only include emp earning more than 100000");
            System.out.println("5.get first employee from each dept");
            System.out.println("6.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println(li.stream().collect(Collectors.groupingBy(n->n.dept,Collectors.maxBy(Comparator.comparingInt(n->n.salary)))));
                    break;
                }
                case 2:
                {
                    System.out.println(li.stream().filter(n->n.dept.equals("it")&&n.salary>80000).sorted(Comparator.comparing(n->n.name)).toList());
                    break;
                }
                case 3:
                {
                    System.out.println(li.stream().flatMap(n->n.skills.stream()).filter(n->n.startsWith("j")).distinct().toList());
                    break;
                }
                case 4: {
                    System.out.println(li.stream().filter(n->n.salary>100000).collect(Collectors.groupingBy(n -> n.dept)));
                    break;
                }
                case 5: {
                    li.stream().collect(Collectors.groupingBy(n -> n.dept)).forEach((dept,Employeet)->System.out.println(Employeet.getFirst()));
                    break;
                }

                case 6: return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
