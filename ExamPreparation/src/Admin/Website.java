package Admin;

public class Website
{
  private String url;
  private boolean needsUpdate;

  public Website(String url)
  {
    this.url = url;
    this.needsUpdate = false;
  }

  public String getUrl()
  {
    return url;
  }

  public boolean NeedsUpdate()
  {
    if (needsUpdate = true)
    {
      return false;
    }
    else
      return true;
  }

  public void markAsNotUpdated()
  {
    if (needsUpdate != true)
    {
      needsUpdate=true;
    }
  }

  public void markAsUpdated()
  {
    if (needsUpdate != false)
    {
      needsUpdate = false;
    }
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Website other = (Website) obj;
    return url == other.url && needsUpdate == other.needsUpdate;
  }

  public String toString()
  {
    return "WEB:" + url + "UPDATE NEEDED?:" + needsUpdate;
  }
}
