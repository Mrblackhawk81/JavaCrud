import java.util.Scanner;

public class Funciones {
    private static String[] clientes = new String[0];

    public static void crearUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes a ingresar");
        int n = sc.nextInt();
        String[] temp = new String[clientes.length +n];
        System.arraycopy(clientes,0,temp,0,clientes.length);

        for (int i = clientes.length; i < temp.length; i++) {
            System.out.println("Ingrese el nombre del cliente");
            temp[i] = sc.next();
        }
        clientes = temp;
    }
    public static void verUsuario(){
        if (clientes == null || clientes.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Lista de Clientes");
        for (String nombres: clientes) {
            System.out.println(nombres);
        }
    }

    public static void actualizarUsuario(){
        Scanner sc = new Scanner(System.in);
        if (clientes == null || clientes.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese el nombre del cliente");
        String rename = sc.next();
        for (int i = 0; i < clientes.length; i++) {
            if (rename.equals(clientes[i])){
                System.out.println("Ingrese el nuevo nombre");
                String newName = sc.next();
                clientes[i]= newName;
            }
        }
    }

    public static void eliminarUsuario(){
        Scanner sc = new Scanner(System.in);
        if (clientes == null || clientes.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese el nombre del cliente a eliminar");
        String remove = sc.next();
        boolean found = false;
        for (int i = 0; i < clientes.length; i++) {
            if (remove.equals(clientes[i])){
                for (int j = i; j < clientes.length -1 ; j++) {
                    clientes[j] = clientes[j + 1];
                }
                //Array temporal donde estara el nuevo tamaño del array
                String[] temp = new String[clientes.length - 1];
                System.arraycopy(clientes,0,temp,0,temp.length);
                clientes = temp;

                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("El cliente a eliminar no se encontro");
        }else {
        System.out.println("Cliente eliminado");
        }
    }
}
