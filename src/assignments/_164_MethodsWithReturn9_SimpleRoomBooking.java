package assignments;

public class _164_MethodsWithReturn9_SimpleRoomBooking {
	
	public static void main(String[] args) {
		System.out.println(simpleRoomBook(true, 8,12,2018));
	}
	
	  public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	   return isAvailable&&(month!=7||!(day>=1&&day<=8))&&(year==2018);
	  }

}
