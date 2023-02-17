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
    private boolean tarjeta;

    public Escritorio() {
    }

    public Escritorio(int Ram, int almacenamiento, String tipoA,boolean tarjeta, String IP, String masacara, String hostname) {
        super(IP, masacara, hostname);
        this.Ram = Ram;
        this.almacenamiento = almacenamiento;
        this.setTipoA(tipoA);
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
        if (tipoA.equals("HDD")||tipoA.equals("SSD")) {
            this.tipoA = tipoA;
        }
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    

    @Override
    public String toString() {
        return super.toString()+" "+this.Ram+" "+this.almacenamiento+" "+this.tipoA+" "+this.tarjeta+"\n";
    }
    
}
