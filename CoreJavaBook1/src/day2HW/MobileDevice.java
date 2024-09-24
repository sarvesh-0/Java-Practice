package day2HW;

public class MobileDevice {
	String company ;
	int modelNo ;
	String modelName ;
	double price ;
	
	public void setCompany(String c){
		company = c;
	}
	
	public void setModelNo(int m){
		modelNo = m;
	}
	
	public void setModelName(String mn){
		modelName = mn;
	}
	
	public void setPrice(double p) {
		price=p;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getModelNo() {
		return modelNo;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		MobileDevice m1 = new MobileDevice();
		m1.setCompany("Samsung");
		m1.setModelName("Galaxy M42");
		m1.setModelNo(1000);
		m1.setPrice(28000);
		
		System.out.println("Company : "+m1.getCompany()+"... ModelName : "+m1.getModelName());
		System.out.println("ModelNo : "+m1.getModelNo()+"... Price : "+m1.getPrice());
	}

}
