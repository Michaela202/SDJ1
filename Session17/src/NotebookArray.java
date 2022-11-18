import java.util.ArrayList;

public class NotebookArray
{
  private int NumberOfNotes;
  private ArrayList<Note> notes;

  public NotebookArray()
  {
    NumberOfNotes = 5;
    notes = new ArrayList<Note>();
  }

  public NotebookArray(int maxNumberOfNotes)
  {
    NumberOfNotes = maxNumberOfNotes;
    notes = new ArrayList<Note>();
  }

  public int getNumberOfNotes()
  {
    return NumberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes.get(index);
  }

  public String getMessage(int index)
  {
    return notes.get(index).getMessage();
  }

  public void addNote(Note note)
  {
    if (notes.size() < NumberOfNotes)
      notes.add(note);

  }

  public void addNote(String message)
  {
    Note n = new Note(
        message); //I need to create a new object to store the value in

    if (notes.size() < NumberOfNotes)
      notes.add(n);

  }

  public void addHighPriorityNote(String message)
  {
    Note m = new Note(message);
    if (notes.size() < NumberOfNotes)
      notes.add(m);
    m.setToHighPriority();

  }

  public void removeNote(int index)
  {
    notes.remove(index);//  moved the spaces (the video)

  }
}
 /* public Note getAllNotes()
  {
    for (int i = 0; i < notes.size(); i++)
    {
      notes.get(i);

    }
  }
}
  return; what should this return?

 /* public int getNumberOfHighPriorityNotes()
  public Note[] getAllHighPriorityNotes()
  public String toString()*/


