import java.util.*;
public class WeirdOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Here ");
		int N = sc.nextInt();
		if(N%2==0){
            if(N>1){
                if(N<6){
                    System.out.println("Not Weird");
                }
                else if(N<21){
                    System.out.println("Weird");
                }
                else{
                    System.out.println("Not Weird");
                }
            }
        }
        else{
            System.out.println("Weird");
        }
	
	}
	

}
