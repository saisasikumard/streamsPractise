import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.text.html.parser.DTDConstants.NUMBERS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    StreamsSampleData streamsSampleData=new StreamsSampleData();
    public static void main(String[] args) {

//        StreamsPractise streamsPractise=new StreamsPractise();
//        System.out.println("Hello and welcome!");
//
//        //Filter even numbers
//
//        List<Integer> res=streamsPractise.filterEven01(Arrays.asList(1,2,3,45,6));
//        res.stream().forEach(System.out::println);
//
//        //Convert to upper case
//        streamsPractise.convertToString02(Arrays.asList("apple","Boat","chicken Biryani","DUM"));

        //List.of not supports null values
        //streamsPractise.findMaxValue03(List.of(null));
     //   streamsPractise.filtertNull(Arrays.asList(null,"sasi","rishi",null,"kymar"));

//        streamsPractise.
//                flateNestedList
//                        (
//                                List.of(
//                                        List.of("sasi","abc"),
//                                        List.of("ris","bsed"),
//                                        List.of("naveen","na")
//                                )
//                        );

//            streamsPractise.partyionByEvenOdd(Arrays.asList(1,2,3,45,6));
//
//            streamsPractise.freq(List.of(1,1,1,1,1,3,4,5,6,7,8,5,3,2,4,4,4,4));

//        List<String> list1=Arrays.asList("Abc","Def","Ghi");
//        List<String> list2=List.of("Jkl","Mno","Pqr");


       // streamsPractise.merge2Lists(list1,list2);
        //streamsPractise.convertToSqueres(Arrays.asList(1,2,3,5,7,99));
        //streamsPractise.removeDuplicateString(List.of("apple","bag","chicken","bag","apple"));
       // streamsPractise.findFirstinList(Arrays.asList(1,4,6,7,8,9,0,66));
        //streamsPractise.sumOfElements(Arrays.asList(1,2,4,5,6,7));
       // streamsPractise.gretherthanNumber(Arrays.asList(11,12,12,10,12,20,50));
       // streamsPractise.largestLengtWord(List.of());
        //streamsPractise.secondHighest(List.of(1,2,13,12,12,11,10,5));
        //streamsPractise.collectOdd(List.of(1,2,3,5,6,7,7,8,9,9,9,9,9,10,10));
        //streamsPractise.allPositive(List.of(1,2,4,6,7,8,9,-22,-43));
        //streamsPractise.findMinValue(List.of(1,2,4,6,7,8,9,-22,-43));
      //  streamsPractise.findAvg(List.of(1,2,4,6,7,8,9,-22,-43));
        //streamsPractise.findContains(List.of("apple","Banana","Carrot","Kiwi"));
//        streamsPractise.concatList(List.of("apple","Banana","Carrot","Kiwi"));

//        writtenCP writtenCP=new writtenCP();
//        String entryTime = "2026-09-26T18:45:30";
//        String exitTime = "2026-09-27T18:45:30";
//        writtenCP.calculate(entryTime,exitTime);


        //Q1
                //StreamsSampleData.evenNumbers(StreamsSampleData.NUMBERS);
        //Q2
                //StreamsSampleData.squarefilter50(StreamsSampleData.NUMBERS);
        //Q3
                //StreamsSampleData.convertToUpper(StreamsSampleData.NAMES);
        //Q4
               // StreamsSampleData.findAStrart(StreamsSampleData.NAMES);
        //Q5
                //StreamsSampleData.sortDesc(StreamsSampleData.NUMBERS);
        //Q6
             //   StreamsSampleData.employeeSortSalaryName(StreamsSampleData.EMPLOYEES);
        //Q7
                //StreamsSampleData.getStatsInt(StreamsSampleData.NUMBERS);

        //Q8
                //StreamsSampleData.countValues(StreamsSampleData.NAMES);
        //Q9
                //StreamsSampleData.removeDuplicates(StreamsSampleData.NUMBERS);
        //Q10
               // StreamsSampleData.findFirstValue(StreamsSampleData.NUMBERS);
        //Q11
                //StreamsSampleData.groupByDepartment(StreamsSampleData.EMPLOYEES);
        //Q12
                //StreamsSampleData.countDeptEmployee(StreamsSampleData.EMPLOYEES);

        //Q13
                //StreamsSampleData.avgDeptEmpSalry(StreamsSampleData.EMPLOYEES);
        //Q14
               //StreamsSampleData.deptHighestPaidEmployee(StreamsSampleData.EMPLOYEES);

       //Q15
                //StreamsSampleData.partitionSalaryEmp(StreamsSampleData.EMPLOYEES);
        //Q16
               // StreamsSampleData.mapIdTonameEmp(StreamsSampleData.EMPLOYEES);
        //Q17
               // StreamsSampleData.mapIdTonameEmpHandleDuplicatesMergeFunction(StreamsSampleData.EMPLOYEES);
        //Q18
                //StreamsSampleData.groupByDeptEmp(StreamsSampleData.EMPLOYEES);
        //Q19
                //StreamsSampleData.empnamesjoining(StreamsSampleData.EMPLOYEES);
        //Q20
                //StreamsSampleData.totalSalryDepartmentEmp(StreamsSampleData.EMPLOYEES);
        //21
                //StreamsSampleData.secondHighestEmp(StreamsSampleData.EMPLOYEES);
        //22
                //StreamsSampleData.secondHighestSalaryEmployee(StreamsSampleData.EMPLOYEES);
        //23
                //StreamsSampleData.nthHighestSalaryEmployee(StreamsSampleData.EMPLOYEES,50);
        //Q24
                //StreamsSampleData.findDuplictes(StreamsSampleData.NUMBERS);
         //Q25
                //StreamsSampleData.nonRepeatingChar("sasdffnfngi");
        //Q26
                //StreamsSampleData.firstRepeatingCharacter("sasdffnfngi");
        //Q27
                //StreamsSampleData.freqCharacterString("aefvfsvanufovbna");
        //Q28
                //StreamsSampleData.freqWord("i am am sasi kumar sai kumar");
        //Q29
                //StreamsSampleData.isTwoAnagrams("asst","ssa");
        //Q30
                //StreamsSampleData.reverseWords("i am sai kumar");
        //Q31
                //StreamsSampleData.longestString(StreamsSampleData.NAMES);
        //Q32
                //StreamsSampleData.ispalindrome("levelee");
        //Q33
                //StreamsSampleData.top3HighestEMployees(StreamsSampleData.EMPLOYEES);
        //Q34
                //StreamsSampleData.depHighestAvgSalary(StreamsSampleData.EMPLOYEES);
        //Q35
        List<List<String>> list= Arrays.asList(List.of("abc","cde"),Arrays.asList("fghj0","abc","rtyh"),List.of("ahb","vnfkjnv"));
        StreamsSampleData.mergeListUnique(list);

    }

}