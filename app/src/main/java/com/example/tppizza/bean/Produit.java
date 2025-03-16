package com.example.tppizza.bean;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredient;
    private int photo;
    private String duree;
    private String detailIngred;
    private String description;
    private String preparation;
    private int comp;

    public Produit(String nom, int nbrIngredient, int photo, String duree, String detailIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredient = nbrIngredient;
        this.photo = photo;
        this.duree = duree;
        this.detailIngred = detailIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredient() {
        return nbrIngredient;
    }

    public void setNbrIngredient(int nbrIngredient) {
        this.nbrIngredient = nbrIngredient;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetailIngred() {
        return detailIngred;
    }

    public void setDetailIngred(String detailIngred) {
        this.detailIngred = detailIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredient=" + nbrIngredient +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailIngred='" + detailIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
