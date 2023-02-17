/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielamontes_examen1p2;

/**
 *
 * @author Gabriela Montes
 */
public class Escritorio extends PC {
    private int Ram;
    private int almacenamiento;
    private String tipoA;
    private String tarjeta;

    public Escritorio() {
    }

    public Escritorio(int Ram, int almacenamiento, String tipoA, String tarjeta, String IP, String masacara, String hostname) {
        super(IP, masacara, hostname);
        this.Ram = Ram;
        this.almacenamiento = almacenamiento;
        this.tipoA = tipoA;
        this.tarjeta = tarjeta;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoA() {
        return tipoA;
    }

    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.Ram+" "+this.almacenamiento+" "+this.tipoA+" "+this.tarjeta;
    }
    
}
