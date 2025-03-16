package com.example.pizzahub.classes;

public class Produit {
    private static int comp;
    private int id;
    private int nb_ingredients;
    private String nom;
    private int photo;
    private String description;
    private String detailsIngred;
    private String duree;
    private String preparation;

    public Produit(String nom,int nb_ingredients,int photo,String duree,String detailsIngred,String description,String preparation){
        this.id = ++comp;
        this.nb_ingredients=nb_ingredients;
        this.nom=nom;
        this.photo=photo;
        this.description=description;
        this.detailsIngred=detailsIngred;
        this.duree=duree;
        this.preparation=preparation;

    }
    public Produit(){
    }

    public int getId(){
        return id;
    }
    public int getNb_ingredients(){
        return nb_ingredients;
    }
    public String getNom(){
        return nom;
    }
    public int getPhoto(){
        return photo;
    }
    public String getDescription(){
        return description;
    }
    public String getDetailsIngred(){
        return detailsIngred;
    }
    public String getDuree(){
        return duree;
    }
    public String getPreparation(){
        return preparation;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNb_ingredients(int nb_ingredients) {
        this.nb_ingredients = nb_ingredients;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
    public String ToString(){
        return " Produit :" +"Id= "+id+" ,Nom= "+nom+ " ,Nbre Ingredient= "+ nb_ingredients+" ,Photo= "+photo
                +" ,Duree= "+duree+ " ,DetailsIngred= "+detailsIngred+" ,Description= "+description+
                " ,Preparation= "+ preparation;
    }
}
