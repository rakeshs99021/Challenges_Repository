package com.technoelevate.challenges;

public class Challenge1 {

	public String getDurationString(String minutes,String seconds) {
		int min=Integer.parseInt(minutes);
		int sec=Integer.parseInt(seconds);
		int hh;
		int mm;
		int ss;
		if(min>=0&&(getDurationString(seconds)&&sec<=59)) {
			hh=min/60;
			mm=min%60;
			ss=sec;
			return ""+hh+"h:"+mm+"m:"+ss+"s";
		}
		else 	
			return "invalid value";
	}
	public boolean getDurationString(String seconds) {
		int sec = Integer.parseInt(seconds);
		if(sec>=0) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
