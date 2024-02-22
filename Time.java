public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time()
    {
        hour = 12;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hin)
    {
        if(hin >=0 && hin <=23)
            hour = hin;
    }

    public int getHour()
    {
        return hour;
    }
}
