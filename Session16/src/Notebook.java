public class Notebook
{
  private int NumberOfNotes;
  private Note[] notes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes()
  {
    return NumberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes[index]; //returning note object
  }

  public String getMessage(int index)
  {
    return notes[index].getMessage();
  }

  public void addNote(Note note)
  {
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = note;
        break;
      }
    }
    NumberOfNotes++;
  } //can be done without the for loop

  public void addNote(String message)
  {
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i].setMessage(message);
        break;
      }
    }
    NumberOfNotes++;
  } //can be done without the for loop

  public void addHighPriorityNote(String message)
  {
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        Note note = new Note(message);
        note.setToHighPriority();
        notes[i] = note;
        break;
      }
    }
    NumberOfNotes++; //this was the entire problem
  }

  public void removeNote(int index)
  { //mine not entirely correct version

   /* notes[index].setMessage(null);
    NumberOfNotes--;*/

    for (int i = 0; i < getNumberOfNotes(); i++)
    {
      notes[i] = notes[i + 1];//this moves it

    } if (NumberOfNotes > 0)
  {
      notes[NumberOfNotes-1] = null;
  }
    NumberOfNotes--;
    //this should be rewritten to make it smarter (read again to actually understand)
  }

  public Note[] getAllNotes()
  {
    Note[] allNotes = new Note[NumberOfNotes];
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null)
      {
        allNotes[i] = notes[i].copy();
      }
    }

    return allNotes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    //dlha verzia//
    int counter = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null && notes[i].isHighPriority())
      {
        counter++;
      }
    }
    return counter;

  }

  public Note[] getAllHighPriorityNotes()
  {
    Note[] allNotes = new Note[getNumberOfHighPriorityNotes()];
    int index = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null && notes[i].isHighPriority())
      {
        allNotes[index++] = notes[i].copy();
      }
    }

    return allNotes;
  }

  public String toString()
  {
    String meno = "";
    for (int i = 0; i < notes.length; i++)
    {

      if (notes[i] != null)
      {
        meno += notes[i].toString();

      }
    }
    return meno;
  }
}