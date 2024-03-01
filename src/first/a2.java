package first;

public class a2 {
//	int i = 4;
	int firstNo =4;
	int secondNo=5;
//	int result = firstNo+secondNo;
	int result;
	public static void main(String[]args) {
		//to create object
//		a2 day1 = new a2();
//		int j =5;
//		System.out.println(day1.i);
//		System.out.println(j);
		
		
		//to add two numbers
//		a2 sum = new a2();
//		int result = sum.firstNo+sum.secondNo;
//		System.out.println(result);
		
		// to create object and assign values
		a2 day1 = new a2();
		a2 day2= new a2();
		System.out.println(day1.firstNo);
		System.out.println(day1.secondNo);
		System.out.println(day1.result);
		
		System.out.println(day2.firstNo);
		System.out.println(day2.secondNo);
		System.out.println(day2.result);
		System.out.println(day1.firstNo+day2.firstNo);
		
		
		day1.result =day1.firstNo+day1.secondNo;
		
		day2.secondNo=100;
		
		day2.result =day2.firstNo+day2.secondNo;
		
		System.out.println("After changing states");
		
		System.out.println(day1.firstNo);
		System.out.println(day1.secondNo);
		System.out.println(day1.result);
		
		System.out.println(day2.firstNo);
		System.out.println(day2.secondNo);
		System.out.println(day2.result);
		
		
	}


}

