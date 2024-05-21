import java.util.*;
//Passenger class to encapsulate passenger info
class Passenger{
	private String name;
	private char gender;
	private byte age;
	public Passenger(String n,char g,byte a){
		name=n;
		age=a;
		gender=g;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
	public byte getAge(){
		return age;
	}
	public void setAge(byte a){
		age=a;
	}
	public char getGender(){
		return gender;
	}
	public void setGender(char g){
		gender=g;
	}
}

public class PassengerList implements Iterable<Passenger>{
	List<Passenger> passengers;
	public PassengerList(){
		passengers=new ArrayList<Passenger>();
	}
	public Iterator<Passenger> iterator(){
		return passengers.iterator();
	}
	public void add(Passenger p){
		passengers.add(p);
	}
}
	
class Ticket{

	//data members
	private int trainNo;
	private String travelClass;
	private String travelDate;	//string for time being
	private String source;
	private String destination;
	//private Passenger passengers[];
	//private ArrayList<Passenger> passengers;
	PassengerList passengers;

	public Ticket(int t,String tc,String td,String src,String dst){
		//initialize members
		trainNo=t;
		travelClass=tc;
		travelDate=td;
		source=src;
		destination=dst;
	}
	
	//setters and getters
	public int getTrainNo(){
		return trainNo;
	}
	public void setTrainNo(int tn){
		trainNo=tn;
	}
	
	public String getTravelClass(){
		return travelClass;
	}
	public void setTravelClass(String tr){
		travelClass=tr;
	}

	public String getTravelDate(){
		return travelDate;
	}
	public void setTravelDate(String td){
		travelDate=td;
	}

	public String getSource(){
		return source;
	}

	public String getDestination(){
		return destination;
	}
	public void setPassengers(PassengerList p){
		passengers=p;
	}
	public PassengerList getPassengers(){
		return passengers;
	}


	//method to display ticket details
	public void displayTicketDetails(){
		System.out.println("====Ticket Details====");
		System.out.println("Train No     :" + trainNo);
		System.out.printf("Travel Class : %s \n",travelClass);
		System.out.printf("Travel Date  : %s \n",travelDate);
		System.out.printf("Source		 : %s \n",source);
		System.out.printf("Destination	 : %s \n",destination);

		System.out.println("-----Passenger Details-----");

		//read the passengers using for each loop
		for(Passenger p: passengers){
			System.out.printf(" Name : %s  - Age : %d - Gender : %c  \n",p.getName(),p.getAge(),p.getGender());
		}
	


		System.out.println("-----End of Passenger Details-----");
		System.out.println("Ticket Fare : " + calculateTicketFare(750));
	}

	//method to calculate ticket fare
	public double calculateTicketFare(double basefare){
		double tfare=0.0,pfare=0.0;

		//iterate through passengers using for each loop
		for(Passenger p:passengers){

			//apply discount to calculate the passenger fare
			if (p.getAge() >=1 && p.getAge() <=5){
				pfare=basefare*0;
			}else if (p.getAge() >=6 && p.getAge() <=12){
				pfare=basefare*0.5;

			}else{
				if (p.getGender()=='M' && p.getAge() >=65){
					pfare=basefare*0.75;
				}else if (p.getGender()=='F' && p.getAge() >=58){
					pfare=basefare*0.75;
				}else{
					pfare=basefare;
				}
			}

			//add to the total fare of ticket
			tfare=tfare + pfare;
		}

		//retun the final fare
		return tfare;
	}
}
