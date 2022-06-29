import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.ArrayList.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


public class Main {
    //generics exercise 1
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    //generics exercise 2
    public static final <T> void swap (List<T> l, int i, int j) {

        Collections.<T>swap(l, i, j);
    }

    //list first 3 exercises
public  static void List()
    {
        ArrayList<Integer> listfirst = new ArrayList<Integer>(7);
        listfirst.add(7);
        listfirst.add(4);
        listfirst.add(5);
        listfirst.add(2);
        listfirst.add(1);
        listfirst.add(2);
        listfirst.add(4);
        listfirst.add(1);
        System.out.println(listfirst); //before eliminating duplicates, and sorting
        Collections.sort(listfirst, Collections.reverseOrder());
        System.out.println(listfirst); //after sorting, but still with duplicates
        Set<Integer> setfirst = new LinkedHashSet<Integer>(listfirst);
        System.out.println("List is without duplicates and sorted:" + setfirst); //no duplicats, and sorted
    }


    public static Map<String, Integer> createMap(Set<String> stringSet, List<Integer> integerList){
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        Iterator<String> stringIterator = stringSet.iterator();
        Iterator<Integer> integerIterator = integerList.iterator();
        while(stringIterator.hasNext()){
            stringIntegerMap.put(stringIterator.next(),integerIterator.next());
        }
        return stringIntegerMap;
    }


    private static void test() {
        String [] a = {"Test1", "Test2"};
        swap(a, 0, 1);
        System.out.println("a:"+Arrays.toString(a));
        List<String> l = new ArrayList<String>(Arrays.asList(a));
        swap(l, 0, 1);
        System.out.println("l:"+l);
       List();
    }
    public static void main(String...args)
    {

        test();
    }


}