package assignments;

public class _109_Compute {

	public static void main(String[] args) {
		int k = 1;
		int total = 0;
		do {
			total += k*k;
			k++;
		}while(k<=50);
		
		System.out.println(total);

	}

}
