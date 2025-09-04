import java.time.LocalDate;

public class Examen {
    private int id;
    private String titre;
    private LocalDate date;
    private int coeficient;

    public Examen(int id, int coeficient, LocalDate date, String titre) {
        this.id = id;
        this.coeficient = coeficient;
        this.date = date;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getCoeficient() {
        return coeficient;
    }
}
