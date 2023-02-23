package ej4_builder;

public class ComboCine {
    private String tamanioPipocas;
    private int numPipocas;
    private String tamanioRefrescos;
    private int numRefrescos;
    private int chocolates;

    public String getTamanioPipocas() {
        return tamanioPipocas;
    }

    public void setTamanioPipocas(String tamanioPipocas) {
        this.tamanioPipocas = tamanioPipocas;
    }

    public int getNumPipocas() {
        return numPipocas;
    }

    public void setNumPipocas(int numPipocas) {
        this.numPipocas = numPipocas;
    }

    public String getTamanioRefrescos() {
        return tamanioRefrescos;
    }

    public void setTamanioRefrescos(String tamanioRefrescos) {
        this.tamanioRefrescos = tamanioRefrescos;
    }

    public int getNumRefrescos() {
        return numRefrescos;
    }

    public void setNumRefrescos(int numRefrescos) {
        this.numRefrescos = numRefrescos;
    }

    public int getChocolates() {
        return chocolates;
    }

    public void setChocolates(int chocolates) {
        this.chocolates = chocolates;
    }

    public void showInfo(){
        System.out.println("Pipocas: "+numPipocas+", tamanio: "+tamanioPipocas);
        System.out.println("Refrescos: "+numRefrescos+", tamanio: "+tamanioRefrescos);
        System.out.println("Chocolates: "+chocolates);
        System.out.println("*************************************************");
    }
}
