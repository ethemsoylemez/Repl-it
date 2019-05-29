package assignments;

//public class for main method
public class _205_OOP_8ParkingMeeter {
	public static void main(String[] args) {
		ParkingMeter pm = new ParkingMeter(45);
		System.out.println(pm.add(25));
		pm.tick();
		System.out.println(pm.timeLeft);
		System.out.println(pm.isExpired());
		
	}

}

//Class
class ParkingMeter{
	  
	  int timeLeft = 0;
	  int maxTime;
	  
	  public ParkingMeter(int maxTime){
	    this.maxTime = maxTime;
	  }
	  public boolean add(int param){
	    if(param ==25 && timeLeft<=maxTime){
	      timeLeft += 30;
	      return true;
	    }else{
	      return false;
	    }
	  }
	  public void tick(){
	    if(timeLeft>0){
	      timeLeft--;
	    }
	  }
	  public boolean isExpired(){
	    return timeLeft == 0;
	  }
	}
