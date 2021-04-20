package Q2;

public class Computer {
	 protected int wordSize;
	    protected int memorySize;
	    protected int storage;
	    protected int speed;
	    
	    public Computer(){
	        wordSize=0;
	        memorySize=0;
	        storage=0;
	        speed=0;
	    }
	    public Computer(int wordSize,int memorySize,int storage,int speed){
	        this.wordSize=wordSize;
	        this.memorySize=memorySize;
	        this.storage=storage;
	        this.speed=speed;
	    }

	    public int getWordSize() {
	        return wordSize;
	    }

	    public void setWordSize(int wordSize) {
	        this.wordSize = wordSize;
	    }

	    public int getstorage() {
	        return storage;
	    }

	    public void setstorage(int storage) {
	        this.storage = storage;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public int getMemorySize() {
	        return memorySize;
	    }

	    public void setMemorySize(int memorySize) {
	        this.memorySize = memorySize;
	    }
	  
	    public void Display(){
	        System.out.println("The word size in bits is "+wordSize+
	                "\n The memory size in megabytes is "+memorySize+
	                "\n The storage size in megabytes is "+storage+
	                "\n The speed in mega hertz is "+speed);
	    }

}
