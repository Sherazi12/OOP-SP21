package Q2;

public class Laptop extends Computer{
	  private int length;
	    private int breadth;
	    private int height;
	    private int weight;
	    public Laptop(){
	        length=0;
	        breadth=0;
	        height=0;
	        weight=0; 
	    }
	    public Laptop(int wordSize,int memorySize,int storageSize,int speed,int length,int breadth,int height,int weight ){
	        super(wordSize,memorySize,storageSize,speed);
	        this.length=length;
	        this.breadth=breadth;
	        this.height=height;
	        this.weight=weight;
	    }
	    public int getLength() {
	        return length;
	    }

	    public void setLength(int length) {
	        this.length = length;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }

	    public int getbreadth() {
	        return breadth;
	    }

	    public void setbreadth(int breadth) {
	        this.breadth = breadth;
	    }
	    
	    
	    public void Display(){
	        System.out.println("\n The word size in bits is "+wordSize+
	                "\n The storage size in megabytes is "+storage+
	                "\n The memory size in megabytes is "+memorySize+
	                "\n The speed in mega hertz is "+speed+
	                "\n The breadth of laptop is "+breadth+
	                "\n The length of laptop is "+length+
	                "\n The weight of laptop is "+weight+
	                "\n The heigth of laptop is "+height);
	    }
}
