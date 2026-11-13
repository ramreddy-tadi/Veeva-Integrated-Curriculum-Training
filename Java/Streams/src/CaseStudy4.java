import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class employee2
{
    int id;
    String name;
    String job;
    int salary;

    public employee2(int id, String name, String job, int salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+job+" "+salary;
    }
}
class Company
{
    int id;
    String name;
    String loc;
    String type;
    List<employee2>li;
    public Company(int id, String name, String loc, String type,List<employee2>li) {
        this.id = id;
        this.name = name;
        this.loc = loc;
        this.type = type;
        this.li=li;
    }
}

public class CaseStudy4 {
    static List<Company>cl = new ArrayList<>();

    static void filldata()
    {
        List<employee2>l1 = new ArrayList<>();
        l1.add(new employee2(1,"ram","software engineer",100000));
        l1.add(new employee2(2,"john","ui",50000));
        cl.add(new Company(11,"google","usa","productbased",l1));
        List<employee2>l2 = new ArrayList<>();
        l2.add(new employee2(1,"ravi","developer",70000));
        l2.add(new employee2(2,"teja","hr",85000));
        cl.add(new Company(12,"oracle","hyd","productbased",l2));
        List<employee2>l3 = new ArrayList<>();
        l3.add(new employee2(1,"jam","software architect",150000));
        l3.add(new employee2(2,"dep","manager",250000));
        cl.add(new Company(13,"zoho","mumbai","servicebased",l3));
    }
    public static void main(String[] args) {
        filldata();
        System.out.println(cl.stream().flatMap(li1->li1.li.stream()).toList());

    }
}
