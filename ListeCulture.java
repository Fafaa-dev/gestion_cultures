import java.util.ArrayList;
import java.util.List;

class Cultures
{
    private List<Culture> cultures = new ArrayList<>();

    public void ajouter(Culture c)
    {
        cultures.add(c);
    }

    public double productionTotale()
    {
        double total = 0;

        for (Culture c : cultures)
        {
            total += c.calculerProduction();
        }

        return total;
    }

    public double besoinEauTotal()
    {
        double total = 0;

        for (Culture c : cultures)
        {
            if (c instanceof Irrigable)
            {
                total += ((Irrigable) c).besoinEau();
            }
        }

        return total;
    }
}
