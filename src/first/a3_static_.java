//package first;
//
//public class a3_static_ {
// template blueprint,plan
// class is logical,global variable exist when you create object

//	int height = 1;
//	int aptitude = 20;
//	int mascularstrength = 10;
//	int firstNo = 4, secondNo = 5, result;
//
//	public static void main(String[] args) {
//
//		a3_static_ obj1 = new a3_static_();
//		System.out.println(obj1.height);
//		System.out.println(obj1.aptitude);
//		System.out.println(obj1.mascularstrength);
//		System.out.println(obj1.firstNo);
//		System.out.println(obj1.secondNo);
//		System.out.println(obj1.result);
//
//		obj1.studying();
//		obj1.gyming();
//		obj1.gyming();
//		obj1.gyming();
//
//		System.out.println("after calling methods...");
//
//		System.out.println(obj1.height);
//
//		System.out.println(obj1.aptitude);
//
//		System.out.println(obj1.mascularstrength);
//
//		System.out.println(obj1.firstNo);
//
//		System.out.println(obj1.secondNo);
//
//		System.out.println(obj1.result);
//
//	}
//
//	void playingBasketball() {
//		height++;
//	}
//
//	void gyming() {
//
//		mascularstrength++;
//	}
//
//	void studying() {
//		aptitude++;
//	}
//
//	void add() {
//		result = firstNo + secondNo;
//
//	}
//
//}
//	package first;
//
//public class a3_static_ {
//	//static dont have copy
//	
//	static int firstNo =4,secondNo =5,result;
//
//	public static void main(String[] args) {
//		a3_static_ obj1 = new a3_static_(); 
//		a3_static_ obj2 = new a3_static_(); 
//		obj1.add();
//		obj2.add();
//		System.out.println(firstNo);
//		System.out.println(result);
//
//
//		
//
//		
//	}
//
//	void add() {
//		result = firstNo + secondNo+result;
//		
//	}
//
//}

//package first;
//
//public class a3_static_ {
//	//static dont have copy
//	
//	int firstNo =4,secondNo =5 ;
//	static int result;
//
//	public static void main(String[] args) {
//		a3_static_ obj1 = new a3_static_(); 
//		a3_static_ obj2 = new a3_static_(); 
//		obj1.add();
//		obj2.add();
//		System.out.println(result);
//
//
//		
//
//		
//	}
//
//	void add() {
//		
//		int result = 50;
//		result = firstNo + secondNo+result;
//		System.out.println(a3_static_.result);
//		System.out.println(result);
//		
//	}
//
//}
//package first;
//
//public class a3_static_ {
//	int i =4;
//	
//
//	public static void main(String[] args) {
//		
//
//
//		
//
//		
//	}
//
//	static void add() {
//		System.out.println(i);// this is illegal to call non static inside static method...
//		
//		
//	}
//
//}

//package first;
//
//public class a3_static_ {
//	static int i = 4;
//
//	public static void main(String[] args) {
//
//		add();
//
//	}
//
//	static void add() {
//		System.out.println(i);// we can access static member inside the non static members
//		//we can access static as well as non static member inside the non static member...
//
//	}
//
//}

//package first;
//class Arithmetic{
//	int i =4;
//	void display() {
//		System.out.println(i);
//		
//		a3_static_ day2= new a3_static_();
//		
//		day2.print();
//	}
//}
//
//
//public class a3_static_ {
//	 int j = 5;
//
//	public static void main(String[] args) {
//		Arithmetic arithmetic = new Arithmetic();
//		
//		arithmetic.display();
//		
//		System.out.println(arithmetic.i);
//		a3_static_ day2= new a3_static_();
//		System.out.println(day2.j);
//		
//		day2.print();
//		
//	}
//	void print() {
//		System.out.println(j);
//
//	}
//
//}

//package first;
//class Aircraft{
//	int altitude = 0;
//	int fly()
//	 {
//		altitude = 35000;
//		return altitude;
//	}
//}
//class Human{
//	double longitude = 23.45;
//	double latitude = 6677.23423;
//	double altitude = 0;
//	void getAltitude() {
//		Aircraft aircraft = new Aircraft();
//		altitude = aircraft.fly();
//		
//	}
//	
//	void walk() {
//		longitude = longitude +10.00;
//		latitude = latitude +4565.23;
//	}
//	
//	}
//
//
//public class a3_static_ {
//	 
//
//	public static void main(String[] args) {
//		Human human = new Human();
//		System.out.println(human.longitude);
//		System.out.println(human.latitude);
//		System.out.println(human.altitude);
//		
//		human.getAltitude(); human.walk();
//		
//		System.out.println(human.longitude);
//		System.out.println(human.latitude);
//		System.out.println(human.altitude);
//		
//	}
//	
//
//	}
//

//package first;
//
//class car {
//	int i =4;
//	void tyres() {
//		System.out.println("inside tyres() of car"+i);
//	}
//}
//
//	class swift extends car {
//		int j =5;
//
//		void steeringwheel() {
//			System.out.println("inside steeringwheel() of swift"+j+1);
//
//		}
//	}
//
//		public class a3_static_ {
//
//	public static void main(String[] args) {
//		swift swift = new swift(); swift.steeringwheel(); swift.tyres(); 
//		
//		car car = new car(); car.tyres();
//		
//	}
//		}




//package first;
//
//class car {
//	int mileage =4000;
//	void tyres() {
//		System.out.println("inside tyres() of car"+mileage);
//	}
//}
//
//	class swift extends car {
//		int average =5;
//		int mileage = 2000;
//
//		void steeringwheel() {
//			System.out.println("inside steeringwheel() of swift"+average+mileage);
//			System.out.println("super class"+super.mileage);
//
//		}
//	}
//
//		public class a3_static_ {
//
//	public static void main(String[] args) {
//		
//		
//		
//		swift swift = new swift(); swift.steeringwheel(); swift.tyres(); 
//		
//		car car = new car(); car.tyres(); car car=new swift(); car2.tyres(); System.out.println(car.mileage);
//		
//	}
//		}


//package first;
//
//class car {
//	int i=4;
//	void tyres() {
//		System.out.println("inside tyres() of car"+i);
//	}
//}
//
//	class swift extends car {
//		int average =5;
//		int mileage = 2000;
//
//		void steeringwheel() {
//			System.out.println("inside steeringwheel() of swift"+average+mileage);
//			System.out.println("super class"+super.i);
//
//		}
//	}
//
//		public class a3_static_ {
//
//	public static void main(String[] args) {
//		
//		
//		
//		swift swift = new swift(); swift.steeringwheel(); swift.tyres(); 
//		
//		car car = new car(); car.tyres(); car car=new swift(); car2.tyres(); System.out.println(car.mileage);
//		
//	}
//		}


package first;

class car {
	int i=4;
	void tyres() {
		System.out.println("inside tyres() of car"+i);
	}
}

	class swift extends car {
		int average =5;
		int mileage = 2000;

		void steeringwheel() {
			System.out.println("inside steeringwheel() of swift"+average+mileage);
			System.out.println("super class"+super.i);

		}
	}

		public class a3_static_ {

	public static void main(String[] args) {
		
		
		
		swift swift = new swift(); swift.steeringwheel(); swift.tyres(); 
		
		car car = new car(); car.tyres(); car car=new swift(); car2.tyres(); System.out.println(car.mileage);
		
	}
		}
