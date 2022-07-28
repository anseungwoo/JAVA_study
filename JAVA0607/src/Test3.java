
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal =new Animal("강아지",12);
		animal.cry();


		
		Dog dog=new Dog();
//		dog=(Dog)animal;
		if (animal instanceof Dog) {
			dog=(Dog)animal;
			animal.cry();
		}
		animal =new Dog();
		animal.cry();
		
		animal=new Cat();
		animal.cry();
		

	}

}

class Animal{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal() {}
	public Animal(String name, int age) {
		super();
		this.name=name;
		this.age=age;
		
	}
	public void cry( ) {
		System.out.println(name+" 동물 울음 소리");
	
		
	}
	
	
}
class Dog extends Animal{
	public Dog() {
		super();
		
	}
	@Override
	public void cry( ) {
		System.out.println("멍멍");
	
		
	}
}
class Cat extends Animal{
	public Cat() {
		super();
		
	}
	@Override
	public void cry( ) {
		System.out.println("야~옹");
	
		
	}
}