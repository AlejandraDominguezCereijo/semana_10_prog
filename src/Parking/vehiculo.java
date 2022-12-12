package Parking;

import java.util.Random;
import java.util.Scanner;

public class vehiculo {
    private int tamañoVehiculo;
    private String tipo, matricula;

    public vehiculo(int tamañoVehiculo) {
        this.tamañoVehiculo = tamañoVehiculo;
        if (tamañoVehiculo == 1) {
            tipo = "coche";
        }
        if (tamañoVehiculo == 2) {
            tipo = "camion";
        }
        alMatricula();
    }

    public String toString() {
        return " un vehiculo tipo " + tipo + " con matricula " + matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String alMatricula() {
        Random al = new Random();
        int aleatorio = al.nextInt(9999) + 1000;

        String[] letras = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        Random let = new Random();
        int aleatorioLet = let.nextInt(letras.length);
        Random letr = new Random();
        int aleatorioLetr = letr.nextInt(letras.length);
        Random letra = new Random();
        int aleatorioLetra = letra.nextInt(letras.length);
        matricula = aleatorio + letras[aleatorioLet] + letras[aleatorioLetr] + letras[aleatorioLetra];

        return matricula;

    }
}


