
/**
 * Write a description of class Ventas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas2 {
    public static void Ventas2 (String[] args){

        Scanner sc = new Scanner(System.in);
        int numeroVendedores;
        VendedoresPOO[] losVendedores = new VendedoresPOO[50];
        String identificacion, nombre, Venta;
        double lunes, martes, miercoles, jueves, viernes;
        double promedio = 0;

        System.out.println("Digite la cantidad de vendedores: ");
        numeroVendedores = sc.nextInt();

        for (int i = 0; i < numeroVendedores; i++){
            System.out.print("Digite la identificacion del vendedor: ");
            identificacion = sc.next();
            System.out.print("Digite la nombre del vendedor: ");
            nombre = sc.next();
            System.out.print("Digite el nombre de la aerolinea: ");
            Venta = sc.next();
            System.out.print("Digite las ventas del lunes de " + nombre + ": ");
            lunes = sc.nextDouble();
            System.out.print("Digite las ventas del martes de " + nombre + ": ");
            martes = sc.nextDouble();
            System.out.print("Digite las ventas del miercoles de " + nombre + ": ");
            miercoles = sc.nextDouble();
            System.out.print("Digite las ventas del jueves de " + nombre + ": ");
            jueves = sc.nextDouble();
            System.out.print("Digite las ventas del viernes de " + nombre + ": ");
            viernes = sc.nextDouble();

            VendedoresPOO unVendedor = new VendedoresPOO();
            unVendedor.identificacion = identificacion;
            unVendedor.nombre = nombre;
            unVendedor.Venta = Venta;
            unVendedor.lunes = lunes;
            unVendedor.martes = martes;
            unVendedor.miercoles = miercoles;
            unVendedor.jueves = jueves;
            unVendedor.viernes = viernes;
            losVendedores[i] = unVendedor;
        }
        for (int i = 0; i < numeroVendedores; i++){
            double sum = (losVendedores[i].lunes + losVendedores[i].martes + losVendedores[i].miercoles + losVendedores[i].jueves + losVendedores[i].viernes)/5;
            promedio = promedio + sum / numeroVendedores;
        }
        System.out.println("El promedio de ventas es: " + promedio);
    }
}
