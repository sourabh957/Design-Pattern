package builderPattern;

public class Driver {

	public static void main(String[] args) {
		Dog d1 = new Dog.DogBuilder().setName("Bruno").setGender("Male").setPrice(20).build() ; 
		
		System.out.println(d1) ; 
		
		System.out.println();
		
		Dog d2 = new Dog.DogBuilder().setName("Chaman").setGender("Female").build() ; 
		
		System.out.println(d2);
		
	}

}
