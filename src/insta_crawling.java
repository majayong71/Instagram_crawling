import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class insta_crawling {

    public static void main(String[] args) {

        try {

            String url = "https://finance.naver.com/item/main.nhn?code=086900";

            Document doc = Jsoup.connect(url).get();

            Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
            Element e2 = e1.get(0);
            Elements e3 = e2.select("span");

            String result = e3.get(0).text();

            System.out.println(result);

            }

        catch (IOException e)
        {
            System.out.println("에러가 생겼습니다"+e.getMessage());
        }


        try
        {
            String url = "https://www.instagram.com/explore/tags/%ED%99%8D%EB%8C%80%ED%95%AB%ED%94%8C/?hl=ko";

            Document doc = Jsoup.connect(url).get();

            Elements e1 = doc.getElementsByAttributeValue("class", "g47SY");
            Element e2 = e1.get(0);

            System.out.println("o");

            System.out.println(e2);
        }

        catch (IOException e)
        {
            System.out.println("에러 발생"+ e.getMessage());
        }

    }
}





// FFVAD KL4Bh