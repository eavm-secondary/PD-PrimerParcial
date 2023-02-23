package ej4_builder;

public class PaqueteMediano extends ComboBuilder {
    @Override
    public void buildTamanioPipocas() {
        combo.setTamanioPipocas("grande");
    }

    @Override
    public void buildNumPipocas() {
        combo.setNumPipocas(1);
    }

    @Override
    public void buildTamanioRefrescos() {
        combo.setTamanioRefrescos("grande");
    }

    @Override
    public void buildNumRefrescos() {
        combo.setNumRefrescos(2);
    }

    @Override
    public void buildChocolates() {
        combo.setChocolates(1);
    }
}
