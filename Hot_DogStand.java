
package hot_dogstand;

public class Hot_DogStand {
    
	public int ID;
	public int HotDogs_sold;
	
	Hot_DogStand(int ID , int HotDogs_sold){
		this.ID = ID;
		this.HotDogs_sold = HotDogs_sold;
	}
	
	void SoldOut() {
		HotDogs_sold = HotDogs_sold + 1;
		System.out.println(ID + " has sold " + HotDogs_sold);
	}
}


   
    

