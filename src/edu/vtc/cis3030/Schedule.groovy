package edu.vtc.cis3030

class Schedule {

	//findNextOpening()
	//get
	
	Map<Calendar, Event> _events
	
	Schedule(){}
	
	//Finds next opening in the schedule based on event.runTime, returns a Calendar with that time.
	Calendar getNextOpening(int length){
		boolean result = true
		while(result){
			
			
			
		}
	}
	
	
	//Adds event to the schedule. Should check to see if it's available based on event.runTime
	void addEvent(Calendar c, Event e){
		_events.put(c, e)
	}
	
	//Prints the entire schedule in an ordered fashion. Sort _events before doing this. Should be other
	//print methods that take parameters (ex. prints all events for certain day, etc)
	void print(){
		
	}
	
}
