
public class Utilizator {

    private String nume;
    private String email;


    public Utilizator(String nume, String email)
    {
        this.nume=nume;
        this.email=email;

    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }
}