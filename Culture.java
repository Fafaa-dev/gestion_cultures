package com.cultures.model;

public abstract class Culture
{
    protected Integer id; // null tant que non persistée en base
    protected String nom;
    protected double surface;
    protected double rendementHectare;

    public Culture(String nom, double surface, double rendementHectare)
    {
        this.nom = nom;
        this.surface = surface;
        this.rendementHectare = rendementHectare;
    }

    public abstract double calculerProduction();

    public void afficher()
    {
        System.out.println("Nom de la culture: " + nom);
        System.out.println("Surface: " + surface);
        System.out.println("Production totale: " + calculerProduction());
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNom() { return nom; }
    public double getSurface() { return surface; }
    public double getRendementHectare() { return rendementHectare; }
}
