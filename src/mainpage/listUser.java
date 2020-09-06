
package mainpage;

import java.util.Scanner;
public class listUser {
    
    User head=null;
    
    Scanner in =new Scanner(System.in);
     public boolean empty(){
        
        if(head==null)
        {
            return true;
        }
        return false;
    }
     public void add(User m)
     {
         if(empty())
           {
               head=m;
               return;
           }
           else
               m.setNext(head);
           head=m;
           return;
           
         }
        
     
      public void print ()
            
    {
        User l=head;
        if(empty())
        {
            System.out.println("empty list");
            return;
        }
        else
            while(l!=null)
            {
                if(l instanceof student)
                {
                    if(empty())
                    {
                        System.out.println("empty list");
                    }
                    System.out.println(((student) l).toString()); // taype-casting for student class 
                    l=l.getNext();
                }
                else if(l instanceof professor)
                {
                  if(empty())
                    {
                        System.out.println("empty list");
                    }
                    System.out.println(((professor) l).toString());
                    l=l.getNext();
                }  
                }
            }
      
      //function
      
      public boolean searchID(String i)
      {
          User t =head;
          while(t!=null)
          {
              if(t instanceof student)
            
              {
                  if((((student) t).getId()).equals(i))
                  {
                      return true;
                  }
                  else 
                      t=t.getNext();
              }
              else if( t instanceof professor) 
                  {
             if((((professor) t).getId()).equals(i)) 
               {
                   return true;
               }
                  t=t.getNext();
              }
          }
          return false; // end loop without faind id
                   
          
      }
      
      public void addNewUser(char g)
      {
          String k;
          String i;
          
          if(g=='p'||g=='P')
          {
              System.out.println("plese enter the information for professor in order(id,name,Faculoty)");
              i=in.next();
              if(searchID(i)){
                  System.out.println("this id was alerdy used for another professor ");
                  return;
              }
              else
              {
               // created a ndoe   
              professor New =new professor(i,in.next(),in.next());
              add(New);   
          }
          }
          else if(g=='s'||g=='S')
          {
            System.out.println("plese enter the information for professor in order(id,name)");
            i=in.next();
              if(searchID(i)){
                  System.out.println("this id was alerdy used for another Student ");
                  return;
              }
              else
              {
               // created a ndoe   
              student New =new student(i,in.next());
              add(New);   
          }
          }
          else
          {
              System.out.println("theis input was wrong");
          }
      }
      
      // jahez
      
      
      public User searchPositionID(String i)
      {
          User t =head;
          while(t!=null)
          {
              if(t instanceof student)
            
              {
                  if((((student) t).getId()).equals(i))
                  {
                      return t;
                  }
                  else 
                      t=t.getNext();
              }
              
              // jahez
              else if( t instanceof professor) 
                  {
             if((((professor) t).getId()).equals(i)) 
               {
                   return t;
               }
                  t=t.getNext();
              }
          }
          //return false; // end loop without faind id
        return null;
      }
      
      
    
      
      public void deleUSerrr(char g)
      {
          String i;
          User t=head;
          User e=head;
        
          if(g=='p'||g=='P')
          {
              System.out.println("plese enter the id for professor that you want to delete");
              i=in.next();
              if(!(searchID(i))){
                  System.out.println("this id was not used ");
                  return;
              }
              if(t instanceof professor && searchPositionID(i)==t) // at first position
              {
                  head=head.getNext();
                  t.setNext(null);
                  return;
              }
              User h=head;
              if(h instanceof professor && (searchPositionID(i)!=h))
              {
               User m=head;
               User r,n,o;
               while(m!=null)
               {
                 if(m instanceof professor)
            
              {
                 User l=searchPositionID(i);
                 while(h.getNext()!=l)
                 {
                     h=h.getNext(); // now t at the position imediatly behaid the node you want to dele
                 }
                 h.setNext(l.getNext());
                 l.setNext(null);
                 return;
                 
                 
               }
          }
          }
      }
          
      
      // jahez
   else   if(g=='s'||g=='S')
          {
              System.out.println("plese enter the id for student that you want to delete");
              i=in.next();
              if(!(searchID(i))){
                  System.out.println("this id was not used ");
                  return;
              }
              if(e instanceof student && searchPositionID(i)==e) // at first position
              {
                  head=head.getNext();
                  e.setNext(null);
                  return;
              }
              User h=head;
              if(h instanceof student && (searchPositionID(i)!=h))
              {
               User m=head;
               User r,n,o;
               while(m!=null)
               {
                 if(m instanceof student)
            
              {
                 User l=searchPositionID(i);
                 while(h.getNext()!=l)
                 {
                     h=h.getNext(); // now t at the position imediatly behaid the node you want to dele
                 }
                 h.setNext(l.getNext());
                 l.setNext(null);
                 return;
                 
                 
               }
          }
          }
      }
      else
      {
          System.out.println("this input was wrong");
      }
      }
      
      
      
      
}
      

