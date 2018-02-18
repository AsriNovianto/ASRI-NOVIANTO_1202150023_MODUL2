package com.example.asrinovianto_1202150023_modul2;

/**
 * Created by RazerBlade on 18/02/2018.
 */

public class model {
    private String nama;
    private int harga;
    private int gambar;
    private String deskripsi;

    public model(String nama, int harga,int gambar, String deskripsi){
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public int getGambar(){
        return gambar;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setGambar(int gambar){
        this.gambar = gambar;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi= deskripsi;
    }

}
