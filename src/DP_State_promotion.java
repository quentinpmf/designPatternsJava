//TD3 : Le pattern Composite

import java.util.ArrayList;
import java.util.List;

class Personne
{
    Etat etatCourant;
    public Personne(Etat e)
    {
        this.etatCourant=e;
    }
    public boolean promouvable()
    {
        return (etatCourant.promouvable(this));
    }
    public void promouvoir()
    {
        etatCourant = etatCourant.etatSuivant(this);
    }
}

abstract class Etat
{
    abstract boolean promouvable(Personne p);
    abstract Etat etatSuivant(Personne p);
}

class Employe extends Etat
{
    boolean promouvable(Personne p)
    {
        return true;
    }
    public Etat etatSuivant(Personne p)
    {
        return new Cadre();
    }
}

class Cadre extends Etat
{
    boolean promouvable(Personne p)
    {
        return true;
    }
    public Etat etatSuivant(Personne p)
    {
        return null;
    }
}

public class DP_State_promotion
{
    public static void main(String[] args)
    {
        Personne marcel = new Personne(new Employe());
        marcel.promouvable();
        System.out.println(marcel.promouvable());
        marcel.promouvoir();
        System.out.println(marcel.promouvable());
    }
}
