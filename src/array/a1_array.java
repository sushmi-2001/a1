package array;
import java.util.Arrays;
public class a1_array {
	
	public static void main(String[] args) {
		
		String a[]= {"Learn","Coding","Keypoints","Education"};
		
		System.out.println("tostring()"+Arrays.toString(a));
		
		System.out.println("aslist()"+Arrays.asList(a));
		
		int arr[][]= {{10,20},{30,40}};
		System.out.println("deeptostring()"+Arrays.deepToString(a));
	}

}
