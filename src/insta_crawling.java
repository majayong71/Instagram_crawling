import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class insta_crawling {

    public static void main(String[] args) {

        try
        {
            String url = "https://map.naver.com/v5/search/음식점?c=14128580.2817436,4516314.3305073,15,0,0,0,dh";
            Document doc = Jsoup.connect(url).get(); // 문서 가져오기.

            Elements e1 = doc.select("div._1sfuL");

            System.out.println(doc);

//            String url = "https://www.naver.com/";   // 실험 예제
//            Document doc = Jsoup.connect(url).get();
//
//            Elements e1 = doc.select("span.thumb_bd");
//
//            System.out.println(e1);

        }
        catch (IOException e)
        {
            System.out.println("에러 발생"+ e.getMessage());
            e.printStackTrace();
        }

    }
}

// FFVAD KL4Bh