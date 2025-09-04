import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class HistoriqueNote {
     private List<Note> notes = new ArrayList<Note>();

     public void addNote(Note note) {
         notes.add(note);
     }
     
}
