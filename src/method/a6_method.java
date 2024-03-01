package method;
abstract class animal
{
	public abstract void soung();
}
class Dog extends animal
{
	public void sound() {
		System.out.println("Dog is baraking ");
	}
}

abstract class Lion extends animal
{
	public void sound() {
		System.out.print("lion roar");
	}
}

public class a6_method {
	public static void main(String[]args) {
		
		Dog r=new Dog();
		r.sound();
	}
	}

