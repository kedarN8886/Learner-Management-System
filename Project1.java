package cb;
import java.util.*;


public class Project1 {

	// method to add learner
	public static int addLearner(Scanner sc, String[] names, int[] ages, int[] xps, int count) {
		
		// check array limit
		if(count>=10) {
			System.out.println("Maximum learners reached!");
			return count;
		}
		
		//taking input
		System.out.println("Enter Name : ");
		String name=sc.next();
		
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		
		if(age < 18 || age>100) {
			System.out.println("age is not valid, learner not added");
			return count;
		}
		
		System.out.println("Enter XP : ");
		int xp=sc.nextInt();
		
		//store data
		
		names[count]=name;
		ages[count]=age;
		xps[count]=xp;
		
		count++;
		return count;
	}
	
	
	// method to display
	
	public static void displayLearner(String[] names, int[] ages, int[] xps, int count) {
		
		if(count==0) {
			System.out.println("no learners added");
		
		}
		System.out.println("-----Learner details-----");
		
		for(int i=0;i<count;i++) {
			System.out.println("------------");
			System.out.println("name : " + names[i]);
			System.out.println("age : " + ages[i]);
			System.out.println("xp : " + xps[i]);
		}
		
		
	}
	
	
	//method for avg xp
	
	public static void avgXp(int[] xps, int count) {
		if(count==0) {
			System.out.println("no learners added");
		}
		
		int sum=0;
		
		for(int i=0;i<count;i++) {
			sum+=xps[i];
		}
		
		double avg=sum/count;
		
		System.out.println("avg xp is : " + avg);
	}
	
	
	
	
	
	
	 public static void main(String args[]) {
		 
	     Scanner sc=new Scanner(System.in);
	     
	     String[] names= new String[10];
	     int[] ages=new int[10];
	     int[] xps=new int[10];
	     
	     int count=0;
	     
	    
	    
	     
	     while(true) {
	    	 System.out.println("---------Learner Manager-----------");
	    	 System.out.println("1 Add Learner");
	    	 System.out.println("2 Display All Learners");
	    	 System.out.println("3 Calculate avg XP");
	    	 System.out.println("4 Exit");
	    	 
	    	 System.out.println("Enter choice : ");
	    	 int choice=sc.nextInt();
	    	 
	    	 switch(choice) {
	    	 case 1:
	    		 count =addLearner(sc, names, ages, xps, count);
	    		 break;
	    		 
	    	 case 2:
	    		 displayLearner(names, ages, xps,count);
	    		 break;

	    	 case 3:
	    		 avgXp(xps,count);
	    		 break;
	    		 
	    	 case 4:
	    		 System.out.println("Good Bye");
	    		 sc.close();
	    		 System.exit(0);
                
	    	 default:
	    		System.out.println("Invalid choice");
 
	    		 
	
	    	 }
	    	 
	    		 
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
    	
   }
	 }
	  
