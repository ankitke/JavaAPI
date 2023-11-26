enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
class LaunchEnum1
{
    enum Result
    {
        PASS, FAIL, NR;
    }
    public static void main(String args[])
    {
        Week w=Week.MON;
        System.out.println(w);
        
        int index=Week.TUE.ordinal();
        System.out.println(index);
        
        Week []w1=Week.values();
        for(Week we: w1)
        {
            System.out.println(we+":"+we.ordinal());
        }
        
        Result r=Result.PASS;
        System.out.println(r);
        

    }
}