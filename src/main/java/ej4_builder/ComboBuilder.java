package ej4_builder;

public abstract class ComboBuilder {
    protected ComboCine combo;

    public void createCombo(){
        combo = new ComboCine();
    }

    public ComboCine getCombo() {
        return combo;
    }

    public abstract void buildTamanioPipocas();
    public abstract void buildNumPipocas();
    public abstract void buildTamanioRefrescos();
    public abstract void buildNumRefrescos();
    public abstract void buildChocolates();
}
