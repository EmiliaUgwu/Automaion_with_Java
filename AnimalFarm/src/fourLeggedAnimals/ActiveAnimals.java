package fourLeggedAnimals;

public class ActiveAnimals {
 
		int numOflegs;
		boolean hasStronglegs;
		boolean hasSoremouth;
		
		public ActiveAnimals (int numOflegs, boolean hasStronglegs, boolean hasSoremouth){
			
			this.numOflegs = numOflegs;
			this.hasStronglegs = hasStronglegs;
			this.hasSoremouth = hasSoremouth;	
		}
		
		public void eat(){
			if(numOflegs == 4){
				if(hasSoremouth == false){
					System.out.println("This animal can eat");
		}else{
		System.out.println("Sorry this animal has got sore mouth, so it can not eat");
		}
		}else {
		System.out.println("This is not a four legged animal please try again");
		}
		}
		public void run(){
			if(numOflegs == 4){
				if(hasStronglegs == true){
					System.out.println("This animal can run");
					}else{
						System.out.println("Sorry this animal can not run");
		}
		}else{
		System.out.println("This is not a four legged animal please try again");
		}
		}
		public void walk(){
		if(numOflegs == 4){
				System.out.println("This animal can walk");
		}else {
		System.out.println("This is not a four legged animal please try again");
		}	
		}
		public void jump(){
			if(numOflegs == 4){
				if(hasStronglegs == true){
					System.out.println("This animal can jump");
		}else{
		System.out.println("Sorry this animal can not jump");
		}	
		}else{
		System.out.println("This is not a four legged animal please try again");	
		}	
		}
		}

