import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

class LaunchSTR
{
    public static void main(String args[])
    {
        List<Integer> list=Arrays.asList(2,4,5,8,9);
        Stream<Integer> streamData=list.stream();
        streamData.forEach(n->System.out.println(n));
        //streamData.forEach(n->System.out.println(n));   //we cannot work second time on stream
        
    }
}