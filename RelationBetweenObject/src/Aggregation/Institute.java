package Aggregation;

import java.util.List;

public class Institute {

	 String instituteName; 
	    private List<Branch> branches;  //each institure have various branches
	    //initialize members  
	    Institute(String instituteName, List<Branch> branches)   { 
	        this.instituteName = instituteName; 
	        this.branches = branches; 
	    } 
	    // count and return number of all students in the institute  
	    public int getAllStudentsInInstitute()   { 
	        int noOfStudents = 0; 
	        List<Student> students;  
	        for(Branch branch : branches) 
	        { 
	            students = branch.getStudents(); 
	            for(Student s : students) 
	            { 
	                noOfStudents++; 
	            } 
	        } 
	        return noOfStudents; 
	    } 
}
