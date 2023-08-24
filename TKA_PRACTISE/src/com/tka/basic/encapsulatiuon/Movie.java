package com.tka.basic.encapsulatiuon;

public class Movie {

	private int mid;
	private String mname;
	private String mdesc;
	
public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = this.mname;
	}
	public String getMdesc() {
		return mdesc;
	}
	public void setMdesc(String mdesc) {
		this.mdesc = this.mdesc;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mdesc=" + mdesc + "]";
	}
	public Movie(int mid, String mname, String mdesc) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mdesc = mdesc;
	}
	

	
}
