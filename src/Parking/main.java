package Parking;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner rellenar = new Scanner(System.in);
        System.out.println("Indica cuantas plazas tiene el parking: ");
        int nPlazas=rellenar.nextInt();
        System.out.println("La entrada de vehiculos sera \n1 Manual \n2 Aleatoria");
        int manualAleatorio= rellenar.nextInt();
        System.out.println("¿Como quieres localizar tu vehiculo? \n1 Buscando por matricula \n2 Buscando por la plaza");
        int matriculaIndice= rellenar.nextInt();
        Parking aparcamiento=new Parking(nPlazas);
        aparcamiento.añadirVehiculo(manualAleatorio);
        aparcamiento.buscarPorMatricula(matriculaIndice);
        aparcamiento.buscarPorIndice(matriculaIndice);
        System.out.println("¿Deseas retirar tu vehiculo? \n1 Si \n2 No");
        int quieresRetirar= rellenar.nextInt();
        System.out.println("Deseas retirar tu vehiculo buscando por \n1 Matricula \n2 Plaza");
        int matriculaPlaza= rellenar.nextInt();
        aparcamiento.retirarVehiculo(quieresRetirar,matriculaPlaza);


    }
}
