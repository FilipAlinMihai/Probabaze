
public class Carte {

    private String titlu;
    private String autor;
    private int nrPagini;

    public Carte()
    {
        titlu=null;
        autor=null;
        nrPagini=0;
    }

    public Carte(String titlu,String autor,int nr)
    {
        this.titlu=titlu;
        this.autor=autor;
        this.nrPagini=nr;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public String toString()
    {
        return this.titlu+" scrisa de "+this.autor+" are un numar de "+this.nrPagini+" pagini!";
    }
}