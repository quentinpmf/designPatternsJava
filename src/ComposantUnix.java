//TD3 : Le pattern Composite

import java.util.ArrayList;
import java.util.List;

//COMPONENT
abstract class ComposantRepertoire
{
    public abstract String getNom();
    public abstract boolean ls();
    public abstract boolean mv();
    public abstract boolean chmod();
}

//LEAF - FEUILLE
class FichierSimple extends ComposantRepertoire
{
    @Override
    public String getNom() {
        return null;
    }
    @Override
    public boolean ls() {
        return false;
    }
    @Override
    public boolean mv() {
        return false;
    }
    @Override
    public boolean chmod() {
        return false;
    }

    public String contenu()
    {
        return "contenu";
    }
    public boolean rm()
    {
        return true;
    }
}


//héritage 1
class FichierTexte extends FichierSimple
{
}

//héritage 2
class FichierBin extends FichierSimple
{
}

//COMPOSITE
class Repertoire extends ComposantRepertoire
{
    protected List<ComposantRepertoire> repertoires = new ArrayList<ComposantRepertoire>();

    @Override
    public String getNom() {
        return null;
    }
    @Override
    public boolean ls() {
        return false;
    }
    @Override
    public boolean mv() {
        return false;
    }
    @Override
    public boolean chmod() {
        return false;
    }

    public boolean cd()
    {
        return true;
    }
    public boolean rmdir()
    {
        return true;
    }

}