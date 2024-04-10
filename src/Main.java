import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Menu principal
        int opcion;
        do {
            System.out.println("****MENU CRUD****\n" +
                    "1.-Crear Usuario\n" +
                    "2.-Ver Usuarios\n" +
                    "3.-Actualizar Usuario\n" +
                    "4.-Eliminar Usuario\n" +
                    "5.-Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Funciones.crearUsuario();
                    break;
                case 2:
                    Funciones.verUsuario();
                    break;
                case 3:
                    Funciones.actualizarUsuario();
                    break;
                case 4:
                    Funciones.eliminarUsuario();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (opcion!=5);
    }
}

