enum Result
{
    PASS, FAIL, NA;
}
class LaunchEnum2
{
    public static void main(String args[])
    {
        Result res=Result.PASS;
        switch(res)
        {
            case PASS: System.out.println("Passes!");
            break;
            case FAIL: System.out.println("Failed!");
            break;
            case NA: System.out.println("Not Applicable");
        }
    }
}