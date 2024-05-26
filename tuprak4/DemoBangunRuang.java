package tuprak4;

public class DemoBangunRuang {

    public static void main(String[] args) {
        // TODO code application logic here
        Balok balok = new Balok(4, 5, 6);
        Kubus kubus = new Kubus(4);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

    }
   }

    
