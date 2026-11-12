import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamProgram
{
    public static void main(String[] args) {
        List<String> lt = Arrays.asList("java","java","javascript","selinium","python","cpp","sql","mongodb","postgresql","windows","linux","mac","gemini","claude","antigravity");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. find names start with specific letter");
            System.out.println("2. find names start with J and end with A");
            System.out.println("3. find names start with specific letter and answer in uppercase");
            System.out.println("4. find names start with specific letter in distinct content");
            System.out.println("5. find names start with specific letter and answer in uppercase and distinct");
            System.out.println("6. give the sorted order");
            System.out.println("7. find names start with specific letter and answer in uppercase,sorted and distinct");
            System.out.println("8. count of distinct content starting with specific letter");
            System.out.println("9. find first element of the stream which filters data starting wiht S");
            System.out.println("10. check whether any element start with S");
            System.out.println("11. check whether all elements start with S");
            System.out.println("12.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    lt.stream().filter(s->s.startsWith(lett)).forEach(System.out::println);
                    break;
                }
                case 2:
                {
                    lt.stream().filter(s->s.startsWith("j")&&s.endsWith("a")).forEach(System.out::println);
                    break;
                }
                case 3:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    lt.stream().filter(s->s.startsWith(lett)).map(s->s.toUpperCase()).forEach(System.out::println);
                    break;
                }
                case 4:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    lt.stream().filter(s->s.startsWith(lett)).distinct().forEach(System.out::println);
                    break;
                }
                case 5:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    lt.stream().filter(s->s.startsWith(lett)).map(s->s.toUpperCase()).distinct().forEach(System.out::println);
                    break;
                }
                case 6:
                {
                   lt.stream().sorted().forEach(System.out::println);
                   break;
                }
                case 7:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    lt.stream().filter(s->s.startsWith(lett)).map(s->s.toUpperCase()).distinct().sorted().forEach(System.out::println);
                    break;
                }
                case 8:
                {
                    System.out.println("enter letter");
                    String lett = sc.next();
                    long cou = lt.stream().filter(s->s.startsWith(lett)).distinct().count();
                    System.out.println("count is : "+cou);
                    break;
                }
                case 9:
                {
                    String wor =lt.stream().filter(s->s.startsWith("s")).findFirst().orElse("none");
                    System.out.println("first element is :"+wor);
                    break;
                }
                case 10:
                {
                    boolean ans =lt.stream().anyMatch(s->s.startsWith("s"));
                    System.out.println(ans);
                    break;
                }
                case 11:
                {
                    boolean ans =lt.stream().allMatch(s->s.startsWith("s"));
                    System.out.println(ans);
                    break;
                }
                case 12:
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
