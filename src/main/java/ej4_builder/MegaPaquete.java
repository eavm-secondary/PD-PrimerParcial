package ej4_builder;

public class MegaPaquete extends ComboBuilder {
    @Override
    public void buildTamanioPipocas() {
        combo.setTamanioPipocas("extragrande");
    }

    @Override
    public void buildNumPipocas() {
        combo.setNumPipocas(1);
    }

    @Override
    public void buildTamanioRefrescos() {
        combo.setTamanioRefrescos("extragrande");
    }

    @Override
    public void buildNumRefrescos() {
        combo.setNumRefrescos(3);
    }

    @Override
    public void buildChocolates() {
        combo.setChocolates(2);
    }
}
