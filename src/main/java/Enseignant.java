import java.time.LocalDate;

public class Enseignant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private int numero;
    private String Specialite;

    public Enseignant(int id, LocalDate dateNaissance, String prenom, String nom, int numero, String email, String specialite) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
        this.nom = nom;
        this.numero = numero;
        this.email = email;
        this.Specialite = specialite;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero() {
        return numero;
    }

    public String getSpecialite() {
        return Specialite;
    }
}
