import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        ConvenioU conveniou  = new ConvenioU();

        executeGame(conveniou);


    }

    private static void executeGame(ConvenioU conveniou) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- suscribir Factura\n" +
                "2- eliminar Factura \n" +
                "3- publicar convenio\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Subscribir Factura");
                String nameToBeAdded = sc2.nextLine();

                Convenio convenio = new Convenio(nameToBeAdded);
                conveniou.addObserver(convenio);


                System.out.println("Factura suscrito.");
                executeGame(conveniou);
                break;

            case 2:
                conveniou.getObservers().forEach(System.out::println);

                System.out.println("Retirar factura");
                String nameToBeRemoved = sc2.nextLine();

                conveniou.removeByName(nameToBeRemoved);
                System.out.println("factura eliminada.");
                executeGame(conveniou);
                break;

            case 3:
                System.out.println("Publicar convenio");
                String link = sc2.nextLine();
                conveniou.addFactura(link);
                executeGame(conveniou);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}