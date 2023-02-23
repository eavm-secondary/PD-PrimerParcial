package ej4_builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new MegaPaquete());
        ComboCine combo1 = director.buildCombo();

        director.setBuilder(new PaqueteMediano());
        ComboCine combo2 = director.buildCombo();

        director.setBuilder(new PaqueteNormal());
        ComboCine combo3 = director.buildCombo();

        combo1.showInfo();
        combo2.showInfo();
        combo3.showInfo();
    }
}
