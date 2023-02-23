package ej2_prototype;

public class Client {
    public static void main(String[] args) {
        Televisor t1 = new Televisor();
        t1.setSo("android");
        t1.setSo_version("11.0");
        t1.setPulgadas(80);
        t1.setResolucion(50);
        t1.setPuertoHDMI(true);
        t1.setPuertosUSB(4);
        t1.setControlRemoto(true);
        t1.setBluetooth(true);
        t1.setSerial(10);

        Televisor t2 = t1.clone();
        t2.setSerial(8);
        Televisor t3 = t1.clone();
        t3.setSerial(12);
        Televisor t4 = t1.clone();
        t4.setSerial(11);
        Televisor t5 = t1.clone();
        t5.setSerial(15);

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();
    }
}
