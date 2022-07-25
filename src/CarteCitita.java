
public class CarteCitita extends Carte{
	
	private String descriere;
	private int nota;
	
	public CarteCitita()
	{
		super();
		
		descriere=null;
		nota=0;
	}
	
	public CarteCitita(String titlu,String autor,int nr,String desc,int n)
	{
		super(titlu,autor,nr);
		descriere=desc;
		nota=n;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	

}
