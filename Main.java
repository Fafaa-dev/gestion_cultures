import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Main
{
    public static void main(String[] args)
    {
        Cultures parc = new Cultures();

        parc.ajouter(new Cereale("Avoine", 10, 3));
        parc.ajouter(new Legume("Tomate", 5, 2, true));
        parc.ajouter(new Verger("Oranger", 2, 1.5, 100));
        parc.ajouter(new Legume("Carotte", 3, 1.8, false));
        parc.ajouter(new Cereale("Blé", 8, 4));

        System.out.println("Production totale: " + parc.productionTotale());
        System.out.println("Besoin en eau total: " + parc.besoinEauTotal());

    
        try {

            Connection connexion = Connexion.getConnection();

            String sql = "SELECT * FROM cultures";

            PreparedStatement statement =
                    connexion.prepareStatement(sql);

            ResultSet resultat =
                    statement.executeQuery();

            while (resultat.next()) {

                String nom = resultat.getString("nom");
                String type = resultat.getString("type");

                double surface =
                        resultat.getDouble("surface");

                double rendement =
                        resultat.getDouble("rendement");

                if (type.equals("Cereale")) {

                    parc.ajouter(
                        new Cereale(
                            nom,
                            surface,
                            rendement
                        )
                    );
                }

                else if (type.equals("Legume")) {

                    boolean recolteManuelle =
                            resultat.getBoolean("recolte_manuelle");

                    parc.ajouter(
                        new Legume(
                            nom,
                            surface,
                            rendement,
                            recolteManuelle
                        )
                    );
                }

    
                else if (type.equals("Verger")) {

                    int nombreArbres =
                            resultat.getInt("nombre_arbres");

                    parc.ajouter(
                        new Verger(
                            nom,
                            surface,
                            rendement,
                            nombreArbres
                        )
                    );
                }
            }

            System.out.println(
                "Production totale : "
                + parc.productionTotale()
            );

            System.out.println(
                "Besoin en eau total : "
                + parc.besoinEauTotal()
            );

           
            resultat.close();
            statement.close();
            connexion.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}