package test.maven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;

/**
 * Hello world!
 *
 */
public class Fetcher 
{
	public Fetcher() {
		
	}
	
	
	public String fetch(String url) {
	    HttpURLConnection c = null;
	    try {
	        URL u = new URL("https://www.dn.se/rss/");
	        c = (HttpURLConnection) u.openConnection();
	        c.setRequestMethod("GET");
	        c.setRequestProperty("accept-language", "en");
	        c.setConnectTimeout(100);
	        c.connect();
	        int status = c.getResponseCode();
	        switch (status) {
	            case 200:
	            case 201:
	                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream(), "UTF8"));
	                StringBuilder sb = new StringBuilder();
	                String line;
	                while ((line = br.readLine()) != null) {
	                    sb.append(line+"\n");
	                }
	                br.close();
	                System.out.println(sb.toString());
	                return sb.toString();
	        }

	    } catch (MalformedURLException ex) {
	    } catch (IOException ex) {
	    } finally {
	       if (c != null) {
	          try {
	              c.disconnect();
	          } catch (Exception ex) {
	          }
	       }
	    }
	    return null;
	}
}
