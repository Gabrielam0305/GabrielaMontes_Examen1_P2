/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielamontes_examen1p2;

import java.util.ArrayList;

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
        ArrayList<Integer>binario=new ArrayList(); 
        ArrayList<Integer>binarionew=new ArrayList(); 
        ArrayList<Integer>binariomasc=new ArrayList();
      String[]sep=IP.split(".");
       String[]sep3=pc.getMasacara().split(".");
      String []sep2=pc.getIP().split(".");
      boolean e=false;
        if (sep[0]==sep2[0]) {
            if ((sep[1]==sep2[1]) ) {
                if ((sep[2]==sep2[2]) ) {
                        e=true;
                }else{
             System.out.println("Pinging to "+IP+" with 32 bits of data: ");
                 for (int i = 0; i < 4; i++) {
                     System.out.println("Reply from "+IP+": Destination host unreachable");
                 }
                 System.out.println("Ping statistics for "+IP+": ");
                 System.out.println("Packets: Sent=4, received= 0, Lost=4(100% loss)");
                 System.out.println(pc.getHostname()+"#");
        }
            }else{
             System.out.println("Pinging to "+IP+" with 32 bits of data: ");
                 for (int i = 0; i < 4; i++) {
                     System.out.println("Reply from "+IP+": Destination host unreachable");
                 }
                 System.out.println("Ping statistics for "+IP+": ");
                 System.out.println("Packets: Sent=4, received= 0, Lost=4(100% loss)");
                 System.out.println(pc.getHostname()+"#");
        }
        }else{
             System.out.println("Pinging to "+IP+" with 32 bits of data: ");
                 for (int i = 0; i < 4; i++) {
                     System.out.println("Reply from "+IP+": Destination host unreachable");
                 }
                 System.out.println("Ping statistics for "+IP+": ");
                 System.out.println("Packets: Sent=4, received= 0, Lost=4(100% loss)");
                 System.out.println(pc.getHostname()+"#");
        }
        if (e==true) {
            int dec1=Integer.parseInt(sep[3]);
            int dec2=Integer.parseInt(sep2[3]);
            int dec3=Integer.parseInt(sep3[3]);
            while (dec1>0) {            
            dec1=dec1/2;
            int a=dec1%2;
            binarionew.add(0, a);
             binarionew.remove(0);
        }
            while (dec2>0) {            
            dec2=dec2/2;
            int d=dec2%2;
            binario.add(0, d);
             binario.remove(0);
        }
             while (dec3>0) {            
            dec3=dec3/2;
            int c=dec3%2;
            binariomasc.add(0, c);
             binariomasc.remove(0);
        }
             int acum=0;
             for (int b :binariomasc) {
                 if (b==1) {
                     acum+=b;
                 }
            }
            String acum1="";
            String acum2="";
             for (int i = 0; i < acum; i++) {
                acum1+=binarionew.get(i);
                 acum2+=binario.get(i);
            }
             if (acum1.equals(acum2)) {
                 System.out.println("Pinging to "+IP+" with 32 bits of data: ");
                 for (int i = 0; i < 4; i++) {
                     System.out.println("Reply from "+IP+": bytes=32 time=37ms TTL=46");
                 }
                 System.out.println("Ping statistics for "+IP+": ");
                 System.out.println("Packets: Sent=4, received= 4, Lost=0(0% loss)");
                 System.out.println(pc.getHostname()+"#");
            }
             
        }
        
        
    //}
    }
}
