package com.nocodejustleague.petitionapp;

public interface FrontBackInterface {
	/** User signs the petition.
	 * @param petition - the petition.
	 * @param like - whether the review is positive or negative. */
	public void voteSignPetition(Petition petition);
	
	
	/**
	 * User votes against the petition.
	 * @param petition - the petition.
	 * @param comment - an explanation of why the user voted so.
	 */
	public void voteDisagree(Petition petition, String comment);
}
