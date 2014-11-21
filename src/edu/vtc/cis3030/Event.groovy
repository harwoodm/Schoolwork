package edu.vtc.cis3030

class Event {

	//Description
	//Date
	//Running time
	//
	String _description;
	Calendar _date;
	int _runTime;
	
	Event (String des, Calendar date, int runTime){
		_description = des
		_date = date
		_runTime = runTime
	}
	
	String getDescription(){ _description }
	Date getDate(){ _date }
	int getRunTime(){ _runTime; }
}
