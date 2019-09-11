import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        for( String color: colors){
            System.out.println(color);
        }
        System.out.println();

        System.out.println(colors.get(1));
        String response;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a color of your choise: ");
            String userColor = input.nextLine();
            colors.add(userColor);

            System.out.println("Do you want enter another color? Answer Y if you want to continue or 'Q' if you want to quit.('Y'/'Q')");
            response = input.nextLine();

        }while(!response.equalsIgnoreCase("q"));

        System.out.println("Thanks for playing. Bye!");

        System.out.println(colors);





    }
}
