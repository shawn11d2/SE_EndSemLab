import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Your name: ");  
		String name= scn.nextLine();  
		
		Integer points=0;
	
		System.out.println(" Select your Qulification");
        System.out.println("1. Masters");
        System.out.println("2. Graduation");
        System.out.println("3. HSSC");
        System.out.println("4. Exit ");
    
        
    	int choice = scn.nextInt();
        
        
        switch(choice) 
        {    
        	case 1:
        		points=5;
        		
        	 	break;
        	 
        	case 2:
        		points=3;
        			        		
           	 	break;
           	 
        	case 3:
        		points=1;
        		
             	break;
  
        	case 4:
        		break;
        	
        	default:
        		System.out.println("Invalid option");
        		break;
        }
        
      
        
        System.out.println(" Represented goa in Any Sports");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice2 = scn.nextInt();
        
        switch(choice2) 
        {    
        	case 1:
        		points=points+3;
        	
        	 	break;
        	 
        	case 2:
        		points=points;	        		
           	 	break;
        	
        	default:
        		System.out.println("Invalid option");
        		break;
        }
        
        scn.close();
        
        System.out.print("Candidate Name - "+name);
        System.out.println("Points :"+points);
        



	}

}
