package com.nocodejustleague.petitionapp;

public interface BackEndFunctions {
	/** Notifies important figures of the petition.
	 * @param petition - the petition to expose */
	public void sendEmail(Petition petition);
}
