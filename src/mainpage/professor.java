
package mainpage;

/**
 *
 * @author Centrino Laptop
 */
public class professor extends User {
     private String id;
     private String name;
     private String Faculoty;
    // private professor next;
   
   public professor(String id,String name,String Fac) //constructer
   {
       this.id=id;
       this.name=name;
       this.Faculoty=Fac;
   }
   /*
   public professor getNext()
   {
       return next;
   }
   public void setNext(professor k)
   {
       next=k;
   }
*/
   public String getId()
   {
       return id;
   }
   public void setId(String f)
   {
       id=f;
   }
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
        return id+ " " + name + " " + Faculoty ;
    }
    
}
