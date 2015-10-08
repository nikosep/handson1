package handson_1;

public class student {

	String name_student;
	float avg_marks;
	
public student(String name, float marks) {
		 name_student  = name;
		 avg_marks = marks;
	}

//method | category
public String category(float performance){
	
	if (performance<=40){
		return  "Poor"; 
	}
	else if ((performance>40)&&(performance<=59)){
		return "Average";
	}
	else if ((performance>60)&&(performance<=79)){
		return "Good";
	}
	else if ((performance>80)&&(performance<=89)){
		return "Very Very Good";
	}
	else if ((performance>90)&&(performance<=100))
	{
		return "Excellent";
	}
	else
	{
		return "ERROR CHANGE ";
	
	}
	
}// end of method

}
