package java1;

public class Operations {
    static double x = 10;
    static double y = 20;

    static double sum = x + y;
    static double difference = x - y;
    static double average = (x + y) / 2;

    
    static double Minimum() 
    {
        return Math.min(x, y);
    }

    static double Maximum() 
    {
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average); 
        System.out.println("Difference is " + difference);
        
        

        System.out.println("Minimum is " + Minimum());
        System.out.println("Maximum is " + Maximum());
    }
}
