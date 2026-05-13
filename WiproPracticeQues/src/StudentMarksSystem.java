import java.util.ArrayList;
import java.util.Collections;

public class StudentMarksSystem {
	 public static void main(String[] args) {
	ArrayList<Integer> stuMarks=new ArrayList<>();
	
	stuMarks.add(100);
	stuMarks.add(50);
	stuMarks.add(30);
	stuMarks.add(65);
	stuMarks.add(69);
	
	int minMarks= Collections.min(stuMarks);
	int maxMarks=Collections.max(stuMarks);
	
	double avgMarks = 0;
	
	for(int mark:stuMarks) {
		avgMarks+=mark;
	}
	double Marks=avgMarks/stuMarks.size();
	
	
	System.out.println("Max: " + maxMarks);
    System.out.println("Min: " + minMarks);
    System.out.println("Average: " + Marks);
}}
