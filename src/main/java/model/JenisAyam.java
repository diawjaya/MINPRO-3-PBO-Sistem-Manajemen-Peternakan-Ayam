package model;

public abstract class JenisAyam {

    private final int idJenisAyam;
    private String namaJenis;
    private int umurPanen;

    public JenisAyam(int idJenisAyam, String namaJenis, int umurPanen) {
        this.idJenisAyam = idJenisAyam;
        this.namaJenis = namaJenis;
        this.umurPanen = umurPanen;
    }

    public JenisAyam(int idJenisAyam, String namaJenis) {
        this.idJenisAyam = idJenisAyam;
        this.namaJenis = namaJenis;
        this.umurPanen = 0;
    }

    public int getIdJenisAyam() {
        return idJenisAyam;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public int getUmurPanen() {
        return umurPanen;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public void setUmurPanen(int umurPanen) {
        this.umurPanen = umurPanen;
    }

    public abstract void tampilInfo();

    public void tampilInfo(String keterangan) {
        System.out.println(keterangan);
    }
}