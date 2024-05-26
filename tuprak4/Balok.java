package tuprak4;

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    double tinggi;

    protected Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    protected Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = 1;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}