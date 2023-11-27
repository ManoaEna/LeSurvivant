package LeSurvivant;

public class Circulaire
{
    private Element courant;
    private int compteur=0;


    public Circulaire()
    {
        courant = null;
    }


    public void supprimeCourant()
    {
        if (compteur > 0)
        {
            Element avd = getPrecedant();
            avd.setSuivant(courant.getSuivant());
            courant = avd;
            compteur--;
        }
    }


    private Element getPrecedant()
    {
        Element retour = null;
        if(compteur > 0)
        {
            if(compteur >1)
            {
                Element avtDernier = courant;
                for(int i=0;i<compteur-1;i++)
                {
                    avtDernier = avtDernier.getSuivant();
                }
                retour = avtDernier;
            }
        }
        return retour;
    }


    public Element getCourant()
    {
        return courant;
    }


    public Element getSuivant()
    {
        courant = courant.getSuivant();
        return courant;
    }

    public void ajouter(Element e)
    {
        if(compteur == 0)
        {
            courant = e;
            e.setSuivant(e);
        }
        else
        {
            e.setSuivant(courant.getSuivant());
            courant.setSuivant(e);
            courant = e;
        }
        compteur++;
    }
    

    public void nom()
    {
            System.out.printf(courant.getNom()+" ");

    }
    public void valeur()
    {
        System.out.println(courant.getValeur());
    }

}
