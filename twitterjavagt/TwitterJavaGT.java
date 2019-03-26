/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author socamporomani
 */
public class TwitterJavaGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        NewClass envio = new NewClass();
        envio.enviarTuit();
     
    }
}
