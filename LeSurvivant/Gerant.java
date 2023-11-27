package LeSurvivant;

import java.util.Random;

public class Gerant {
    public Gerant() {
        circ = new Circulaire();
        graine = new Random().nextInt(12);

    }

    private int graine;
    private Circulaire circ;
    private String[] participant = {"Schumy", "Emanuel", "Dario", "Manoa", "Adrien", "Cédric", "Tomasz", "Fabian",
            "Selma", "Maxim", "Angelo", "Bertand"};
    public static void main(String[] args)
    {
        Gerant circ = new Gerant();
        circ.generation();
        circ.start();

    }
    public void generation ()
    {
        int x=1;
        for (String personne : participant)
        {
            Element e = new Element(x, personne);
            x++;

            circ.ajouter(e);
        }
        circ.getSuivant();
    }

    public void start ()
    {
        System.out.println("\nLes 12 participants se placent autour de la table\n");
        for(int liste=12;liste>1;liste--)
        {
            circ.nom();
            System.out.printf("s'est assis sur la chaise numéro ");
            circ.valeur();
            circ.getSuivant();
        }
        System.out.println("\nLa poule est tuée et "+graine+" graines y sont trouvées\n");
        for(int liste=12;liste>1;liste--)
        {
            for(int i=0; i<graine; i++)
            {
                circ.getSuivant();
            }
            System.out.println(circ.getCourant()+" a été tué(e)! Il ne reste plus que "+(liste-1)+" personne(s).");
            circ.supprimeCourant();
        }
        System.out.printf("\n"+circ.getCourant()+" est la derniere personne en vie, il partira donc à PetitBonum!\nIl peut biensur prendre avec lui sa chaise numéro ");
        circ.valeur();
    }
}
