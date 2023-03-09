import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width");
        double width=scanner.nextDouble();
        System.out.println("Enter height");
        double height=scanner.nextDouble();

        RecTangle recTangle= new RecTangle(width,height);
        System.out.println("Your rentagle is :" +recTangle.display());
        System.out.println("Your parameter is :" +recTangle.getPerimeter());
    }
}