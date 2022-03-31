import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;


//
//public class note {
//
//    public static void main(String[] args) {

//        driver.get("www.instagram.com/");


//        try
//        {
//            String url = "https://www.instagram.com/explore/tags/%ED%99%8D%EB%8C%80%ED%95%AB%ED%94%8C/?hl=ko"; // 크롤링 할 주소
//            Document doc = Jsoup.connect(url).get(); // 문서 가져오기.
//            Elements e1 = doc.getElementsByAttributeValue("class","FFVAD"); // e1 에 class 값이 KL4Bh 인 부분 담기
//            Elements img1 = doc.select("FFVAD");
//            Elements e2 = doc.getElementsByClass("FFVAD");
//            Elements e3 = doc.getElementsByTag("FFVAD");
//
//            Elements e11 = doc.getElementsByAttributeValue("class","KL4Bh"); // e1 에 class 값이 KL4Bh 인 부분 담기
//            Elements img11 = doc.select(".KL4Bh");
//            Elements e22 = doc.getElementsByClass(".KL4Bh");
//            Elements e33 = doc.getElementsByTag(".KL4Bh");
//
//            System.out.println(e11);
//            System.out.println(img11);
//            System.out.println(e22);
//            System.out.println(e33);
//
//            System.out.println(e1);
//            System.out.println(img1);
//            System.out.println(e2);
//            System.out.println(e3);
//
//            System.out.println(img1.attr("src"));
//            System.out.println(doc.html());
//
//
//        }
//        catch (IOException e)
//        {
//            System.out.println("에러 발생"+ e.getMessage());
//            e.printStackTrace();
//        }


//        try { //네이버 주식 크롤링 구문
//
//            String url = "https://finance.naver.com/item/main.nhn?code=086900";
//
//            Document doc = Jsoup.connect(url).get();
//
//            Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
//            Element e2 = e1.get(0);
//            Elements e3 = e2.select("span");
//
//            String result = e3.get(0).text();
//
//            System.out.println(result);
//
//        } catch (IOException e) {
//            System.out.println("에러가 생겼습니다" + e.getMessage());
//        }
//
//    }
//}



//
//    }
//}
