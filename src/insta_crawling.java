import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class insta_crawling {

    public static void main(String[] args) {

        try
        {
            String url = "https://pcmap.place.naver.com/restaurant/list?query=%ED%99%8D%EB%8C%80%20%EB%A7%9B%EC%A7%91&x=126.9224496&y=37.552534&bounds=126.9118495%3B37.5495569%3B126.9416328%3B37.5553409&isCurrentLocationSearch=true&x=126.92367060000038&y=37.55278259999995&ts=1648377913188&mapUrl=https%3A%2F%2Fmap.naver.com%2Fv5%2Fsearch%2F%25ED%2599%258D%25EB%258C%2580%2520%25EB%25A7%259B%25EC%25A7%2591%3Fc%3D14128942.4597069%2C4516405.3043395%2C15%2C0%2C0%2C0%2Cdh";
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