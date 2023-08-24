package com.tka.basic.inheritance;

public class Sports {
String playername;
String coachname;
String jerseyno;
@Override

public String toString() {
	return "Sports [playername=" + playername + ", coachname=" + coachname + ", jerseyno=" + jerseyno + "]";

}
public Sports(String playername, String coachname, String jerseyno) {
	super();
	this.playername = playername;
	this.coachname = coachname;
	this.jerseyno = jerseyno;
}



public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getCoachname() {
	return coachname;
}
public void setCoachname(String coachname) {
	this.coachname = coachname;
}
public String getJerseyno() {
	return jerseyno;
}
public void setJerseyno(String jerseyno) {
	this.jerseyno = jerseyno;
}


void Teamplayer() {
	
}


}

