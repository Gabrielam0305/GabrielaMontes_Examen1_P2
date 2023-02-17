/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielamontes_examen1p2;

/**
 *
 * @author Gabriela Montes
 */
public class PC {
    protected String IP;
    protected String masacara;
    protected String hostname;

    public PC(String IP, String masacara, String hostname) {
        this.IP = IP;
        this.masacara = masacara;
        this.hostname = hostname;
    }

    public PC() {
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMasacara() {
        return masacara;
    }

    public void setMasacara(String masacara) {
        this.masacara = masacara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return this.hostname+" "+this.IP+" "+this.masacara;
    }
    public void ping (String IP, PC pc){
      String[]sep=IP.split(".");
            
            
        }
         while (acum>0) {            
            acum=acum/2;
            int a=acum%2;
            binarionew.add(0, a);
        }
    }
    
}
