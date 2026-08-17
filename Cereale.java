package com.cultures.model;

public class Cereale extends Culture
{
    public Cereale(String nom, double surface, double rendementHectare)
    {
        super(nom, surface, rendementHectare);
    }

    @Override
    public double calculerProduction()
    {
        return surface * rendementHectare;
    }
}
