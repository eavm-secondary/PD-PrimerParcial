package ej3_abstractFactory;

public class Factory {
    public ArtefactoElectronico create(String type, int precio){
        ArtefactoElectronico artefacto = switch (type.toLowerCase()) {
            case "television" -> new Television();
            case "radio" -> new Radio();
            case "batidora" -> new Batidora();
            case "refrigerador" -> new Refrigerador();
            case "microondas" -> new Microondas();
            default -> new Television();
        };
        artefacto.setPrecio(precio);
        return artefacto;
    }
}
