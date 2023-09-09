import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAMA DE ESCRITURA Y LECTURA POR CONSOLA");
        System.out.println();
        menu.showMenu();


        int menuOption = sc.nextInt();
        sc.nextLine();
        menu.optionMenu(menuOption, sc);

        System.out.println();
        System.out.println("PROGRAMA FINALIZADO");
    }
}