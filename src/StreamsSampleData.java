import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

/**
 * Sample data only (Java 17+). Write your own solutions inside main().
 * Run:  javac StreamsSampleData.java && java StreamsSampleData
 */
public class StreamsSampleData {

    record Employee(int id, String name, String dept, double salary, int age, String city) {}

    // ---------- Employees (Q6, Q11-Q20, Q22, Q23, Q33, Q34) ----------
    // Notes: "Asha" appears twice (for Q17 toMap duplicate keys),
    //        70000 appears twice (for Q23 Nth highest / distinct salaries).
    static final List<Employee> EMPLOYEES = List.of(
            new Employee(1,  "Asha",    "Engineering",  95000, 29, "Hyderabad"),
            new Employee(2,  "Ravi",    "Engineering", 120000, 35, "Bengaluru"),
            new Employee(3,  "Meena",   "HR",           45000, 41, "Chennai"),
            new Employee(4,  "Karthik", "Sales",        70000, 26, "Hyderabad"),
            new Employee(5,  "Priya",   "Sales",        82000, 31, "Mumbai"),
            new Employee(6,  "Suresh",  "HR",           60000, 38, "Chennai"),
            new Employee(7,  "Divya",   "Engineering", 105000, 33, "Bengaluru"),
            new Employee(8,  "Asha",    "Sales",        48000, 27, "Mumbai"),
            new Employee(9,  "Arun",    "Sales",        70000, 30, "Hyderabad"),
            new Employee(10, "Neha",    "Finance",      88000, 36, "Pune"),
            new Employee(11, "Vikram",  "Finance",      52000, 28, "Pune")
    );

    // ---------- Integers (Q1, Q2, Q5, Q7, Q9, Q10, Q21, Q24, Q42) ----------
    // Has duplicates (12, 5, 20) and a mix of even/odd.
    static final List<Integer> NUMBERS = List.of(5, 12, 7, 3, 20, 8, 15, 2, 9, 12, 30, 45, 5, 20);

    // ---------- Strings (Q3, Q4, Q8, Q31) ----------
    // "Bob" is duplicated; several names start with "A"; "Elizabeth" is the longest.
    static final List<String> NAMES =
            List.of("Alice", "Bob", "Anita", "Charlie", "Arjun", "Deepak", "Elizabeth", "Bob", "Zoe");

    // ---------- Character questions (Q25, Q26, Q27) ----------
    static final String CHAR_STRING = "swiss";                 // first non-repeating: w, first repeating: s
    static final String CHAR_STRING_2 = "programming";         // try this one too

    // ---------- Sentence questions (Q28, Q30) ----------
    static final String SENTENCE = "the quick brown fox jumps over the lazy dog the end";

    // ---------- Anagram pairs (Q29) ----------
    static final String[][] ANAGRAM_PAIRS = {
            {"Listen", "Silent"},        // true
            {"Triangle", "Integral"},    // true
            {"Hello", "World"}           // false
    };

    // ---------- Palindromes (Q32) ----------
    static final List<String> PALINDROME_CANDIDATES =
            List.of("Madam", "Racecar", "Stream", "A man a plan a canal Panama", "Java");

    // ---------- Two lists (Q35, Q43, Q44) ----------
    static final List<Integer> LIST_A = List.of(1, 2, 3, 4, 5, 6);
    static final List<Integer> LIST_B = List.of(4, 5, 6, 7, 8, 9);

