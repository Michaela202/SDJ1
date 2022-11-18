package JavaProject;

public class JavaFile
    //aggregation ...should use copies
{
  private boolean hasMainMethod;
  private FileName fileName;

  public JavaFile()
  {
    this.fileName = fileName.copy();
    hasMainMethod = false;
  }

  public FileName getFileName()
  {
    return fileName;
  }

  public boolean HasMainMethod()
  {
     return hasMainMethod = true;
  }

  public void addMainMethod()
  {

       hasMainMethod=true;

  }
}
