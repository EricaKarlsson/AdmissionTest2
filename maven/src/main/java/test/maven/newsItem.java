package test.maven;

public class newsItem {
	String title, link, description, guid;
	public newsItem(String title, String link, String description, String guid) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.guid = guid;
	}
	
	public void setTitle(String title) {
		
	}
public void setLink(String link) {
		
	}
public void setDescription(String description) {
	
}
public void setGuid(String guid) {
	
}
public void setpubDate(String pubDate) {
	
}
public String toString() {
	return title + "\n" + description + "\n" + link + "\n" + guid;
}

}
