
public class PrintDayInWord {
public static void main(String[] args) {
	int daynumber = 5; 
	 
	 // Using nested-if
	 if (daynumber == 1) { // Use == for comparison
	 System.out.println("SUNDAY"); 
	 } else if (daynumber == 2) { 
	 System.out.println("MONDAY"); 
	 } else if (daynumber == 3) { 
	 System.out.println("TUESDAY");
	 }else if (daynumber == 4) { 
	 System.out.println("WEDNESDAY"); 
	 }else if (daynumber == 5) { 
	 System.out.println("THURSDAY"); 
	 }else if (daynumber == 6) { 
		 System.out.println("FRIDAY"); 
		 }  
	 else if (daynumber == 7) { 
		 System.out.println("SATURDAY"); 
		 } 
	 else {  
	 System.out.println("Not a valid dayay");
	 } 
	 
	 // Using switch-case-default
	 switch(daynumber) { 
	 case 1: 
	 System.out.println("SUNDAY"); break;
	 case 2: 
	 System.out.println("MONDAY"); break; 
	 case 3:
		 System.out.println("TUESDAY");break;
	 case 4:
		 System.out.println("WEDNESDAY");break;
	 case 5:
		 System.out.println("THURSDAY");break;
	 case 6:
		 System.out.println("FRIDAY");break;
	 case 7:
		 System.out.println("SATURDAY");break;
	 default: System.out.println("Not a valid day"); 
	 } 
}
}
