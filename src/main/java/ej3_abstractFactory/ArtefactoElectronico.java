package ej3_abstractFactory;

public abstract class ArtefactoElectronico {
    protected int precio=0;
    protected String tipo;

    public ArtefactoElectronico(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void showInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Precio: "+precio);
        System.out.println("************************");
    }
}
