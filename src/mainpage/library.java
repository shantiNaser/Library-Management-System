
package mainpage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class library { // the imprtant class contains all thing
    
    //Attrbuites
   ListBook LB = new ListBook();
   listUser LS =new listUser();
  public static int countP=0;
  public static  int countS=0;
   
 Scanner in =new Scanner(System.in);
    
    // to open a file
    public void f() throws FileNotFoundException, IOException 
    {
         String fileName = "lib.txt";
        String line = null;
            FileReader fileReader = new FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
          //line=buf.readline();
            String mm[]; 
          
            while((line = bufferedReader.readLine()) != null) {
                mm=line.split(" ", 0); // to put the elemnt of line in array
                 String text=mm[0];
                 
                 
                 if(text.equals("p")||text.equals("P"))
                 {
                     String id=mm[1];
                     String name=mm[2];
                     String belongToFaculty=mm[3];
                     // now we must bulid a node ( profeesor ) to put informmation on it
                      professor pro = new professor(id,name,belongToFaculty);
                      LS.add(pro);

                 }
              
                 else if(text.equals("s")||text.equals("S"))
                     
                 {
                     String id =mm[1];
                     String name=mm[2];                     
                     // now we must bulid a node ( student ) to put informmation on it                     
                     student st = new student(id,name);
                     LS.add(st);
                 }
                 
                  if(text.equals("b")||text.equals("B"))
                 {
                    
                     String ISBN = mm[1];
                     String title = mm[2];
                     String author = mm[3];
                     int publicationYear=Integer.parseInt(mm[4]);//to converte from string to innteger
                     // now we must bulid a node ( book ) to put informmation on it
                    // LB.addBook(ISBN,title,author,publicationYear);
                     book bo =new book(ISBN,title,author,publicationYear);
                    LB.addBook(bo); // add book to the linked list
                   
                 }
                 
                
            } 
            System.out.println("the linked-list was build from text file");
            bufferedReader.close();         
    }
         
public void print()
{
LB.print();
}

public void addd(String g)
{
    LB.addingNewBooks(g);
}

public void dele(String g)
{
    LB.deleteBook(g);
}
public void deleAu(String g)
{
    LB.deleteBookForAuthor(g);
}
public void addUser(char h)
{
    LS.addNewUser(h);
}
public void deleUser(char j)
{
    LS.deleUSerrr(j);
}

public void printLU()
{
    LS.print();
}

public void printBrr()
{
    LB.printBBB();
}



 public void borrowBook()
   {
       String h,i;
       char g;
       
    System.out.println("Enter book title to borrow");
    h=in.next();
    
    if(!(LB.findBook(h)))
    {
        System.out.println("The book you want to Borrow does not exist");
        return;
    }
    if(LB.findIfBoroow(h))
    {
       System.out.println("this book is borrow you cant boroow it");
       return;
    }
    else
    {
       System.out.println("plese enter your TYpe");
       g=in.next().charAt(0);
       if(g=='p'||g=='P')
       {
           System.out.println("plese enter you id");
           i=in.next();
           if(!(LS.searchID(i)))
           {
               System.out.println("your professor id does not exist");
               return;
           }
           else
           {
               if(countP<4&&LS.searchID(i))
               
               {
                   LB.borrow(h);
                   countP++;
                   System.out.println("the process complete");
                   return;
               }
               else
               {
                   System.out.println("Sorry you are above the the allowed number");
                   return;
               }
           }
           
       }
       
       if(g=='s'||g=='S')
       {
           System.out.println("plese enter you id");
           i=in.next();
           if(!(LS.searchID(i)))
           {
               System.out.println("your student id does not exist");
               return;
           }
           else
           {
               if(countS<2&&LS.searchID(i))
               {
                   LB.borrow(h);
                   countS++;
                   System.out.println("the process complete");
                   return;
               }
               else
               {
                   System.out.println("Sorry you are above the the allowed number");
                   return;
               }
           }
           
       }
   }
}
 public void returningABook()
 {
     String h;
     System.out.println("Enter book title to return");
    h=in.next();
    if(!(LB.findBook(h)))
    {
        System.out.println("The book you want to return does not exist");
        return;
    }
    if(!(LB.findIfBoroow(h)))
    {
       System.out.println("this book is not borrow you cant return  it");
       return;
    }
    else
    {
     LB.returnB(h);   
    }
    
 }
 
}