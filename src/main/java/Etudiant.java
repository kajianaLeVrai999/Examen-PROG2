import java.time.LocalDate;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private int numero;
    private String groupe;
    private String tuteur;

    public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance, String email, int numero, String tuteur, String groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.numero = numero;
        this.tuteur = tuteur;
        this.groupe = groupe;
    }

    public String getGroupe() {
        return groupe;
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

    public String getTuteur() {
        return tuteur;
    }


}
