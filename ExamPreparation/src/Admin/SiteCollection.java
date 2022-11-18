package Admin;

import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> website;

  public SiteCollection(int maxSites)
  {
    this.size = maxSites;
    website = null;
  }

  public int getNumberOfSites()
  {
    return website.size();
  }

  public int getNumberOfUpdatedSites()
  {
    int counter = 0;
    for (int i = 0; i < website.size(); i++)
    {
      website.get(i).markAsUpdated();
      counter++;

    }
    return counter;
  }

  public void addSite(Website site)
  {
    website.add(site);
  }

  public void removeSite(String url)
  {
    website.remove(url);
  }

  public Website[] getAllSites()
  {
    Website[] websites = new Website[website.size()];
    for (int i = 0; i < website.size(); i++)
    {
      websites[i] = website.get(i);
    }
    return websites;
  }

  public Website[] getAllNotUpdatedSites()
  {
    Website[] websites = new Website[website.size()];
    int counter = 0;
    for (int i = 0; i < website.size(); i++)
    {
      if (website.get(i).NeedsUpdate())
      {
        websites[counter] = website.get(i);
        counter++;
      }

    }
    return websites;
  }

  public String toString()
  {
    String temp = "";
    for (int i = 0; i < website.size(); i++)
    {
      temp+=website.get(i).toString()+"\n";
    }
    return temp;
  }
}
