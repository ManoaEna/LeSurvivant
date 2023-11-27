package LeSurvivant;

public class Element
{

    private int valeur;
    private String nom;


    private Element suivant = null;


    public Element(int valeur, String nom)
    {
        this.valeur = valeur;
        this.nom=nom;
    }

    public Element(int valeur, Element next, String nom)
    {
        this.valeur=valeur;
        suivant=next;
        this.nom=nom;

    }

    public int getValeur()
    {
        return valeur;
    }

    public String getNom()
    {
        return nom;
    }

    public Element getSuivant()
    {
        return suivant;
    }

    public void setSuivant(Element suivant)
    {
        this.suivant = suivant;
    }

    @Override
    public String toString()
    {
        return this.nom;
    }
}