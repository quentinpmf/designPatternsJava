import java.sql.SQLOutput;
import java.util.*;
class Capteur extends Observable
{
    private int temp = 50;
    private double minThreshold = 0.25, maxThreshold = 0.75;
    void take()
    {
        double d;
        d = Math.random();
        if(d>maxThreshold)
        {
            temp++;
            setChanged();
        }
        else if (d<minThreshold)
        {
            temp--;
            setChanged();
        }
        System.out.println("[Temp : "+temp+" ]");
    }
    public int get()
    {
        return temp;
    }
}

public class DP_Observer_sensor implements Observer
{
    public void update(Observable o, Object arg)
    {
        System.out.println("!Alert! New Temp : "+ ((Capteur)o).get());
    }
    public static void main(String []ac)
    {
        Capteur Capteur = new Capteur();
        DP_Observer_sensor display = new DP_Observer_sensor();
        //register observer with observable class
        Capteur.addObserver(display);
        //Simulate measuring temp over time
        for(int i=0;i<20;i++)
        {
            Capteur.take();
            Capteur.notifyObservers();
            System.out.println();
        }
    }
}