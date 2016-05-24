package epam.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Driver class to drive Student comparsion
 * @author rohit
 *
 */
public class CompareObjects {
   Student stud1,stud2;   
   public CompareObjects(){
	    stud1=new Student("rohit",2);
	    stud2=new Student("rahul",1);
   }
   public List<Integer> getSortedRollNo(){
	 List<Student> studentList = new ArrayList<Student>();
	 studentList.add(stud1);
	 studentList.add(stud2);
	 Collections.sort(studentList);
     List<Integer> list = new ArrayList<Integer>();
     for(Student student:studentList){
    	 list.add(student.roll);
     }
     return list;
   }
}
/**
 * Student object maintains the name and rollno of student
 * @author rohit
 *
 */
class Student implements Comparable<Student>{
    String name;
    int roll;
   
    Student(String name,int roll){
    	this.name=name;
    	this.roll=roll;
    }
	
	@Override
	public int compareTo(Student stud){
		if(this.roll < stud.roll){
			return -1;
		}
		else if(this.roll==stud.roll){
			return 0;
		}
		else{
			return 1;
		}
	}
}