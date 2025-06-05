/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed08_CGV.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ed09_CF {

	static final String MEGA = "https://www.mega-mgccoffee.com/menu/?menu_category1=1&menu_category2=1";
	static final int BEVERAGES = 5;

	// crawler() return void,param1 : URL,param2 : movies
	/**
	 * CGV 무비차트 크롤링
	 * 
	 * @param cqvUrl
	 * @param moviesCount
	 */
	static void crawler(String cqvUrl, int moviesCount) {
		// System.out.println("cqvUrl:"+cqvUrl);
		// System.out.println("moviesCount:"+moviesCount);

		try {
			Document doc = Jsoup.connect(cqvUrl).get();
			// System.out.println(doc);

			// 영화 제목, 예매율
			Elements titles = doc.select("div.cont_text_inner text_wrap cont_text_title div.text text1");
			Elements scores = doc.select("div.score strong.percent span");

			// 포스터 URL
			Elements posters = doc.select("div.box-image span.thumb-image img");

			for (int i = 0; i < moviesCount; i++) {
				Element titlesElement = titles.get(i);
				//Element scoresElement = scores.get(i);
				// <img src ='포스터 URL'
				//String posterURL = posters.get(i).attr("src");
				// toString() : html
				// System.out.printf("제목: %20s%n",titlesElement.toString());

				// text() - 텍스트만 뽑아냄.
				//System.out.printf("%2d. 제목: %-35s 예매율:%5s , 포스터: %s%n", (i + 1), titlesElement.text(),
				//		scoresElement.text(), posterURL);
				System.out.printf("%2d. 메뉴명: %-35s /%n", (i + 1), titlesElement.text());
			}

			System.out.println();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		crawler(MEGA, BEVERAGES);

	}

}
