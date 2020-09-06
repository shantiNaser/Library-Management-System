
package mainpage;

public class student extends User {
   private String id;
   private String name;
   //private student next;
   
   public student(String id,String name) //constructer
   {
       this.id=id;
       this.name=name;
   }
   public String getId()
   {
       return id;
   }
   public void setId(String f)
   {
       id=f;
   }
   /*
   public student getNext()
   {
       return next;
   }
   public void setNext(student j)
   {
       next=j;
   }
*/
    public String getName()
    {
        return name;
    }
    public void setName(String nn)
    {
         name=nn;
    }
    public String toString()
    {
        return id+ " " + name ;
    }
}
