
package mainpage;

import java.io.IOException;
import java.util.Scanner;



public class Mainpage {

  
    public static void main(String[] args) throws IOException  {
         
        library l = new library();
        l.f();
      
        Scanner in=new Scanner(System.in);
        int choice;
         do
        {
        System.out.println("------------------------------------------");    
        System.out.println("please select something from menu:");
        System.out.println("1.adding new books");
        System.out.println("2.delete a book");
        System.out.println("3.delete books of an author"); // we have a problem here
        System.out.println("4.add new User");
        System.out.println("5.delete User"); 
        System.out.println("6.Borrow book");
        System.out.println("7. returning book");
        System.out.println("8.listing the available books");
        System.out.println("9.listing the borrowed books");
        System.out.println("10.listing the users.");
        System.out.println("11.Exit");
        System.out.println("------------------------------------------");
        choice=in.nextInt();
        if(choice==1)
        {
            String g;
            System.out.println("plese Enter ISBN to add");
            g=in.next();
           l.addd(g);
           continue;
            
        }
        else if(choice==2)
        {
          String g;
            System.out.println("plese Enter ISBN to delete");
            l.dele(in.next());
            continue;
        }
         else if(choice==3)
        {
          String g;
            System.out.println("plese Enter author name");
            l.deleAu(in.next());
            continue;
        }
        else if(choice==4)
        {
          char g;
            System.out.println("plese Enter (p) for profeesor ans (s) for Student");
            g=in.next().charAt(0);
            l.addUser(g);
            continue;
        }
        else if(choice==5)
        {
          char g;
            System.out.println("plese Enter (p) for profeesor ans (s) for Student");
            g=in.next().charAt(0);
            l.deleUser(g);
            continue;
        }
        
        else if(choice==6)
        {
          l.borrowBook();
            continue;
        }
         else if(choice==7)
        {
          l.returningABook();
            continue;
        }
         else if(choice==8)
        {
          l.print();
            continue;
        }
          else if(choice==9)
        {
          l.printBrr();
            continue;
        }
         
        
         else if(choice==10)
        {
          l.printLU();
            continue;
        }
        
        
       
    }while(choice!=11);
}
}
    
