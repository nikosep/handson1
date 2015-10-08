package handson_1;
import java.util.Scanner;


public class main_class {
	

	public static void main(String[] args) {
		
	//Create a student object	
		int mark1 = 0;
	    int mark2 = 0;
	    int mark3 = 0;
	    int mark4 = 0;
	    int mark5 = 0;
for (int i=1;i<=5;i++){ 
	System.out.println("Select the code of the module:");	
	System.out.println("1.Mathematics\n2.English\n3.Hindi\n4.Science\n5.Social Science");	
	System.out.print("Please type:");
	int choice;
    Scanner in = new Scanner(System.in);
    choice = in.nextInt();    
    System.out.println("You selected  "+ choice);
    
   
    switch(choice){
    	case 1:
    		System.out.print("Please give the mark for Mathematics:");    		
    	    Scanner in1 = new Scanner(System.in);
    	    mark1 = in1.nextInt();   
    	    System.out.println("You entered  "+ mark1);    	    
    	    break;
    	    
    	case 2:
    		System.out.print("Please give the mark for English:");    		
    	    Scanner in2 = new Scanner(System.in);
    	    mark2 = in2.nextInt();    
    	    System.out.println("You entered  "+ mark2);    	    
    	    break;
    	case 3:
    		System.out.print("Please give the mark for Hindi:");    		
    	    Scanner in3 = new Scanner(System.in);
    	    mark3 = in3.nextInt();    
    	    System.out.println("You entered  "+ mark3);    	    
    	    break;    
    	case 4:
    		System.out.print("Please give the mark for Science:");    		
    	    Scanner in4 = new Scanner(System.in);
    	    mark4 = in4.nextInt();    
    	    System.out.println("You entered  "+ mark4);    	    
    	    break;    
    	case 5:
    		System.out.print("Please give the mark for Social Science:");    		
    	    Scanner in5 = new Scanner(System.in);
    	    mark5 = in5.nextInt();    
    	    System.out.println("You entered  "+ mark5);    	    
    	    break;    
    	default:
    		System.out.print("Wrong !");
    		 break;
    		
    	};//end of switch
}
    float performance = ((mark1 + mark2 + mark3 + mark4 + mark5)/5);
	student first_student = new student("nikos", performance);	

	//float avg = first_student.avg_marks;
	//System.out.println("The average is: "+ testarw);    	  
	System.out.println("His / Her performance is:"+first_student.category(first_student.avg_marks));
	
	
	}// end of main

}
