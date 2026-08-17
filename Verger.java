package com.cultures.model;

public class Verger extends Culture implements Irrigable
{
    private int nombresArbres;

    public Verger(String nom, double surface, double rendementParArbre, int nombresArbres)
    {
        super(nom, surface, rendementParArbre);
        this.nombresArbres = nombresArbres;
    }

    @Override
    public double calculerProduction()
    {
        return nombresArbres * rendementHectare;
    }

    @Override
    public double besoinEau()
    {
        return surface * 7000;
    }

    public int getNombresArbres() { return nombresArbres; }
}
