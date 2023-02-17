/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielamontes_examen1p2;

/**
 *
 * @author Gabriela Montes
 */
public class Laptop extends PC{
        private String Marca;
        private String defpantalla;
        private boolean RGB;

    public Laptop() {
    }

    public Laptop(String Marca, String defpantalla, boolean RGB, String IP, String masacara, String hostname) {
        super(IP, masacara, hostname);
        this.Marca = Marca;
        this.defpantalla = defpantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDefpantalla() {
        return defpantalla;
    }

    public void setDefpantalla(String defpantalla) {
        this.defpantalla = defpantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString()+" "+Marca + " " + defpantalla + " " + RGB;
    }
        
}
