package builderPattern;

public class Dog {
	private String name ; // optional 
	private String gender ; // cannot change 
	private String breed ; // cannot change 
	private double price ; 
	
	public String getName() {
		return name;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public String getBreed() {
		return breed;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String s = "Name : " + this.name + " , " + "\n"  ; 
		s += ("Gender : " + this.gender + " , " + "\n") ; 
		s += ("Breed : " + this.breed + " , " + "\n") ; 
		s += ("Price : " + this.price + " , ") ; 
		return s ; 
	}
	
	
	public Dog(DogBuilder builder) {
		this.name = builder.getName() ; 
		this.gender = builder.getGender() ; 
		this.breed = builder.getBreed() ; 
		this.price = builder.getPrice()	; 
	}
	
	public static class DogBuilder {
		private String name ; // optional 
		private String gender ; // cannot change 
		private String breed ; // cannot change 
		private double price ; 
		
		public String getName() {
			return name;
		}
		public DogBuilder setName(String name) {
			this.name = name;
			return this ; 
		}
		
		public String getGender() {
			return gender;
		}
		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this ; 
		}
		
		public String getBreed() {
			return breed;
		}
		public DogBuilder setBreed(String breed) {
			this.breed = breed;
			return this ; 
		}
		
		public double getPrice() {
			return price;
		}
		public DogBuilder setPrice(double price) {
			this.price = price;
			return this ; 
		}
		
		public Dog build() {
			return new Dog(this) ; 
		}
		
	}
	
}
