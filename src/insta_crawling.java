import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class insta_crawling {

    public static void main(String[] args) {

        try
        {
            String url = "https://www.instagram.com/explore/tags/%ED%99%8D%EB%8C%80%ED%95%AB%ED%94%8C/?hl=ko";
            Document doc = Jsoup.connect(url).get(); // 문서 가져오기.

            String img1 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275623616_1116531799135726_9169152130124622986_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=110&_nc_ohc=LWgvYNxoutcAX9muQaQ&tn=nZuhcPgjqr4tEv-a&edm=ALQROFkBAAAA&ccb=7-4&ig_cache_key=Mjc5MjA4OTk0MTcwMzQzMDM3Mg%3D%3D.2-ccb7-4&oh=00_AT8W0IQzknNAIwD5XYRHLZ69P0kAG1TfkRi32UR1GjrV6w&oe=6232F814&_nc_sid=30a2ef";
            String img2 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275518448_695670461614736_3706352208556107491_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=108&_nc_ohc=T7su0dRV-ZcAX_hnUkK&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjA4OTQ0NzU4OTI5NjY3NQ%3D%3D.2-ccb7-4&oh=00_AT_vmEHXoqjMJNc5zQSgnyM8kZmlsJK0XGkdWRsGXCsOuQ&oe=62326362&_nc_sid=4efc9f";
            String img3 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275515289_127866999788066_6464758431883133110_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=102&_nc_ohc=3w-iBRLRqV4AX8Y-iv-&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTE4MzgxMTk1NzAwMDQ0OA%3D%3D.2-ccb7-4&oh=00_AT_FPEa4C2xI4VW2RIsecg-WcIreAwOuLomN0pX5H2kuIQ&oe=6232F208&_nc_sid=4efc9f";
            String img4 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275515289_127866999788066_6464758431883133110_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=102&_nc_ohc=3w-iBRLRqV4AX8Y-iv-&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTE4MzgxMTk1NzAwMDQ0OA%3D%3D.2-ccb7-4&oh=00_AT_FPEa4C2xI4VW2RIsecg-WcIreAwOuLomN0pX5H2kuIQ&oe=6232F208&_nc_sid=4efc9f";
            String img5 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275226200_527292192347149_2842015571693201285_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=101&_nc_ohc=ncxbAeS-J1sAX949oRT&tn=nZuhcPgjqr4tEv-a&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc4ODI5MjkxMzQzNDg4MTMwOQ%3D%3D.2-ccb7-4&oh=00_AT9eMTDm6Hm1ng3ePhkhE5wXt_sGjSJqywgFXq0ssErTVA&oe=6233C219&_nc_sid=4efc9f";
            String img6 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275612768_1601637100204637_1164132206439927686_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=105&_nc_ohc=z3dsxCPbLMYAX8oKaq5&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTg4MDQxODQ4NjI4MzQ0NA%3D%3D.2-ccb7-4&oh=00_AT8LT5khjso53ZUCiaevrAGhQ0SH8HuLniwNFQjsnIyJlw&oe=62341C3A&_nc_sid=4efc9f";
            String img7 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275599894_507620457693228_2872863216210058671_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=100&_nc_ohc=llHhFXt1r40AX93sPqN&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjAzOTY2NjYxOTkwNDc3MQ%3D%3D.2-ccb7-4&oh=00_AT-qYS-P9ECKQC1hcI-s9b95DbpKVvPY7zv2mZF469GqtA&oe=623350DB&_nc_sid=4efc9f";
            String img8 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275541226_4914518948631281_2856873257723146173_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=105&_nc_ohc=2UnrRgpIqVMAX89aNQW&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjAzNjc5NjY2ODEyOTI1Mw%3D%3D.2-ccb7-4&oh=00_AT-mMbTWqSYy415WJZmLwHw2doKep1VSHN7foOd54rI0hA&oe=62341611&_nc_sid=4efc9f";
            String img9 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275274400_999330507340628_1696192635965113904_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=108&_nc_ohc=lNKalh6cBQgAX86-g4d&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc4Njg2NjQzNTM1MDM1MDU0MQ%3D%3D.2-ccb7-4&oh=00_AT-4Pj4PO-P7D5p5e-mWTwsbQYh3CwkZV-bBq2sWSQt0NQ&oe=62343ADC&_nc_sid=4efc9f";

//            Elements e1 = doc.getElementsByAttributeValue("class","FFVAD"); // e1 에 class 값이 KL4Bh 인 부분 담기
//            Elements img1 = doc.select("FFVAD");
//            Elements e2 = doc.getElementsByClass("FFVAD");
//            Elements e3 = doc.getElementsByTag("FFVAD");
//
//            Elements e11 = doc.getElementsByAttributeValue("class","KL4Bh"); // e1 에 class 값이 KL4Bh 인 부분 담기
//            Elements img11 = doc.select(".KL4Bh");
//            Elements e22 = doc.getElementsByClass(".KL4Bh");
//            Elements e33 = doc.getElementsByTag(".KL4Bh");



        }
        catch (IOException e)
        {
            System.out.println("에러 발생"+ e.getMessage());
            e.printStackTrace();
        }

    }
}

// FFVAD KL4Bh