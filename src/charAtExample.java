
public class charAtExample {
 public static void main(String [] args) {
	 String s = "Welcome to Automation Testing";          
       for (int i=0; i<=s.length()-1; i++) {  
         if(i%2!=0) {  
             System.out.println("Char at "+i+" place "+s.charAt(i));  
         }  
     }  
  }
}
