import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class naver_map_crawling {

    public static void main(String[] args) {

        String url = "https://pcmap.place.naver.com/restaurant/list?query=%ED%99%8D%EB%8C%80%20%EB%A7%9B%EC%A7%91&x=126.92195610000005&y=37.5529932999998&ts=1648532218300&mapUrl=https%3A%2F%2Fmap.naver.com%2Fv5%2Fsearch%2F%25ED%2599%258D%25EB%258C%2580%2520%25EB%25A7%259B%25EC%25A7%2591%3Fc%3D14128887.5235382%2C4516469.7966862%2C15%2C0%2C0%2C0%2Cdh";
        Document doc;

        try

        {
            doc = Jsoup.connect(url)
            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.82 Safari/537.36")
            .header("authority","pcmap.place.naver.com")
            .header("path","/restaurant/list?query=%ED%99%8D%EB%8C%80%20%EB%A7%9B%EC%A7%91&x=126.92195610000005&y=37.5529932999998&ts=1648532218300&mapUrl=https%3A%2F%2Fmap.naver.com%2Fv5%2Fsearch%2F%25ED%2599%258D%25EB%258C%2580%2520%25EB%25A7%259B%25EC%25A7%2591%3Fc%3D14128887.5235382%2C4516469.7966862%2C15%2C0%2C0%2C0%2Cdh")
            .header("scheme","https")
            .header("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
            .header("accept-encoding","gzip, deflate, br")
            .header("accept-language","ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
            .header("cache-control","max-age=0")
            .header("cookie","NNB=4DTCGS5527TWC; ASID=3d53c1210000017e9ae7e6a500000068; nx_ssl=2; wcs_bt=sp_968053dca84720:1648112377|sp_80320d48213ce0:1648112376|sp_9681f4e88ba448:1648110811|sp_9728bc11f403a0:1648107808|sp_97a777dd106de0:1648106653|sp_96e3b0f71622c0:1647405231|sp_96e7303cf0a908:1647405229|sp_96e1072883b780:1647405225|sp_cbcf4f941d8dc8:1647405221|sp_f15871ba55c60:1647405219; _ga=GA1.2.1539515391.1642662056; _ga_7VKFYR6RV1=GS1.1.1648461889.48.0.1648461889.60")
            .header("sec-ch-ua","\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"")
            .header("sec-ch-ua-mobile","?0")
            .header("sec-ch-ua-platform","Windows")
            .header("sec-fetch-dest","document")
            .header("sec-fetch-mode","navigate")
            .header("sec-fetch-site","none")
            .header("sec-fetch-user","?1")
            .header("upgrade-insecure-requests","1")
            .get();

//            Elements e1 = doc.select("div._1sfuL");

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

