package ej1_singleton;

import java.util.ArrayList;
import java.util.List;

public class CabinaPeaje {
    private static final CabinaPeaje instance = new CabinaPeaje();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private double dineroRecaudado = 0;

    private CabinaPeaje(){}

    public static CabinaPeaje getInstance() {
        return instance;
    }

    public void registrarVehiculo(Vehiculo newVehiculo){
        vehiculos.add(newVehiculo);
        double monto = switch (newVehiculo.getModelo().toLowerCase()) {
            case "camioneta" -> 500;
            case "camion" -> 1000;
            case "bus" -> 2000;
            default -> 10000;
        };

        dineroRecaudado+=monto;
    }

    public void showInfo(){
        System.out.println("Vehiculos:");
        for (Vehiculo v: vehiculos) {
            System.out.println(v);
        }
        System.out.println("Dinero recaudado: "+dineroRecaudado);
    }
}
