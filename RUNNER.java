
package hot_dogstand;



import java.util.Scanner;
public class RUNNER {
	public static void main(String[] args) {
		
		int Id = -1 ;
		Scanner myVar = new Scanner(System.in);
		Hot_DogStand H1 = new Hot_DogStand(1390 , 3);
		Hot_DogStand H2 = new Hot_DogStand(1420 , 0);
		Hot_DogStand H3 = new Hot_DogStand(1294 , 1);
		
		
		while(Id != 0 ) {
			System.out.print("Enter Id of HotDogStand : ");
		Id = myVar.nextInt();
			
			if (Id == 1390) {
				H1.SoldOut();
			}
			else if(Id == 1420) {
				H2.SoldOut();
			}
			else if(Id == 1294) {
				H3.SoldOut();
			}
			else if(Id == 0) {
				System.out.print("Your program has been ended");
			}
			else {
				System.out.println("Enter correct Id or 0 to end");
			}
			
		}
	}
}

    
    

