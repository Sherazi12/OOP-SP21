import java.util.Scanner;


public class PublicationRunner {
 public static void main(String[] args) {
         
         Scanner sc = new Scanner( System.in);
         
         System.out.println("Enter title");
         String title=sc.next();
         
         System.out.println("Enter price");
         int price=sc.nextInt();
         
         System.out.println("Enter page count");
         int pagecount=sc.nextInt();
         
         System.out.println(" Enter time duration");
         
         int time=sc.nextInt();
         
         Book book=new Book(price,title,pagecount);
         Tape tape=new Tape(title,price,time);
         
          book.display();
          tape.display();
       
     }
}
