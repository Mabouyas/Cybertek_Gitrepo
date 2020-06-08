package day48_Abstraction;



class IPhone extends Phone {
	static{
		brand = "IPhone";
		
	}
	
	public IPhone(String model, double price, String size){
		this.model = model;
		this.price = price;
		this.size = size;
	}
	
	@Override
	public void calling(long phoneNumber) {
		System.out.println("iPhone is calling "+phoneNumber);
	}
	
	@Override
	public void texting(long phoneNumber) {
		System.out.println("iPhone is texting  "+phoneNumber);
	}
	
	public void faceTiming(long phoneNumber){
		System.out.println("iPhone is facetiming with "+phoneNumber);
	}
	
}
