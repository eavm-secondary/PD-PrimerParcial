package ej4_builder;

public class PaqueteNormal extends ComboBuilder {
    @Override
    public void buildTamanioPipocas() {
        combo.setTamanioPipocas("normal");
    }

    @Override
    public void buildNumPipocas() {
        combo.setNumPipocas(1);
    }

    @Override
    public void buildTamanioRefrescos() {
        combo.setTamanioRefrescos("normal");
    }

    @Override
    public void buildNumRefrescos() {
        combo.setNumRefrescos(1);
    }

    @Override
    public void buildChocolates() {
        combo.setChocolates(0);
    }
}
