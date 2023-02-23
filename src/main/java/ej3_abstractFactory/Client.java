package ej3_abstractFactory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ArtefactoElectronico television = factory.create("television",3000);
        ArtefactoElectronico radio = factory.create("radio",250);
        ArtefactoElectronico microondas = factory.create("microondas",750);
        ArtefactoElectronico refrigerador = factory.create("refrigerador",10000);
        ArtefactoElectronico batidora = factory.create("batidora",300);

        television.showInfo();
        radio.showInfo();
        microondas.showInfo();
        refrigerador.showInfo();
        batidora.showInfo();
    }
}
