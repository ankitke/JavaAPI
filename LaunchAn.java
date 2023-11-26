//functional interface
@FunctionalInterface
interface Demo
{
    void disp();
    //void disp2();
}
//this is parent class 
@Deprecated
class Plane
{
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
}
//this is child class or subclass
class CargoPlane extends Plane
{
    //overriden methods from parent class
    @Override
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");
    }
    
}
class LaunchAn
{
    public static void main(String args[])
    {
        //Object of child classes
        Plane cp=new CargoPlane();
        cp.PlaneFliesAtGoodHeight();
        
        
    }
}