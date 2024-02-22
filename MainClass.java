public class MainClass
{
    public MainClass()
    {
        System.out.println("in constructor");
        Time now = new Time();
        Time then = new Time(23,30,33);
        now.setHour(15);
        System.out.println("now hour is "+now.getHour());

    }
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        MainClass obj;
        obj = new MainClass();

    }


}