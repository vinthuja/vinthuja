class Cricketer{
	protected String name,birthdate,country,role;
	protected  double height;
	protected int runs;
	
	Cricketer(String name,String birthdate,double height,String country){
		this.name=name;
		this.birthdate=birthdate;
		this.height=height;
		this.country=country;
		
	}
	Cricketer (int runs){
		this.runs=runs;
	}
	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return role;
	}
	
}
class Batsman extends Cricketer{
	protected int runs,ballfaced,innigs;
	
	Batsman(String name,String birthdate,double height,String country,int runs,int innigs, int ballfaced){
		super(name,birthdate,height,country);
		this.runs=runs;
		this.ballfaced=ballfaced;
		this.innigs=innigs;
	}
	Batsman(int runs){
		super(runs);
		this.runs=runs;
	}
	public void setruns(int runs){
		this.runs=runs;
	}
	public int getRuns(){
		return runs;
	}
	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return role;
	}
	
	public double getBattingAverage(){
		double battingAverage=runs/innigs;
		return battingAverage;
	}
	
	public double getBattingStrlkerate(){
		double battingStrikeRate=100*runs/ballfaced;
		return battingStrikeRate;
	}
	
	public boolean checkSuitability(){
		if(getBattingStrlkerate()>100){
			
			System.out.println("he is eligible to play for the Twenty20 matches.");
			return true;
			
		}
		else{
			System.out.println("not eligible");
			return false;
		}
	}
	
	public int CalculateHighest(int array[]){
		int num=array[0];
		for(int i=0; i<10; i++){
			if(num<array[i]){
				num=array[i];
			}
		}
		System.out.println(num);
		return num;
		
	}
}

class Bowler extends Cricketer{
	protected int runs ,wickets,balls;
	
	Bowler(String name, String birthdate,double height,String country, int runs,int wickets, int balls){
		super(name,birthdate,height,country);
		this.runs=runs;
		this.wickets=wickets;
		this.balls=balls;
	}
	
	public double getBowlingsAverage(){
		double BowlingAverage=runs/wickets;
		return BowlingAverage;
	}
	
	public double getBowlingEconomyrate(){
		double BowlingEconomyrate=runs/(balls/6);
		return BowlingEconomyrate;
	}
	
	public double getBowlingStrikerate(){
		double BowlingStrikeRate=balls/wickets;
		return BowlingStrikeRate;
	}
	
	
}
class Match{
	protected String team1,team2;
	
	Match(String team1, String team2){
		this.team1=team1;
		this.team2=team2;
	}
	
	public String getWinningTeam(){
		//String arrayCountry[][] = [2][7];
		
		String arrayCountry[]=new String [] {"India","South Africa","England","Australia","Afghanistan","Sri Lanka","Bangladesh"};
		for(int j=0; j<arrayCountry.length; j++){
			
				team2=arrayCountry[j];
				if(team2>team1){
					team1=arrayCountry[j];
					return team2;
				}
				else{
					return team1;
				}
			
		}
		
	}
	
	public static void main(String []args){
		Batsman obj1=new Batsman("Dinesh Chandimal","18/11/1989",5.8, "Sri lanka",774,46,746);
		System.out.println("Name: "+obj1.name);
		System.out.println("Birth Date: "+obj1.birthdate);
		System.out.println("Height: "+obj1.height);
		System.out.println("Country"+obj1.country);
		System.out.println("Runs: "+obj1.runs);
		System.out.println("Ballfaced: "+obj1.ballfaced);
		System.out.println("Innigs: "+obj1.innigs);
		System.out.println("Batting Average: "+obj1.getBattingAverage());
		System.out.println("Batting Strike Rate: "+obj1.getBattingStrlkerate());
		System.out.println("Check Suitability: "+obj1.checkSuitability());
		System.out.println("role: "+obj1.getRole());
		
		//Batsman obj3=new Batsman();
		/*Batsman Arr_List[]=new int[10];
			Arr_List[0]= new Batsman(12);
			Arr_List[1]= new Batsman(23);
			Arr_List[2]= new Batsman(23);
			Arr_List[3]= new Batsman(23);
			Arr_List[4]= new Batsman(54);
			Arr_List[5]= new Batsman(44);
			Arr_List[6]= new Batsman(34);
			Arr_List[7]= new Batsman(90);
			Arr_List[8]= new Batsman(10);
			Arr_List[9]= new Batsman(20);*/

		//obj1.CalculateHighest(Arr_List[].Batsman);
			
		System.out.println("\n--------------------\n");
		Bowler obj2=new Bowler("Lasith Malinga","28/08/1983",5.6,"Sri Lanka",1780,90,1451);
		System.out.println("Name: "+obj2.name);
		System.out.println("Birth Date: "+obj2.birthdate);
		System.out.println("Height: "+obj2.height);
		System.out.println("Country"+obj2.country);
		System.out.println("Runs: "+obj2.runs);
		System.out.println("Wickets: "+obj2.wickets);
		System.out.println("Balls: "+obj2.balls);
		System.out.println("Bowlings Average: "+obj2.getBowlingsAverage());
		System.out.println("Bowling Economy Rate: "+obj2.getBowlingEconomyrate());
		System.out.println("Bowling Strikerate: "+obj2.getBowlingStrikerate());
		System.out.println("role: "+obj2.getRole());
		
	}
}
