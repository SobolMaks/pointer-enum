import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, selects a mark car: ");
        Car.showCar();
        System.out.println("Enter a mark car: ");
        String writePraise = scanner.nextLine();
        scanner.close();
        Car.showCarPraise(Car.valueOf(writePraise));


    }
}
