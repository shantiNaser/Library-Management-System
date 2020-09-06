
package mainpage;

import java.util.Scanner;
public class ListBook {
    
    private book head=null;
  
   Scanner in=new Scanner(System.in);
    public ListBook()
    {
        
    }
    
    public ListBook(book k)
    {
        this.head=k;            
    }
    
    public boolean empty(){
        
        if(head==null)
        {
            return true;
        }
        return false;
    }
    
    public void addBook(book n)
    {
       
        
        if(empty())
        {
           head=n;
           return;
        }
        else
            n.setNext(head);
            head=n;
            return;
        
            
    }
   
    public void print ()
            
    {
        book l=head;
        book j=l;
        if(empty())
        {
            System.out.println("empty list");
            return;
        }
        else
            while(l!=null)
            {
                if(l.borrow==false)
                {
                System.out.println(l.toString());
             
                }
                l=l.getNext();
                
            }
    }
    
    
    public void printBBB()
    {
        book n=head;
        if(empty())
        {
            System.out.println("They have no borrow books");
        }
        
        while(n!=null)
        {
            if(n.borrow==true)
            {
                System.out.println(n.toString());
              
            }
            n=n.getNext();
        }
    }
    
   
    
    
    // functions 
    
    public boolean findISBN(String jj)
    {
        book b=head;
       while(b!=null)
       {
           if(b.getISBN().equals(jj))
           return true;
           else
               b=b.getNext();
       }
       return false; // end the llop and does not find the ISBN
    }
    public boolean findAuother(String jj)
    {
        book b=head;
       while(b!=null)
       {
           if(b.getAouther().equals(jj))
           return true;
           else
               b=b.getNext();
       }
       return false; // end the llop and does not find the Auother
    }
    
    public boolean findIfBoroow(String h)
    {
        book b=head;
        while(b!=null)
        {
            if(b.getTitle().equals(h)&&b.borrow==true)
                return true;
            else
                b=b.getNext();
        }
        return false;
    }
    
    public void addingNewBooks(String IM)
    {
        book l=head;
        if(empty())
        {
            System.out.println("empty list");
            return;
        }
        else
            while(l!=null)
            {
                if(l.getISBN().equals(IM))
                {
                System.out.println("This ISBN already exists");
                return;
                }
                else
                l=l.getNext();
                
                }
            
            
                {
         System.out.println("plese enter an information about BOOK in order(title,auother,publicationYear");
         book n=new book(IM,in.next(),in.next(),in.nextInt());
          n.setNext(head);
            head=n;
            return;
         
                }      
            }
    
    public void deleteBook(String g)
    {
        book b=head;
        book q;
         if(empty())
        {
            System.out.println("empty list");
            return;
        }
         
         else
         {
             // add here cheak it
             if(findIfBoroow(g))
             {
                 System.out.println("This Book was borow you cant borow it");
                 return;
             }
             
             if(!findISBN(g))
             {
                 System.out.println("Book not founded");
             }
         
             
             else if(b.getISBN().equals(g)&&b.borrow==false) // if the book was at first position
             {
                 head=head.getNext();
                 b.setNext(null);
                 System.out.println("Book deleted");
                 return;
             }
             else 
             {
                 while(b!=null&&!(b.getNext().getISBN().equals(g))&&b.borrow==false)
                 {
                     b=b.getNext();
                 }
                 q=b.getNext();
                 b.setNext(q.getNext());
                 System.out.println("Book deleted");
             }
             // add for borow 
         }
             
         }
      
    public boolean findBook(String h)
    {
        book n=head;
        while(n!=null)
        {
            if(n.getTitle().equals(h))
                return true;
            else
            n=n.getNext();
        }
        return false;
    }
    
  public void borrow(String h)
  {
      book b=head;
      while(b!=null)
      {
          if(b.getTitle().equals(h))
          {
              b.borrow=true;
          }
          b=b.getNext();
      }
  }
  
  public void returnB(String h)
  {
      book j=head;
      while(j!=null)
      {
          if(j.getTitle().equals(h))
          {
              j.borrow=false;
              System.out.println("The process was complete");
              return;
          }
          j=j.getNext();
      }
  }


   // jahez 
   
      
    
    // a problem in dele more than one  
    public void deleteBookForAuthor(String g)
    {
        book b=head;
        book q=head;
        book r;
         if(empty())
        {
            System.out.println("empty list");
            return;
        }
         else
         {
             if(!findAuother(g))
             {
                 System.out.println("Auothers not founded"); 
                 return;
             }
             //eles
             /*
              if(b.getAouther().equals(g)) // first auother 
             {
                 head=head.getNext();
                 b.setNext(null);
             }
*/
             while(b!=null&&b.getAouther().equals(g))
             {
                 head=b.getNext();
                 b.setNext(null);
                 b=head;
             }
              
             //else
             {
             while(q!=null&&!(q.getAouther().equals(g)))
             {
                 {
                 r=q;
                 q=q.getNext();
                 }
                 if (q == null) return;
                 r.setNext(q.getNext());
                 q.setNext(null);
                 q=r.getNext();
}
}
         }
    }
    
    
    
}

    
    


    
   
    
    
  
    

