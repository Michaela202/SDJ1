public class Clock
{

  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;

  }

  //this whole part should be done differently
  //public int totalTimeInSeconds = hour/(60*60) + minute/60 + second;
  public Clock(int totalTimeInSeconds)
  {
    this.hour = totalTimeInSeconds / (60 * 60);
    totalTimeInSeconds -= (hour * (60 * 60));
    this.minute = totalTimeInSeconds / 60;
    totalTimeInSeconds -= (minute * 60);
    this.second = totalTimeInSeconds;

  }

  public void set(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second = second + 1;
    if (second > 59)
    {
      second = 0;
      minute += 1;
      //minute %= 60;
      if (minute > 59)
      {
        minute = 0;
        hour += 1;
        // hour %=60;
        if (hour > 23)
        {
          hour %= 24;
        }
      }

    }

  }

  //should increase the time with 1 sec
  //}
  public int convertToSeconds()
  {
    int x = minute * 60 + hour * (60 * 60) + second;
    return x;

    //convert to seconds
  }

  public boolean isBefore(Clock clock)
  {
    if (hour <= clock.getHour())
    {
      if (hour < clock.getHour())
        return true;
      else if (minute < clock.getMinute())
        return true;
      else if (second < clock.getSecond())
        return true;
      else
        return false;
    }
    return false;

  }

  public int timeInSecondsTo(Clock time)
  {
    int x = convertToSeconds();
    int y = time.convertToSeconds();
    return Math.abs(x - y);
  }

  public Clock timeTo(Clock time)
  {
    int x = convertToSeconds();
    int y = time.convertToSeconds();
    int result =  Math.abs(x - y);
    return new Clock(result);
  }
  public String toString(){
    return getHour() + ":" + getMinute() +":" + getSecond();
  }
}


