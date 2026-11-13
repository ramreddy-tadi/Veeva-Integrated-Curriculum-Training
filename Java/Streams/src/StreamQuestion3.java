import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestion3 {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("ram","deep","johns","suresh","narasimha");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.map each string and string length");
            System.out.println("2.find longest word from the list");
            System.out.println("3.find shortest word from the list");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    Map<String,Integer> ans=li.stream().collect(Collectors.toMap(l->l,String::length));
                    for(Map.Entry<String,Integer>al:ans.entrySet())
                    {
                        System.out.println(al.getKey()+" "+al.getValue());
                    }
                    break;
                }
                case 2:
                {
                    System.out.println(li.stream().max(Comparator.comparingInt(l->l.length())));
                    break;
                }
                case 3:
                {
                    System.out.println(li.stream().min(Comparator.comparingInt(l->l.length())));
                    break;
                }
                case 4:return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
