public class Matiere {
    private int id;
    private String label;
    private String credit;
    private Enseignant enseignant;

    public Matiere(int id, String label, String credit, Enseignant enseignant) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public String getCredit() {
        return credit;
    }

    public String getLabel() {
        return label;
    }
}
