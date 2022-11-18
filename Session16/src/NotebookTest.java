
public class NotebookTest
{
  public static void main(String[] args )
  {
    Notebook notebook=new Notebook(10);
    Note note1 = new Note("Hi");
    note1.setToHighPriority();
    Note note2 = new Note("Bye");
    Note note3 =new Note("Ola");
    notebook.addNote(note1);
    notebook.addNote(note2);
    notebook.addNote(note3);
    notebook.addHighPriorityNote("Ahoj");
//    System.out.println(notebook.getNumberOfNotes());
System.out.println(notebook.getMessage(0));
    System.out.println(notebook.getNote(1));
    System.out.println(notebook.getNote(2));
    System.out.println(notebook.getNote(3));
    System.out.println(notebook.getNote(4));
    System.out.println(notebook.getNote(9));
    System.out.println(notebook.getAllNotes());
    System.out.println(notebook.getAllHighPriorityNotes());



  System.out.println(notebook.toString());
  System.out.println(notebook.getNote(5));



  }
}
