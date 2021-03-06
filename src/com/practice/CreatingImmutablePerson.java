package com.practice;

public class CreatingImmutablePerson {
	private final int pId;
	private final String pname;
	public CreatingImmutablePerson(int pId, String pname) {
		super();
		this.pId = pId;
		this.pname = pname;
	}
	public int getpId() {
		return pId;
	}
	public String getPname() {
		return pname;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
