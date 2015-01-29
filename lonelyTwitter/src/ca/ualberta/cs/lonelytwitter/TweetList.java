package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
	
	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	
	public TweetList(){
		tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	
	public ArrayList<LonelyTweetModel> getTweets() {
		// TODO Auto-generated method stub
		return tweetList;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return tweetList.size();
	}

	public void addTweet(LonelyTweetModel tweetModel) {


		
		if (tweetList.size() == 0){
			tweetList.add(tweetModel);
		}
		
		else
		{
			for (int index =0; index < tweetList.size(); index++)
			{
				
				if (tweetModel.equals(tweetList.get(index)))
				{
					throw new IllegalArgumentException("Attempted to Add an existing Tweet");
				}
		}
			
		tweetList.add(tweetModel);
			
			

			

			
			
		}
		
		
	

					
		
	
		
	}

}
