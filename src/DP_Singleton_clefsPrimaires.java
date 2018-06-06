class Sequence
{
    private static Sequence instance;
    private static int counter;

    private Sequence()
    {
        counter=0;
    }

    public static synchronized Sequence getInstance()
    {
        if(instance == null)
        {
            instance = new Sequence();
        }
        return instance;
    }

    public synchronized int getNext()
    {
        return ++counter;
    }


}

class DP_Singleton_clefsPrimaires{
    public static void main(String[] args){
        Sequence seq = Sequence.getInstance();
        int i,clef;
        for(i=0;i<5;i++)
        {
            clef=seq.getNext();
            System.out.println("clef = "+clef+" ");
        }
    }
}