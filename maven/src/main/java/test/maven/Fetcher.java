package test.maven;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

import org.xml.sax.InputSource;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;

/**
 * Hello world!
 *
 */
public class Fetcher {
	public Fetcher() {

	}

	public SyndFeed fetch(String url) {
		SyndFeed feed = null;
		InputStream is = null;

		try {

			URLConnection openConnection = new URL(url).openConnection();
			is = new URL(url).openConnection().getInputStream();
			if ("gzip".equals(openConnection.getContentEncoding())) {
				is = new GZIPInputStream(is);
			}
			InputSource source = new InputSource(is);
			SyndFeedInput input = new SyndFeedInput();
			feed = input.build(source);

		} catch (Exception e) {
			// LOG.error("Exception occured when building the feed object out of the url",
			// e);
		} finally {
			if (is != null)
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//System.out.println(feed);
		return feed;
	}
}
