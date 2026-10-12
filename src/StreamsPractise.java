import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractise {
    public List<Integer> filterEven01(List<Integer> list){
        return list.stream().filter(a->a%2==0).toList();
    }
    public void convertToString02(List<String> list){
         list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }

    //max value in list
    public void findMaxValue03(List<Integer> list){
        /* method reference Integer::compareTo is to handle (a,b)->a.compareTo(b) */
        //  int maxValue=list.stream().max(Integer::compareTo).get();
        Integer maxValue =list.stream().filter(Objects::nonNull).max((a, b)->a.compareTo(b)).orElse(null);
        System.out.println(maxValue);
    }

    public void groupByLength(List<String> list){
        
    }
    public  void filtertNull(List<String> list){
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }

    public void flateNestedList(List<List<String>> list){
        list.stream().flatMap(List::stream).forEach(System.out::println);
    }

    //partition nby even
    public void partyionByEvenOdd(List<Integer> list){
        Map<Boolean,List<Integer>> res=list.stream().collect(Collectors.partitioningBy(s->s%2==0));
        System.out.println("Even Numbers: " +res.get(true));
        System.out.println("Odd Numbers: " +res.get(false));
    }

    public void freq(List<Integer> list){
        list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().forEach(x-> System.out.println(x.getKey()+" : freq:"+x.getValue()));
    }
    public void merge2Lists(List<String> list1,List<String> list2){
        List<String> res=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        res.stream().forEach(System.out::println);
    }
    public void convertToSqueres(List<Integer> list){
        List<Integer> res=list.stream().map(x->(x*x)).collect(Collectors.toList());
        res.stream().forEach(System.out::println);
    }
    public void removeDuplicateString(List<String> list){
        List<String>   res=list.stream().distinct().collect(Collectors.toList());
        res.stream().forEach(System.out::println);
    }
    public void findFirstinList(List<Integer> list){
        Integer res=list.stream().findFirst().orElse(-1);
        System.out.println(res);

    }
    public void sumOfElements(List<Integer> list){
        list.stream().reduce((a,b)->a+b).ifPresent(System.out::println);
    }
    public void gretherthanNumber(List<Integer> list){
        list.stream().filter(x->x%10==0).forEach(System.out::println);
    }
    public void largestLengtWord(List<String> list){
        String res=list.stream().max(Comparator.comparingInt(x->x.length())).orElse("No value");
        System.out.println(res);
    }
    public void secondHighest(List<Integer> list){
        Integer res=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(res);
    }
    public void collectOdd(List<Integer> list){
        Set<Integer> res=list.stream().filter(x->x%2!=0).collect(Collectors.toSet());
        res.stream().forEach(System.out::println);
    }
    public void allPositive(List<Integer> list){
        Boolean isPositive=list.stream().allMatch(a->a>0);
        System.out.println(isPositive);
    }

    public void findMinValue(List<Integer> list){
        int min=list.stream().min((a,b)->a-b).orElse(-1);
        System.out.println(min);
    }
    public void findAvg(List<Integer> list){
        Double avg=list.stream().mapToDouble(x->x).average().orElse(0.0);
        System.out.println(avg);
    }

    public void findContains(List<String>  list){
        List<String> matchedWords=list.stream().filter(x->x.toLowerCase().contains("k")).collect(Collectors.toList());
        System.out.println(matchedWords);
    }

    public void concatList(List<String> list){
        String res=list.stream().collect(Collectors.joining(","));
        System.out.println(res);


    }


    public static void evenNumbers(List<Integer> nums){
        nums.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
