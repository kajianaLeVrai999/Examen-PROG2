import java.time.LocalDate;

public class Tuteur {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private int numero;
    private String Description;

    public Tuteur(int id, String description, int numero, String email, LocalDate dateNaissance, String prenom, String nom) {
        this.id = id;
        Description = description;
        this.numero = numero;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
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

    public String getDescription() {
        return Description;
    }
}
