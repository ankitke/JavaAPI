enum Result
{
    PASS, FAIL, NA;
    
    //public static final Result PASS=new Result();
    //public static final Result FAIL=new Result();
    //public static final Result NA=new Result();
    
    
    int marks;
    Result()
    {
        System.out.println("Constructor in enum");
    }
    void setMarks(int marks)
    {
        this.marks=marks;
    }
    int getMarks()
    {
        return marks;
    }
}
class LaunchENM
{
    public static void main(String args[])
    {
        Result.FAIL.setMarks(50);
        int m1=Result.FAIL.getMarks();
        System.out.println(m1);
        
        int m2=Result.PASS.getMarks();
        System.out.println(m2);
        
        
    }
}