    // ---------- Nested list (Q36) ----------
    static final List<List<Integer>> NESTED_LIST =
            List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6), List.of(7, 8, 9, 10));

    // ---------- Words for unique characters (Q37) ----------
    static final List<String> WORDS = List.of("java", "stream", "api", "lambda");

    // ---------- Small list for multiplication via reduce (Q38) ----------
    static final List<Integer> SMALL_NUMBERS = List.of(1, 2, 3, 4, 5);

    // ---------- Number for digit sum (Q41) ----------
    static final int DIGIT_NUMBER = 98765;

    // ---------- Map for sorting by value (Q45) ----------
    static final Map<String, Integer> SCORES = Map.of(
            "Asha", 82, "Ravi", 95, "Meena", 67, "Priya", 95, "Karthik", 73
    );

    // =====================================================================
    // Write your solutions below
    // =====================================================================
    public static void main(String[] args) {

        // ---------- Level 1: Basics (Q1-Q10) ----------



        // ---------- Level 2: Collectors (Q11-Q20) ----------


        // ---------- Level 3: Classic interview questions (Q21-Q35) ----------


        // ---------- Level 4: flatMap, reduce, IntStream (Q36-Q45) ----------
    }
    //Print all even numbers from a list of integers.
    public static void evenNumbers(List<Integer> nums){
       nums.stream().filter(x->x%2==0).forEach(System.out::println);
    }
    //Square every number and keep those greater than 50.
    public static void squarefilter50(List<Integer> nums){
        nums.stream().map(x->x*x).filter(x->x>50).forEach(System.out::println);
    }
    //Convert a list of strings to uppercase.
    public static void convertToUpper(List<String> nums){
        nums.stream().map(x->x.toUpperCase()).forEach(System.out::println);
    }

    //Find all names starting with "A".
    public static void findAStrart(List<String> names){
        names.stream().filter(x->x.matches("A.*")).forEach(System.out::println);
    }

    //Sort a list of integers in descending order.
    public static void sortDesc(List<Integer> nums){
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //Sort employees by salary (descending), then by name.
    public static void employeeSortSalaryName(List<Employee> employees){
        employees.stream().sorted(
                Comparator.comparing(Employee::salary)
                        .reversed()
                        .thenComparing(Employee::name)
        ).forEach(System.out::println);

    }

    //Get the sum, average, min and max of a list of integers (try IntSummaryStatistics).
    public static void getStatsInt(List<Integer> nums){
        IntSummaryStatistics stats=nums.stream()
                .collect(
                        Collectors.summarizingInt(x->x)
                );

        System.out.println(stats);




    }

    //Count strings longer than 5 characters.
    public static void countValues(List<String> names){
            long count=names.stream().filter(x->x.length()>5).count();
        System.out.println(count);
    }

    //Remove duplicates from a list.
    public static void removeDuplicates(List<Integer> nums){
        nums.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void findFirstValue(List<Integer> nums){
        int value=nums.stream().filter(x->x>0).findFirst().orElse(null);

        System.out.println(value);
    }
    //Group employees by department.
    public static void groupByDepartment(List<Employee> list){
        list.stream()
                .collect(Collectors.groupingBy(Employee::dept))
                .forEach(
                        (k,v)->System.out.println(k+" :: "+v.stream().map(emp->emp.name+" ( "+emp.id+" )").collect(Collectors.joining(" , "))));
    }

    //Count employees in each department.
    public static void countDeptEmployee(List<Employee> list){
        list.stream()
                .collect(Collectors.groupingBy(Employee::dept,Collectors.counting()))
                .forEach((dept,count)->System.out.println(dept+"::"+count));
    }

    //Find the average salary per department.
    public static void avgDeptEmpSalry(List<Employee> list){
        list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::dept,
                                Collectors.averagingDouble(emp-> emp.salary)
                        ))
                .forEach(
                        (dept,avg)
                                ->System.out.println(dept+"::"+String.format("%.2f",avg)));
    }

    //Find the highest-paid employee in each department.
    public static void deptHighestPaidEmployee(List<Employee> list){
        list.stream().
                collect(
                        Collectors.groupingBy
                                (Employee::dept
                                        ,Collectors.maxBy(
                                                Comparator.comparing((Employee emp)->emp.salary)))).
                forEach((dept,emp)->System.out.println(dept+" "+ "highest salry employee:: "+ emp.map(e-> e.name +"->" + e.id+"->" +e.salary).orElse("No  employee")));

    }

    //Partition employees into salary above and below 50,000 (partitioningBy).
    public static void partitionSalaryEmp(List<Employee> list){
        list.stream()
                .collect(
                        Collectors.partitioningBy(x->x.salary>50000))
                .forEach((k,v)
                        ->System.out.println((k==true?"Above 50k : ":"Below 50k : ")
                        +v.stream().map(emp->emp.name).collect(Collectors.joining(", "))));
    }
    

