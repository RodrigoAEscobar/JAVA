package com.interfaces.samples;
/**
 * 
 * @author rescobar
 *
 */
public enum Major {
	CS("Computer Science"),
	CIS("Computer Information Systems"),
	MIS("Management Information Systems");
	// instance fields 
	private final String title; // book title

	private Major(String t) {
		this.title = t;
	}

	public String getTitle() {
		return title;
	}
}
