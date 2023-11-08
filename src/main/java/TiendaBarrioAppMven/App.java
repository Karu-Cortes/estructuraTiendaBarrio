package TiendaBarrioAppMven;

import TiendaBarrioAppMven.application.services.MenuFinal;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    /* Switch- case para la solicitud del usuario en la ejecución del menú de opciones.*/
    {
        int opciones = ejecutarMenu();
        while (opciones != 11){
            switch (opciones) {
                case 1 -> System.out.println("numero 1");
                case 2 -> System.out.println("numero 2");
                case 3 -> System.out.println("numero 3");
                case 4 -> System.out.println("numero 4");
                case 5 -> System.out.println("numero 5");
                case 6 -> System.out.println("numero 6");
                case 7 -> System.out.println("numero 7");
                case 8 -> System.out.println("numero 8");
                case 9 -> System.out.println("numero 9");
                case 10 -> System.out.println("numero 10");
                case 11 -> System.out.println("Saliendo del menú ");
            }
            opciones = ejecutarMenu();
        }

    }


    public static int ejecutarMenu() {

        /* el metodo MENU_FINAL de la clase MenuFinal, el cual nos va a mostrar todo el menu de opciones del programa */

        System.out.println(MenuFinal.MENU_FINAL);

        Scanner scanner = new Scanner(System.in);
        int opciones =10;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 11 )
            {
                System.out.println("La opción seleccionada no es válida");
                ejecutarMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opción seleccionada no es válida");
            ejecutarMenu();
        }
        return opciones;
}

}
