package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		
		assertNotNull("Tweet List Not Initialize", tweets);
	}

	
	public void testCounts(){
		TweetList tweetlist = new  TweetList();
		
		tweetlist.addTweet(new NormalTweetModel("Hello"));
		tweetlist.addTweet(new NormalTweetModel("Helljjos"));
	
		assertEquals("This should be zero",tweetlist.getCount(), 2);
	
	}
	
	public void testgetTweets(){
		TweetList tweetlist = new  TweetList();
		
		ArrayList<LonelyTweetModel> returnedList = new ArrayList<LonelyTweetModel>();
		
		tweetlist.addTweet(new NormalTweetModel("Hello", new Date(123)));
		tweetlist.addTweet(new NormalTweetModel("Hellos",new Date(111)));
		tweetlist.addTweet(new NormalTweetModel("Hi",new Date(143)));
		tweetlist.addTweet(new NormalTweetModel("Hey",new Date(123)));
	
		returnedList = tweetlist.getTweets();
		
		for (int i =1; i < tweetlist.getCount(); i++)
		{
			if (returnedList.get(i-1).getTimestamp().after(returnedList.get(i).getTimestamp()))
			{
				fail("Not in order");
			}
		}
		
		
	}
	
	public void testAddNewTweet(){
		TweetList tweetlist = new  TweetList();
		
	
		
		try {
			tweetlist.addTweet(new NormalTweetModel("Hello", new Date(123)));
			tweetlist.addTweet(new NormalTweetModel("Hellso", new Date(123)));
			
		}
		catch(IllegalArgumentException e){
			fail("An illegal Argument exception was thrown when adding replicate tweet");
		}
	}
}
