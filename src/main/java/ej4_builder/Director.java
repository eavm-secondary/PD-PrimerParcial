package ej4_builder;

public class Director {
    private ComboBuilder builder;

    public void setBuilder(ComboBuilder builder){
        this.builder = builder;
    }

    public ComboCine buildCombo(){
        this.builder.createCombo();
        this.builder.buildChocolates();
        this.builder.buildNumPipocas();
        this.builder.buildNumRefrescos();
        this.builder.buildTamanioPipocas();
        this.builder.buildTamanioRefrescos();
        return builder.getCombo();
    }
}
