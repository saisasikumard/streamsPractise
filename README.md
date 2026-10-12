record Employee(int id, String name, String dept, double salary, int age, String city) {}

**Level 1: Basics (filter, map, sorted)**
Print all even numbers from a list of integers.
Square every number and keep those greater than 50.
Convert a list of strings to uppercase.
Find all names starting with "A".
Sort a list of integers in descending order.
Sort employees by salary (descending), then by name.
Get the sum, average, min and max of a list of integers (try IntSummaryStatistics).
Count strings longer than 5 characters.
Remove duplicates from a list.
Find the first element matching a condition (findFirst, Optional handling).
**Level 2: Collectors (the interview favourites)**
Group employees by department.
Count employees in each department.
Find the average salary per department.
Find the highest-paid employee in each department.(Hcl interview)
Partition employees into salary above and below 50,000 (partitioningBy).
Get a map of employee id to name (toMap).
Handle duplicate keys in toMap using a merge function.
Get department to list of employee names (groupingBy + mapping).
Join all employee names into one comma-separated string.
Get the total salary per department, sorted by total descending.
**Level 3: Classic interview questions**
Find the second highest number in a list.
Find the second highest salary employee.
Find the Nth highest salary.
Find duplicate elements in a list.
Find the first non-repeating character in a string.
Find the first repeating character in a string.
Count the frequency of each character in a string.
Count the frequency of each word in a sentence.
Check whether two strings are anagrams.
Reverse each word in a sentence.
Find the longest string in a list.
Check whether a string is a palindrome using streams.
Find the top 3 highest-paid employees.
Find the department with the highest average salary.
Merge two lists and remove duplicates.
**Level 4: flatMap, reduce, IntStream**
Flatten a List<List<Integer>> into one list.
Get all unique characters from a list of words.
Multiply all numbers in a list using reduce.
Generate the first 10 Fibonacci numbers (Stream.iterate).
Print numbers 1 to 100 that are divisible by 3 and 5.
Find the sum of digits of a number.
Find the max and min of a list without using max()/min() (use reduce).
Find the common elements between two lists.
Find the elements present in list A but not in list B.
Convert Map<String, Integer> to a list sorted by value (descending).
**Level 5: Concept questions (usually asked verbally)**
map vs flatMap
Intermediate vs terminal operations
Why are streams lazy?
Collection vs Stream: can a stream be reused?
findFirst vs findAny
peek vs forEach
When should you use parallelStream, and when not to?
Optional: orElse vs orElseGet vs orElseThrow
Collectors.groupingBy with a downstream collector
Comparator.comparing().thenComparing().reversed()
