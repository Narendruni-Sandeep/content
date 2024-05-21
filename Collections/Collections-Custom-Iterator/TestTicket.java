class TestTicket{
	public static void main(String[] args){

		//create Ticket Obj
		Ticket tt=new Ticket(12728,"SAC","30/07/2022","VSKP","BZA");
	
		//create PassengerList object
	    PassengerList plist=new PassengerList();

		Passenger p1=new Passenger("Samba",'M',(byte)40);
		Passenger p2=new Passenger("Madhavi",'F',(byte)36);
		Passenger p3=new Passenger("KoteswarRao",'M',(byte)70);
		Passenger p4=new Passenger("Santha kumari",'F',(byte)60);
		Passenger p5=new Passenger("Hiran",'M',(byte)7);
		Passenger p6=new Passenger("Sonu",'F',(byte)3);

		//adding passengers to plst
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);

		//finally add passengers obj to ticket
		tt.setPassengers(plist);
				
		tt.displayTicketDetails();
	}
}