package Design;

class Demo
{
    String str;
    static Demo object;

    /*constructor with string parameter*/

    private Demo(String str)
    {
        this.str=str;
    }

    /*Method to obtain object*/

    public static Demo getObject(String str)
    {
        if(object==null)
        {
            object =new Demo(str);
        }

        return object;
    }

}

public class Singelton
{
    public static void main(String[] args)
    {
        Demo demo = Demo.getObject("hi");
        Demo demo1= Demo.getObject("hello");

        /*As we are using singelton if we try to create object for two times it should not work */

        System.out.println(demo.str);
        System.out.println(demo1.str);

    }

}
