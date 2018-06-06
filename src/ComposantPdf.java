//TD3 : Le pattern Composite

//ComposantPdf.java
public class ComposantPdf
{
    protected String contenu;
    public void pdfFixeContenu(String contenu)
    {
        this.contenu = contenu;
    }

    public void pdfPrepareAffichage()
    {
        System.out.println("Affichage PDF : Début");
    }

    public void pdfRafraichit()
    {
        System.out.println("Affichage contenu PDF : "+contenu);
    }

    public void pdfTermineAffichage()
    {
        System.out.println("Affichage PDF : Fin");
    }

    public void pdfEnvoieImprimante()
    {
        System.out.println("Impression PDF : "+contenu);
    }
}

//Document.java
interface Document
{
    void setContenu(String contenu);
    void dessine();
    void imprime();
}

//DocumentPdf.java
class DocumentPdf implements Document
{
    protected ComposantPdf outilPdf = new ComposantPdf();
    public void setContenu(String contenu)
    {
        outilPdf.pdfFixeContenu(contenu);
    }

    public void dessine()
    {
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichit();
        outilPdf.pdfTermineAffichage();
    }

    public void imprime()
    {
        outilPdf.pdfEnvoieImprimante();
    }
}

//DocumentHTML.java
class DocumentHtml implements Document
{
    protected String contenu;
    public void setContenu(String contenu)
    {
        this.contenu = contenu;
    }

    public void dessine()
    {
        System.out.println("Dessine document HTML : "+contenu);
    }

    public void imprime()
    {
        System.out.println("Imprime document HTML : "+contenu);
    }
}

class ServeurWeb
{
    public static void main(String[] args)
    {
        Document document1, document2;
        document1 = new DocumentHtml();
        document1.setContenu("Hello");
        document1.dessine();

        document2 = new DocumentPdf();
        document2.setContenu("Bonjour");
        document2.dessine();
    }
}