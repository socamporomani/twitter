/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author socamporomani
 */
public class NewClass {
      public Twitter twitter = TwitterFactory.getSingleton();

 public void enviarTuit()throws TwitterException {
    
    String latestStatus="hola mundo";
    Status status = twitter.updateStatus(latestStatus);
    System.out.println("Successfully updated the status to [" + status.getText() + "].");
}
 public void timeline() throws TwitterException{
            // The factory instance is re-useable and thread safe.
    List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText());
    }
 }
  public void buscar() throws TwitterException{
    // The factory instance is re-useable and thread safe.
    Query query = new Query("source:twitter4j yusukey");
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
    }
    
  }
}
