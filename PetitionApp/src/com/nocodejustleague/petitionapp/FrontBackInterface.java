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
	
	
	/**
	 * "Refreshes" the app page by retrieving petitions that should be shown on the
	 * front page. Kind of like pressing "Home" on Facebook.
	 * @param user - the user data/identifier the server will use.
	 */
	public void retrieveRelevantPetitions(User user);
}
