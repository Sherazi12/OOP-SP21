
public class Book extends Publication {
	private int pageCount;

    public Book( int price, String title, int pageCount) {
        
        super (price,title);
        this.pageCount=pageCount;
        
    }
                
    public void setpageCount (int pageCount)   {
        this.pageCount=pageCount ;
    }         
                
                
    public int getpageCount(){
        return pageCount;
    }            
                
    public void display() {
        System.out.println (" Book information " + title + "price is " + price + " and the number of pages are " + pageCount );
        }    
}
