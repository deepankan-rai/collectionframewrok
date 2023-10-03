package practise;

import java.util.Map;

public class FindByKey {

	
	   public static String findValue(Map<String, String> students, String name) {
	        if (students.containsKey(name)) {
	            return students.get(name);
	        } else {
	            return "Not Found";
	        }
	    }

	    public static void main(String[] args) {
	        Map<String, String> studentGrades = Map.of(
	            "Alice", "A",
	            "Bob", "B",
	            "Charlie", "C",
	            "David", "D"
	        );
	        String studentName = "Bob";
	        String grade = findValue(studentGrades, studentName);
	        System.out.println("Grade for " + studentName + ": " + grade);

	        String nonExistentStudentName = "Eve";
	        String nonExistentGrade = findValue(studentGrades, nonExistentStudentName);
	        System.out.println("Grade for " + nonExistentStudentName + ": " + nonExistentGrade);
	    }
}
