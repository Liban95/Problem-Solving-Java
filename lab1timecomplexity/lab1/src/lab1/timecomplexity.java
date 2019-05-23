package lab1;
import java.util.Scanner;


public class timecomplexity {

	public static void main(String[] args) {
		int[] A = new int[6];
		Scanner keyboard = new Scanner(System.in);

		
		int i = 0;
		while(keyboard.hasNextInt()){
			A[i] = keyboard.nextInt();
			i++;
			if (i == 6){
				break;
			}
		}
		foundFirst(9,A);
		keyboard.close();
	}
	public static boolean foundFirst(int x, int Y[]){
		
		int count = 1;
		  boolean found = false;
		  count++;
		  int i =0;
		  System.out.println("Step 1-2: "+count);
		  count++;
		  while ((!found)&&(i<Y.length)) {
		    count++;
		    found = (x ==Y[i]);
		    count++;
		    i++;
		    count++;
		  }
		  System.out.println("Step 1-6: " + count);
		  count++;
		  System.out.println("All steps: "+ count);
		  return found;
	}
}
