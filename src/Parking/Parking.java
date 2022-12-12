package Parking;

import java.util.Random;
import java.util.Scanner;

public class Parking {
    private int tamañoParking;
    private vehiculo[] parking;
    Scanner cubrir = new Scanner(System.in);

    public Parking(int tamañoParking) {
        this.tamañoParking = tamañoParking;
        parking = new vehiculo[tamañoParking];
    }

    public vehiculo[] getParking() {
        return parking;
    }

    public void setParking(int tamañoParking) {
        this.parking = parking;
    }

    public vehiculo[] añadirVehiculo(int manualAleatorio) {

        if (manualAleatorio == 1) {
            for (int i = 0; i < parking.length; i++) {

                System.out.println(i + " añade tu vehiculo: \n1 coche \n2 camion");
                int añadirMano = cubrir.nextInt();
                vehiculo tipoDeVehiculo = new vehiculo(añadirMano);
                if (añadirMano == 1) {
                    parking[i] = tipoDeVehiculo;
                }
                if (añadirMano == 2) {
                    if (i < (parking.length - 1)) {
                        parking[i] = tipoDeVehiculo;
                        parking[i + 1] = tipoDeVehiculo;
                        i++;
                    } else {
                        System.out.println("No hay espacio para añadir un camion mas, puedes añadir un coche mas \n1 si \n2 no");
                        int meterCoche = cubrir.nextInt();
                        if (meterCoche == 1) {
                            tipoDeVehiculo.setTipo("coche");
                            vehiculo añadirCoche = new vehiculo(meterCoche);
                            parking[parking.length - 1] = tipoDeVehiculo;
                        }
                    }
                }
            }
            System.out.println("Asi queda tu parking: ");
            for (int i = 0; i < parking.length; i++)
                System.out.println("En posicion " + (i + 1) + parking[i]);
        }
        if (manualAleatorio == 2) {
            for (int i = 0; i < parking.length; i++) {
                Random aleatorioVehiculo = new Random();
                int aleatori = aleatorioVehiculo.nextInt(2) + 1;
                vehiculo tipoDeVehiculo = new vehiculo(aleatori);
                if (aleatori == 1) {
                    parking[i] = tipoDeVehiculo;
                }
                if (aleatori == 2) {
                    if (i < (parking.length - 1)) {
                        parking[i] = tipoDeVehiculo;
                        parking[i + 1] = tipoDeVehiculo;
                        i++;
                    } else {
                        System.out.println("No hay espacio para añadir un camion mas, puedes añadir un coche mas \n1 si \n2 no");
                        int meterCoche = cubrir.nextInt();
                        if (meterCoche == 1) {
                            tipoDeVehiculo.setTipo("coche");
                            vehiculo añadirCoche = new vehiculo(meterCoche);
                            parking[parking.length - 1] = tipoDeVehiculo;
                        }
                    }
                }
            }
            System.out.println("Asi queda tu parking: ");
            for (int i = 0; i < parking.length; i++)
                System.out.println("En posicion " + (i + 1) + parking[i]);
        }
        return parking;
    }

    public void buscarPorMatricula(int matriculaIndice) {
        if (matriculaIndice == 1) {
            Scanner cubrir = new Scanner(System.in);
            System.out.println("Introduce la matricula de tu vehiculo: ");
            String consultaMatricula = cubrir.nextLine();

            for (int i = 0; i < parking.length; i++) {
                if (parking[i].getMatricula().equals(consultaMatricula)) {
                    System.out.println("Tu vehiculo esta en la plaza: " + (i + 1));
                }
            }
        }
    }

    public void buscarPorIndice(int matriculaIndice) {
        if (matriculaIndice == 2) {
            Scanner cubrir = new Scanner(System.in);
            System.out.println("Introduce la posicion de tu vehiculo: ");
            int consultarIndice = cubrir.nextInt();
            if (parking[consultarIndice - 1] != null) {
                System.out.println("La " + consultarIndice + "º plaza del parking la ocupa" + parking[consultarIndice - 1]);
            }
        }
    }

    //Esta parte del parking aun esta en obras
    public void retirarVehiculo(int quieresRetirar, int matriculaPlaza) {
        if (quieresRetirar == 1) {
            if (matriculaPlaza == 1) {
                Scanner cubrir = new Scanner(System.in);
                System.out.println("Introduce la matricula de tu vehiculo: ");
                String consultaMatricula = cubrir.nextLine();
            }else {
                Scanner cubrir = new Scanner(System.in);
                System.out.println("Introduce la posicion de tu vehiculo: ");
                int consultarIndice = cubrir.nextInt();
            }
        } else {
            System.out.println("De acuerdo, gracias");
        }
    }

}





