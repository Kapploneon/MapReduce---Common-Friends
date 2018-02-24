package BigData;

import java.lang.reflect.Array;
import java.util.*;

public class test {

    public static void main(String [] args){
    /*    String input ="a    b,c,d";
        String[] line=input.split("\\s+");
        String[] friendList=line[1].split(",");

        System.out.println(line);
        System.out.println("----------------");
        System.out.println(friendList);  */

/*

    Set<Integer> a = new HashSet<Integer>();
    Set<Integer> b = new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        b.add(1);
        b.add(4);
        b.add(5);
       a.retainAll(b);
       Integer [] arr = a.toArray(new Integer [a.size()]);
       Set<Integer> d = new HashSet<Integer>(Arrays.asList(arr));*/
      /*  Deque<ArrayList<Long>> deq = new ArrayDeque<>();
        ArrayList<Long> arrl = new ArrayList<Long>();
        arrl.add(2L);
        arrl.add(1L);
        arrl.add(3L);
        deq.add(arrl);
        Object [] arr1 =  deq.removeFirst().toArray();
        Long [] arr = Arrays.copyOf( arr1 , arr1.length, Long[].class );
        Arrays.sort(arr);
        long temp = arr[2];
        System.out.println(temp);
        int i=0;
        while(i<arr.length)
        System.out.println(arr[i++]);*/
        String value = "A, 3140, 254, 6";
      //  String[] line=value.toString().split("(,)|(\\s)");
     //   String[] line=value.toString().split(",");
        String[] line=value.toString().split("[,\\s]+");
        for (String str:line
             ) {
            System.out.println(str);
        }
    }
}
