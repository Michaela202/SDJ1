package Admin;

public class SiteAdmin
{

  private String name;
  private SiteCollection siteCollection;

  public SiteAdmin(String name)
  {
    this.name = name;
    siteCollection = null;
  }

  public String getName()
  {
    return name;
  }

  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }

  public Website getNextSiteToUpdate()
  {
   return siteCollection.getAllNotUpdatedSites()[0];
  }

  public Website[] getAllSitesToUpdate()
  {
    return siteCollection.getAllNotUpdatedSites();
  }
}
