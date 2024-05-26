package tuprak4;

/**
 *
 * @author DELL
 */
public class Kubus extends BangunRuang{
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public double hitungLuasPermukaan(String warna) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        System.out.println("Luas Permukaan Kubus (" + warna + "): " + luasPermukaan);
        return luasPermukaan;
    }
}
 
