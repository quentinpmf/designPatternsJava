//TD3 : Le pattern Composite
import java.util.*;

//COMPONENT
abstract class ComposantChimique
{
    public abstract double getMasse();
    public abstract double charge();
    public abstract String symbole();
}

//LEAF - FEUILLE
class Atome extends ComposantChimique
{
    public double getMasse()
    {
        return 0.0;
    }
    public double charge()
    {
        return 0.0;
    }
    public String symbole()
    {
        return "QB";
    }

}

//COMPOSITE
class Molecule extends ComposantChimique
{
    protected List<ComposantChimique> molecules = new ArrayList<ComposantChimique>();
    public double getMasse()
    {
        double masse = 0.0;
        for(ComposantChimique c: molecules)
        {
            masse += c.getMasse();
        }
        return masse;
    }
    public double charge()
    {
        return 0.0;
    }
    public String symbole()
    {
        return "QB";
    }
}