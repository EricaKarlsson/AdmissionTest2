package test.maven;

public class main {

	public static void main(String[] args) {
		Fetcher fetcher = new Fetcher();
		xmlParser parser = new xmlParser(fetcher.fetch("https://www.dn.se/rss/"));
		parser.displayHeader();
		//parser.displaynewsItem();
		viewWebPage page = new viewWebPage(parser.recieveValues());
		page.html();
	}

}
