package com.tutorial.vue.books_app.model;
public class Book {
    private Long id;
    private String kodeBuku;
    private String judul;
    private String genre;
    private String penulis;
    private double harga;

    // Constructor
    public Book(Long id, String kodeBuku, String judul, String genre, String penulis, double harga) {
        this.id = id;
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.genre = genre;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

