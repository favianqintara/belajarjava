package PraktikumPbo1;

public class Kubus extends BangunRuang {
    private float volumek;  
    public void Bangunruang(float panjang){
        this.panjang=panjang;
      
        
        volumek=panjang*panjang*panjang;
        luasku = 6*(panjang*panjang);
        System.out.println("===== KUBUS =====");
        System.out.println("Volume kubus : "+volumek);
        System.out.println("Luas Kubus   : "+luasku);
    }  
}