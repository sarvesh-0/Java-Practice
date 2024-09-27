package lab5;
//Write a method in the Date class that prints date using constructor chaining.
public class Date {
    private int d;
    private int m;
    private int y;

    public Date() {
        this(1, 1, 2000);
    }

    public Date(int day, int month) {
        this(day, month, 2000); 
    }

    public Date(int day, int month, int year) {
        this.d = day;
        this.m = month;
        this.y = year;
    }

    public void printDate() {
        System.out.println(d + "/" + m + "/" + y);
    }

    public static void main(String[] args) {
   
        Date d1 = new Date();
        Date d2 = new Date(15, 8);
        Date d3 = new Date(25, 12, 2024);

        d1.printDate();  // Output: 1/1/2000
        d2.printDate();  // Output: 15/8/2000
        d3.printDate();  // Output: 25/12/2024
    }
}