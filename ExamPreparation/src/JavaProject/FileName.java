package JavaProject;

public class FileName
{

  private String name;
  private String extention;

  public FileName(String name, String extention)
  {
    this.extention = extention;
    this.name = name;
  }

  public void set(String name, String extention)
  {
    this.name = name;
    this.extention = extention;
  }

  public String getName()
  {
    return name;
  }

  public String getExtention()
  {
    return extention;
  }

  public String getFullName()
  {
    return "NAME OF FILE:" + name + "/" + extention;
  }

  public FileName copy()
  {

    return  new FileName(name,extention);
  }
}
