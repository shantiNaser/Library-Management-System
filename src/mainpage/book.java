
package mainpage;


public class book {
    private String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private book next;
    boolean borrow=false; // to know if the book was boroow or not
    
    
    
    public book(String ISBN,String title,String author,int publicationYear) //constructer
    {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
        next=null;
    }

    
  
    public book getNext()
    {
        return next;
    }
    public void setNext(book ptr)
    {
        next=ptr;
    }
    public String toString()
    {
        return ISBN + " " + title + " " + author + " " + publicationYear ;
    }
   public String getISBN()
   {
       return ISBN;
   }
   public String getAouther()
   {
       return author;
   }
   public String getTitle()
   {
       return title;
   }
}
