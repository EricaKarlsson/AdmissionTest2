package test.maven;

public class main {

	public static void main(String[] args) {
		Fetcher fetcher = new Fetcher();
		String xml = fetcher.fetch("https://www.dn.se/rss/");
		newsItem item = new newsItem();
	}

}