//    merge function is if toMap found sample key again it thorws error .but to handle write merge function which needs to override
    public static void mapIdTonameEmp(List<Employee> emp){
        Map<Integer,String> map=emp.stream()
                .collect(
                        Collectors.toMap(
                                Employee::id
                                ,Employee::name
                                    //merge function if any duplicaate key how to handle
                ));
        System.out.println(map);
    }

    public static void mapIdTonameEmpHandleDuplicatesMergeFunction(List<Employee> emp){
        Map<Integer,String> map=emp.stream()
                .collect(
                        Collectors.toMap(
                                Employee::id
                                ,Employee::name
                                ,(Existing,Replacement)->Replacement    //merge function if any duplicaate key how to handle
                        ));
        System.out.println(map);
    }

    public static void groupByDeptEmp(List<Employee> employees){
        Map<String,List<String>> map=employees
                                        .stream()
                                        .collect(
                                                Collectors.groupingBy(
                                                        Employee::dept,
                                                        Collectors.mapping(
                                                                Employee::name,Collectors.toList()
                                                        )));
        System.out.println(map);

    }

    public static void empnamesjoining(List<Employee> list){
        String res=list.stream().map(Employee::name).collect(Collectors.joining(","));
        System.out.println(res);
    }

    //Get the total salary per department, sorted by total descending.
    public static void totalSalryDepartmentEmp(List<Employee> emp){
        Map<String,Double>map=emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.summingDouble(Employee::salary)))
                .entrySet().stream().sorted(
                        Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->a,
                        LinkedHashMap::new
                ));
        System.out.println(map);

    }

    public static void secondHighestEmp(List<Employee> list){
        Double secondSalary=list.stream().
                sorted(Comparator.comparing(Employee::salary).reversed())
                .map(Employee::salary)
                .distinct().
                skip(1).
                findFirst()
                .orElse(null);
        System.out.println(secondSalary);

      /*  Employee emp = list.stream()
                .filter(e -> e.salary() == list.stream()
                        .map(Employee::salary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(0.0))
                .findFirst()
                .orElse(null);
        */


    }
    //Find the second highest salary employee.
    public static void secondHighestSalaryEmployee(List<Employee> list){
        Double secondHighestSalary =list.stream().sorted(Comparator.comparing(Employee::salary).reversed()).map(Employee::salary).distinct().skip(1).findFirst().orElse(null);
        Employee emp=list.stream().filter(em->em.salary==secondHighestSalary).findFirst().orElse(null);
        System.out.println(emp);
    }

    //Find the Nth highest salary.
    public static void nthHighestSalaryEmployee(List<Employee> list,int n){
        Double secondHighestSalary = list.stream()
                                            .sorted(Comparator.comparing(Employee::salary).reversed())
                                                .map(Employee::salary)
                                                .distinct()
                                            .skip(n-1)
                                            .findFirst()
                                            .orElse(null);
        if(secondHighestSalary==null){
            System.out.println("No employee Found");
            return;
        }
        Employee emp=list.stream().filter(em->em.salary==secondHighestSalary).findFirst().orElse(null);
        System.out.println(emp);
    }

    //Find duplicate elements in a list.
    public static void findDuplictes(List<Integer> list){
        List<Integer> res=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(Predicate.not(freq->freq.getValue()>1)).map(freq->freq.getKey()).collect(Collectors.toList());
        System.out.println(res);
    }

    //Find the first non-repeating character in a string.
    public static void nonRepeatingChar(String str){
        Character res
                = str
                .chars()
                .mapToObj(ch->(char)ch)
                .collect(
                        Collectors.groupingBy(
                                Function.identity()
                                ,LinkedHashMap::new
                                ,Collectors.counting()))
                .entrySet().stream().filter(freq->freq.getValue()==1).map(freq->freq.getKey()).findFirst().orElse(null);

        System.out.println(res);
    }

    //Find the first repeating character in a string.
    public static void firstRepeatingCharacter(String s) {
        Character res = s.
                chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity()
                                , () -> new LinkedHashMap<>()
                                , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(freq -> freq.getValue() > 1)
                .map(freq -> freq.getKey())
                .findFirst()
                .orElse(null);
        System.out.println(res);
    }
        //Count the frequency of each character in a string.
        public static void freqCharacterString(String str){
            str.chars().mapToObj(ch->(char) ch)
                    .collect(Collectors.groupingBy(Function.identity(),()->new LinkedHashMap<>(),Collectors.counting()))
                    .entrySet().forEach((entry)->System.out.println(entry.getKey()+" -> "+entry.getValue()));
        }
        //Count the frequency of each word in a sentence.
        public static void freqWord(String str){
            Arrays
                    .stream(str.split(" "))
                    .collect
                            (Collectors.groupingBy
                                    (Function.identity(),
                                            ()->new LinkedHashMap<>(),
                                            Collectors.counting()))
                    .entrySet()
                    .stream()
                    .forEach(System.out::println);
        }

        //Check whether two strings are anagrams.
    public static void isTwoAnagrams(String str1,String str2){
            boolean res= Arrays.equals
                    (
                            str1.chars().sorted().toArray(),
                            str2.chars().sorted().toArray()
                    );
        System.out.println(res);
    }

    //Reverse each word in a sentence.
    public static void reverseWords(String str){
       List<String> list= Arrays.stream(str.split(" ")).collect(Collectors.toList());
        Collections.reverse(list);
        String res= list.stream().collect(Collectors.joining(" "));
        System.out.println(res);

        String rev=Arrays.stream(str.split(" ")).
                collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        listRev->{
                            Collections.reverse(listRev);
                            return list.stream()
                                    .collect(Collectors.joining(" "));
                        }
                ));
        System.out.println(rev);

    }

    //Find the longest string in a list.
    public static void longestString(List<String> list){
        String res=list.stream().max(Comparator.comparing(str->str.length())).get();
        System.out.println(res);
    }

    //Check whether a string is a palindrome using streams.
    public static void ispalindrome(String str){
        boolean res=IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(res);
    }

    //Find the top 3 highest-paid employees.
    public  static void top3HighestEMployees(List<Employee> list){
        list.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .limit(3)
                .forEach(em->System.out.println(em.name));
    }

    //Find the department with the highest average salary.
    public static void depHighestAvgSalary(List<Employee> list){
        String dept=
                list
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        emp->emp.dept,
                                            Collectors.averagingDouble(empl->empl.salary)))
                        .entrySet()
                        .stream()
                        .max(Comparator.comparing(deptAvg->deptAvg.getValue()))
                        .map(avgSal->avgSal.getKey())
                        .orElse(null);
        System.out.println(dept);
    }
    //Merge two lists and remove duplicates.
    public static void mergeListUnique(List<List<String>> list){
        List<String> res=list.stream().flatMap(list1->list1.stream()).distinct().collect(Collectors.toList());
        System.out.println(res);
    }


    }


