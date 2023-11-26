import java.lang.annotation.*;


@interface CricketPlayer  //own create annotation
{

}
@CricketPlayer             //own create annotation ues
class Virat
{
    private int innings;
    private int runs;
    
    public int getInnings()
    {
        return innings;
    }
    public void setInnings(int innings)
    {
        this.innings=innings;
    }
    public int getRuns()
    {
        return runs;
    }
    public void setRuns(int runs)
    {
        this.runs=runs;
    }
}
class LaunchAn2
{
    public static void main(String args[])
    {
        Virat v=new Virat();
        v.setInnings(200);
        v.setRuns(100);
        
        System.out.println(v.getInnings());
        System.out.println(v.getRuns());
        

    }
}