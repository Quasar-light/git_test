import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {
	public static void main(String[] args) {
		//inside jsoup "" website url
		//used user agent so website thinks the request is coming from a web browser
		try {
			Document doc = Jsoup.connect("http://www.imdb.com/list/ls055386972/").userAgent("Mozilla/17.0").get();
			
			//here we are fetching all elements under div info, since class name we use . between div.info
			//if we want to fetch an element under id we should us # in between div#info
			Elements temp = doc.select("div.info");
			int i = 0;
			//movieList holds all our div elements
			for(Element movieList:temp){
				
				i++;
				//from the movieList I fetch all the tag elements with the tag name a
				//.text is added to get the text from inside the "a" tag
				System.out.println(i+ " "+ movieList.getElementsByTag("a").first().text());
			}
		
		
		} 
		
		
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
