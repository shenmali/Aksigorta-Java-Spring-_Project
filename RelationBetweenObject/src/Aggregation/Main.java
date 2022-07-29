package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//declare student objects
        Student s1 = new Student("Ali", 1, "CS"); 
        Student s2 = new Student("Ayse", 2, "CS"); 
        Student s3 = new Student("Veli", 1, "SE"); 
        Student s4 = new Student("Fatma", 2, "SE"); 
       
        // List of CSE Students. 
        List <Student> cse_students = new ArrayList<Student>(); 
        cse_students.add(s1); 
        cse_students.add(s2); 
           
        //List of ETC Students 
        List <Student> etc_students = new ArrayList<Student>(); 
        etc_students.add(s3); 
        etc_students.add(s4); 
        //declare Branch objects  
        Branch CS = new Branch("CS", cse_students); 
        Branch SE = new Branch("SE", etc_students); 
         
        //make list of branches  
        List <Branch> branches = new ArrayList<Branch>(); 
        branches.add(CS); 
        branches.add(SE); 
           
        // creating an object of Institute. 
        Institute institute = new Institute("MIT", branches); 
        //display total number of students  
        System.out.print("Total students in MIT institute: "); 
        System.out.print(institute.getAllStudentsInInstitute()); 

	}

}
