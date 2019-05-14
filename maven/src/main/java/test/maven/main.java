package test.maven;

public class main {

	public static void main(String[] args) {
		Fetcher fetcher = new Fetcher();
		//Synd = fetcher.fetch("https://www.dn.se/rss/");
		xmlParser parser = new xmlParser(fetcher.fetch("https://www.dn.se/rss/"));
		parser.recieveValues();
		//parser.displayHeader();
		parser.displaynewsItem();
		//newsItem item = new newsItem();
		//item.setTitle(title);
	}

}
