import java.util.*;
import java.util.Arrays;
class LaunchFE
{
    public static void main(String args[])
    {
    //     List<Integer> list1=new ArrayList<Integer>();
    //     list1.add(2);
    //     list1.add(5);
    //     list1.add(26);
    //     list1.add(12);
    //   // list1.add("Ankit");   //error
    //     System.out.println(list1);
        
        List<Integer> list2=Arrays.asList(2,4,6,5,9);
        System.out.println(list2);
        
        // for(Integer i: list2)
        // {
        //     System.out.println(i);
        // }
        
        list2.forEach(i->System.out.println(i));     //for-each
    }
}