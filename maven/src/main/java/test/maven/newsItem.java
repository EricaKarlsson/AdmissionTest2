package test.maven;

public class newsItem {
	public String title, link, description, pubDate, author;

	public newsItem(String title, String link, String description, String pubDate, String author) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.pubDate = pubDate;
		this.author = author;
	}

	public String toString() {
		return "----------------------------\n" + title + "\n" + description + "\n" + link + "\n" + pubDate;
	}

}
