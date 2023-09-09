import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private MyWriter writer = new MyWriter();
    private MyReader reader = new MyReader();
    private String fileName;
    private String text;

    public void showMenu(){
        System.out.println("Menu de opciones:");
        System.out.println(" Escribe 1 para crear un archivo." +
                "\n Escribe 2 para leer un archivo." +
                "\n Escribe 3 para borrar el contenido de un archivo." +
                "\n Escribe 4 para aniadir mas texto a un archivo." +
                "\nEscribe tu opcion: ");
    }

    public void optionMenu(int option, Scanner sc){
        switch (option) {
            case 1:
                System.out.println("Escribe la ruta y el nombre del archivo que desees crear con su extension:\nEjemplo: ./texto.txt");
                fileName = sc.nextLine();
                sc.close();
                try {
                    writer.createFile(fileName);
                    System.out.println("Archivo creado correctamente.");
                } catch (IOException e) {
                    System.out.println("Ha habido un problema y el archivo no se ha creado correctamente.");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("Escribe la ruta y el nombre del archivo que desees leer con su extension:\nEjemplo: ./texto.txt");
                fileName = sc.nextLine();
                sc.close();
                try {
                    reader.reader(fileName);
                } catch (IOException e) {
                    System.out.println("Ha habido un problema y el archivo no se ha podido leer.");
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Escribe la ruta y el nombre del archivo que desees borrar su contenido con su extension:\nEjemplo: ./texto.txt");
                fileName = sc.nextLine();
                sc.close();
                try {
                    writer.deleteContent(fileName);

                } catch (IOException e) {
                    System.out.println("Ha habido un problema y no se ha podido borrar el contenido del archivo.");
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println("Escribe la ruta y el nombre del archivo en el que quieras aniadir mas contenido con su extension:\nEjemplo: ./texto.txt");
                fileName = sc.nextLine();
                System.out.println("Escribe el texto que quieras aniadir:");
                text = sc.nextLine();
                sc.close();
                try {
                    writer.writer(fileName, text);
                } catch (IOException e) {
                    System.out.println("Ha habido un problema y no se ha podido escribir el contenido en el archivo.");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("No has marcado ninguna opcion valida.");
        }
    }
}
