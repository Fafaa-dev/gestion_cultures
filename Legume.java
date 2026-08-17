package com.cultures.model;

public class Legume extends Culture implements Irrigable
{
    private boolean recolteManuelle;

    public Legume(String nom, double surface, double rendementHectare, boolean recolteManuelle)
    {
        super(nom, surface, rendementHectare);
        this.recolteManuelle = recolteManuelle;
    }

    @Override
    public double calculerProduction()
    {
        double production = surface * rendementHectare;
        if (recolteManuelle)
        {
            production *= 0.9;
        }
        return production;
    }

    @Override
    public double besoinEau()
    {
        return surface * 5000;
    }

    public boolean isRecolteManuelle() { return recolteManuelle; }
}
