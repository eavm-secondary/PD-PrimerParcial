package ej1_singleton;

public class Client {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234ABC", "Camioneta", "Rojo");
        Vehiculo v2 = new Vehiculo("3564BCD", "Camion", "Verde");
        Vehiculo v3 = new Vehiculo("9124AFB", "Camioneta", "Rojo");
        Vehiculo v4 = new Vehiculo("2534NFC", "Camion", "Negro");
        Vehiculo v5 = new Vehiculo("9204AMC", "Bus", "Azul");
        Vehiculo v6 = new Vehiculo("1273ABP", "Convertible", "Negro");

        v1.pasarPeaje();
        v2.pasarPeaje();
        v3.pasarPeaje();
        v4.pasarPeaje();
        v5.pasarPeaje();
        v6.pasarPeaje();

        CabinaPeaje.getInstance().showInfo();
    }
}
