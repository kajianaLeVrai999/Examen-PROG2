import java.time.Instant;

public class Note {
    private Examen examen;
    private Instant date;
    private double valeur;
    private Etudiant etudiant;

    public Note(double valeur, Instant date, Examen examen, Etudiant etudiant) {
        this.valeur = valeur;
        this.date = date;
        this.examen = examen;
        this.etudiant = etudiant;
    }

    public Examen getExamen() {
        return examen;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public double getValeur() {
        return valeur;
    }

    public Instant getDate() {
        return date;
    }

    public double getExamgrade(Examen examen, Etudiant etudiant, Instant t) {
        double result = examen.getCoeficient() * getValeur();
        return result;
    }
}