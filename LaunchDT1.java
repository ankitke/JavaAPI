//import java.util.Date;
//import java.util.ArrayList;
class LaunchDT1
{
    public static void main(String args[])
    {
       // java.util.ArrayList al=new java.util.ArrayList();
        java.util.Date dt =new java.util.Date();
        System.out.println(dt);
        
        long timeINMS=dt.getTime();
        java.sql.Date dt1=new java.sql.Date(timeINMS);
        System.out.println(dt1);
    }
}