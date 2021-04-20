
public class Tape extends Publication {
	private int time;

    public Tape(String title, int price , int time) {
        
    super(price,title);
        this.time=time;
        }
        
                
    public void setTime (int time)   {
        this.time=time;
    }         
                
                
    public int getTime(){
        return time;
    }                   
                
                
                
     public void display() {
        System.out.println(" Tape information " + title + "price is " + price + " and the total time in minutes is " + time );
        }       
}
