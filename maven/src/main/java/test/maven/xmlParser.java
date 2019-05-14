package test.maven;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;

public class xmlParser {
	SyndFeed feed;
	LinkedHashMap<String, newsItem> map;
	
	public xmlParser(SyndFeed feed) {
		this.feed = feed;
		map = new LinkedHashMap<String, newsItem>();
		//System.out.println(feed.getTitle());
		//System.out.println(feed.getTitle());
		recieveValues();	
	}
	
	public LinkedHashMap recieveValues() {
		List res = feed.getEntries();
        for(Object o : res) {
        	SyndEntryImpl object = ((SyndEntryImpl) o);
        	map.put(object.getTitle(), 
        	new newsItem(object.getTitle(),object.getLink(),object.getDescription().getValue(),object.getUri()));
        	//System.out.println(map.get(object.getTitle()).toString());
        }
        return map;
	}
	
	public void displayHeader() {
		for(Map.Entry<String, newsItem> key : map.entrySet()) {
			System.out.println(key.getKey());
		}
	}
	
	public void displaynewsItem() {
		for(Map.Entry<String, newsItem> key : map.entrySet()) {
			System.out.println(key.getValue().toString());
		}
	}

}
