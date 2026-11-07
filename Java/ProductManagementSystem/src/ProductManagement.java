import java.rmi.StubNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
class InvalidQuantity extends Exception
{
    InvalidQuantity(String m)
    {
        super(m);
    }
}
public class ProductManagement
{
    static ArrayList<Product> ar = new ArrayList<>();
    static void checkQuantity(int q) throws InvalidQuantity
    {
        if(q<100)
        {
            throw new InvalidQuantity("quantity less than 100: "+q);
        }
        else{
            System.out.println("product added");
        }
    }
   public static void filldata()
    {
        ar.add(new Product(1,"laptop","asus",1000,"27nov2025",101));
        ar.add(new Product(2,"mobile","oneplus",2000,"03may2026",104));
        ar.add(new Product(3,"tab","lenova",3000,"04july2026",106));
        ar.add(new Product(4,"charger","dell",4000,"05aug2026",205));
        ar.add(new Product(5,"buds","realme",5000,"06jan2025",306));
        ar.add(new Product(6,"converter","tplink",6000,"04feb2025",608));
        ar.add(new Product(7,"usb","tplink",6000,"26jan2025",678));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        filldata();
        while(true)
        {
            System.out.println("1.Add Product");
            System.out.println("2.Display products by price desc");
            System.out.println("3.Display products based on price range desc");
            System.out.println("4.Display products based on price and mandate desc");
            System.out.println("5.get products based on mandate");
            System.out.println("6.get products based on price");
            System.out.println("7.get products based on companyname and price");
            System.out.println("8.get products based on price top k");
            System.out.println("9.get products based on price least k");
            System.out.println("10.Exit");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("enter product id");
                    int p_id = sc.nextInt();
                    System.out.println("enter product name");
                    String p_name=sc.next();
                    System.out.println("enter product company");
                    String p_company=sc.next();
                    System.out.println("enter product price");
                    int p_price = sc.nextInt();
                    System.out.println("enter product date of manufacturing");
                    String dom = sc.next();
                    System.out.println("enter product quantity");
                    int p_quantity= sc.nextInt();
                    try {
                        checkQuantity(p_quantity);
                        ar.add(new Product(p_id, p_name, p_company, p_price, dom, p_quantity));
                    }
                    catch(InvalidQuantity e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2:
                {
                    Collections.sort(ar,(p1,p2)->p2.p_price-p1.p_price);
                    for(Product p:ar)
                    {
                        System.out.println(p.p_id+" "+p.p_name+" "+p.p_price+" "+p.p_company+" "+p.dom+" "+p.p_quantity);
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("enter min price");
                    int minprice = sc.nextInt();
                    System.out.println("enter max price");
                    int maxprice = sc.nextInt();
                    ArrayList<Product>tempar =new ArrayList<>();
                    for(Product p:ar)
                    {
                        if(p.p_price<minprice || p.p_price>maxprice) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                        }
                        else{
                            tempar.add(p);
                        }
                    }
                    Collections.sort(tempar,(p1,p2)->p2.p_price-p1.p_price);
                    for(Product p:tempar)
                    {
                        System.out.println(p.p_id+" "+p.p_name+" "+p.p_price+" "+p.p_company+" "+p.dom+" "+p.p_quantity);
                    }
                    break;
                }
                case 4:
                {
                    DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                            .parseCaseInsensitive()
                            .appendPattern("ddMMMyyyy")
                            .toFormatter(Locale.ENGLISH);
                    ar.sort(
                            Comparator.comparingInt((Product p) -> p.p_price)
                                    .reversed()
                                    .thenComparing(
                                            p -> LocalDate.parse(p.dom, formatter),
                                            Comparator.reverseOrder()
                                    )
                    );
                    for(Product p:ar)
                    {
                        System.out.println(p.p_id+" "+p.p_name+" "+p.p_price+" "+p.p_company+" "+p.dom+" "+p.p_quantity);
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("enter date");
                    String dat = sc.next();
                    for(Product p:ar)
                    {
                        if(p.dom.equals(dat)) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                        }
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("enter price");
                    int price = sc.nextInt();
                    for(Product p:ar)
                    {
                        if(p.p_price==price) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                        }
                    }
                    break;
                }
                case 7:
                {
                    System.out.println("enter price");
                    int price = sc.nextInt();
                    System.out.println("enter company name");
                    String cname = sc.next();
                    for(Product p:ar)
                    {
                        if(p.p_price==price && p.p_company.equals(cname)) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                        }
                    }
                    break;
                }
                case 8:
                {
                    System.out.println("enter k value");
                    int k =sc.nextInt();
                    Collections.sort(ar,(p1,p2)->p2.p_price-p1.p_price);
                    int c=0;
                    for(Product p:ar)
                    {
                        if(c<k) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                            c++;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }
                case 9:
                {
                    System.out.println("enter k value");
                    int k =sc.nextInt();
                    Collections.sort(ar,(p1,p2)->p1.p_price-p2.p_price);
                    int c=0;
                    for(Product p:ar)
                    {
                        if(c<k) {
                            System.out.println(p.p_id + " " + p.p_name + " " + p.p_price + " " + p.p_company + " " + p.dom + " " + p.p_quantity);
                            c++;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }

                case 10: return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
