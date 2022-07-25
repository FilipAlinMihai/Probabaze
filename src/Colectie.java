
import java.util.ArrayList;

public class Colectie {

    private String numeColectie;
    private ArrayList<Carte> carti ;


    public Colectie(String nume){

        this.numeColectie=nume;
        carti=new ArrayList<Carte>();

    }

    public void adaugaCarte()
    {

    }

    public String getNumeColectie() {
        return numeColectie;
    }

    public ArrayList<Carte> getCarti() {
        return carti;
    }
}