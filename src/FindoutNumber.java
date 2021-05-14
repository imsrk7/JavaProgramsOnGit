
public class FindoutNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int find = 11;
		boolean check = false;
		
		for(int element : arr) {
			if(element == find) {
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("Number is Found = " +find);
		}else {
			System.out.println("Number is not Found = "+find);
		}
	}

}

