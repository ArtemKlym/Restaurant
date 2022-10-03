import java.util.Scanner;
public class Menu {

    public static void menu(){
        int choice,i = 1;

        System.out.println("Welcome to menu\nWhat do you want to eat?");

        Scanner scanner = new Scanner(System.in);
        ListOfFood list_of_food = ListOfFood.COFFEE;

        for(ListOfFood list:ListOfFood.values()){
            System.out.println(i + ")" + list + " "+list_of_food.show_price());
            i++;
        }
        choice = scanner.nextInt();

        scanner.close();
    }
}
