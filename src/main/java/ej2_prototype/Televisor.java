package ej2_prototype;

public class Televisor implements ITelevisor{
    private String so;
    private String so_version;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private int serial;

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getSo_version() {
        return so_version;
    }

    public void setSo_version(String so_version) {
        this.so_version = so_version;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public Televisor clone() {
        Televisor teleClone = new Televisor();
        teleClone.setBluetooth(this.isBluetooth());
        teleClone.setControlRemoto(this.isControlRemoto());
        teleClone.setSerial(this.getSerial());
        teleClone.setSo(this.getSo());
        teleClone.setSo_version(this.getSo_version());
        teleClone.setPulgadas(this.getPulgadas());
        teleClone.setPuertoHDMI(this.isPuertoHDMI());
        teleClone.setPuertosUSB(this.getPuertosUSB());
        return teleClone;
    }

    public void showInfo() {
        System.out.println("Televisor: ");
        System.out.println("so=" + so);
        System.out.println("so_version=" + so_version);
        System.out.println("pulgadas=" + pulgadas);
        System.out.println("resolucion=" + resolucion);
        System.out.println("puertoHDMI=" + puertoHDMI);
        System.out.println("puertosUSB=" + puertosUSB);
        System.out.println("controlRemoto=" + controlRemoto);
        System.out.println("bluetooth=" + bluetooth);
        System.out.println("serial=" + serial);
    }
}
