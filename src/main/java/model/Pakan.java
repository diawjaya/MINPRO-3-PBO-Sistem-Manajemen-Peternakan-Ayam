package model;

public class Pakan extends JenisAyam {

    private final int idPakan;
    private String namaPakan;
    private int stok;

    public Pakan(int idPakan, String namaPakan, int stok) {

        super(idPakan, namaPakan, 0);

        this.idPakan = idPakan;
        this.namaPakan = namaPakan;
        this.stok = stok;
    }

    public Pakan(int idPakan, String namaPakan) {

        super(idPakan, namaPakan);

        this.idPakan = idPakan;
        this.namaPakan = namaPakan;
        this.stok = 0;
    }

    public int getIdPakan() {
        return idPakan;
    }

    public String getNamaPakan() {
        return namaPakan;
    }

    public int getStok() {
        return stok;
    }

    public void setNamaPakan(String namaPakan) {
        this.namaPakan = namaPakan;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public void tampilInfo() {
        System.out.println(
                "Pakan: " + namaPakan
                + ", Stok: " + stok
        );
    }
}