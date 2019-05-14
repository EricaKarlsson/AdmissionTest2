package test.maven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class viewWebPage {
	HashMap<String, newsItem> map;
	
	public viewWebPage(HashMap map) {
		this.map = map;	
	}
	
	public void html() {
		String html = "";
		for(Map.Entry<String, newsItem> key : map.entrySet()) {
			html += item(key.getValue());
		}
		  File f = new File("webpage.html");
		  try {
			  BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			  bw.write(html);
			  bw.close();
			  java.awt.Desktop.getDesktop().open(f);
		  }catch (IOException e){
			  System.out.println(e);
		  }
		
	}
	
	public String item(newsItem item) {
		String html = "<div><h1> "+item.title+" </h1><p> "+item.description+"<br> "+item.pubDate+"<br>"+item.author+"<br><a href=\""+item.link+"\">"+item.link+"</a> </p> </div>";
		return html;
	}
	
}
