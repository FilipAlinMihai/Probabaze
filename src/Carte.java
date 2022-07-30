
public class Carte {

    private String titlu;
    private String autor;
    private int nrPagini;
    private int pgCitite;

    public Carte()
    {
        titlu=null;
        autor=null;
        nrPagini=0;
        pgCitite=0;
    }

    public Carte(String titlu,String autor,int nr)
    {
        this.titlu=titlu;
        this.autor=autor;
        this.nrPagini=nr;
    }
    
    public Carte(String titlu,String autor,int nr,int nr1)
    {
        this.titlu=titlu;
        this.autor=autor;
        this.nrPagini=nr;
        this.pgCitite=nr1;
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
    
    

    public int getPgCitite() {
		return pgCitite;
	}

	public void setPgCitite(int pgCitite) {
		this.pgCitite = pgCitite;
	}
	
	public void amCitit(int x)
	{
		this.pgCitite=this.pgCitite+x;
		
		
		if(this.pgCitite>this.nrPagini)
			this.pgCitite=this.nrPagini;
		
		if(this.pgCitite==this.nrPagini)
		{
			//Implementare cartea trece in lista de carti citite
		}
		
	}
	
	public String getProcent()
	{
		String proc="";
		
		
		double pr=((double)this.pgCitite/this.nrPagini)*100;
		proc=String.valueOf(pr)+"%";
		
		return proc;
	}

	public String toString()
    {
        return this.titlu+" scrisa de "+this.autor+" are un numar de "+this.nrPagini+" pagini!";
    }
}