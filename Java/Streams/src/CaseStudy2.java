import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CaseStudy2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l1 = Arrays.asList(2,2,5,29,13,13,18,69);
        List<Integer> l2 = Arrays.asList(3,3,5,49,13,17,99,56,78);
        while(true)
        {
            System.out.println("1.find sum,avg,max,min for two lists");
            System.out.println("2.find k most frequent elements of two lists");
            System.out.println("3.find 2nd most frequent element of two lists");
            System.out.println("4.merge two lists into single list");
            System.out.println("5.common elements on two lists");
            System.out.println("10. exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    IntSummaryStatistics s1 = l1.stream().mapToInt(n->n).summaryStatistics();
                    IntSummaryStatistics s2 = l2.stream().mapToInt(n->n).summaryStatistics();
                    System.out.println("list1 - sum = "+s1.getSum()+",Max = "+ s1.getMax()+",Min = "+ s1.getMin()+",Avg = "+s1.getAverage());
                    System.out.println("list2 - sum = "+s2.getSum()+",Max = "+ s2.getMax()+",Min = "+ s2.getMin()+",Avg = "+s2.getAverage());
                    break;
                }
                case 2:
                {
                    System.out.println("enter k value");
                    int k = sc.nextInt();
                    System.out.println("list1 = "+l1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).limit(k).toList());
                    System.out.println("list2 = "+l2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).limit(k).toList());
                    break;
                }
                case 3:
                {
                    System.out.println("list1 = "+l1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().sorted((a,b)->b. getValue().compareTo(a.getValue())).skip(1).limit(1).toList());
                    System.out.println("list2 = "+l2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).skip(1).limit(1).toList());
                    break;
                }
                case 4:
                {
                    List<List<Integer>> an = Arrays.asList(l1,l2);
                    List<Integer> result = an.stream().flatMap(l->l.stream()).toList();
                    System.out.println(result);
                    break;
                }
                case 5:
                {
                    List<Integer> ans = l1.stream().filter(n->l2.contains(n)).toList();
                    System.out.println(ans);
                }
                case 10: return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
