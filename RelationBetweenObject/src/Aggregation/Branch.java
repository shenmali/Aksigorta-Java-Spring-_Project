package Aggregation;
import java.util.*; 

public class Branch {
	 String Branch_name; 
	    private List<Student> students; //Each branch contain students  
	    Branch(String Branch_name, List<Student> students)    { 
	        this.Branch_name = Branch_name; 
	        this.students = students; 
	    } 
	    //return list of students  
	    public List<Student> getStudents()  
	    { 
	        return students; 
	    } 

}
