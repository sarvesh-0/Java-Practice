package day2HW;

public class Chair {
	String color ;
	String chairType ;
	int chairNo ;
	boolean foaldable;
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setChairType(String ct) {
		chairType = ct;
	}
	public String getChairType() {
		return chairType;
	}
	public void setChairNo(int cs) {
		chairNo = cs;
	}
	public int getChairNo() {
		return chairNo;
	}
	public void setFoaldable(boolean f) {
		foaldable = f;
	}
	public boolean getFoaldable() {
		return foaldable ;
	}
	
	public static void main(String[] args) {
		Chair c1 = new Chair();
		c1.setChairNo(15);
		c1.setChairType("Steel");
		c1.setColor("Black");
		c1.setFoaldable(true);
		
		System.out.println("ChairNo : " +c1.getChairNo());
		System.out.println("Chair Type : " +c1.getChairType());
		System.out.println("Chair Color : " +c1.getColor());
		System.out.println("Foaldable : " +c1.getFoaldable());
}
}
