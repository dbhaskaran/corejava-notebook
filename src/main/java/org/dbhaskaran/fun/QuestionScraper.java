package org.dbhaskaran.fun;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class QuestionScraper {

	public static void main(String[] args) {
		Document doc;
		try {

			// need http protocol
			// https://www.geeksforgeeks.org/category/data-structures/c-strings/page/2/
			doc = Jsoup.connect("").get();

			// get page title
			String title = doc.title();
			System.out.println("title : " + title);

			// get all links
			Elements links = doc.select("a[href]");
			for (Element link : links) {

				// get the value from href attribute
				System.out.println("\nlink : " + link.attr("href"));
				System.out.println("text : " + link.text());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
