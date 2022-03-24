import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

// cb7hz QmdzL


public class database {

    static String result;

    public static void crawling_data() {  // 크롤링 데이터 값

        try {

            String url = "https://finance.naver.com/item/main.nhn?code=086900";

            Document doc = Jsoup.connect(url).get();

            Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
            Element e2 = e1.get(0);
            Elements e3 = e2.select("span");

            result = e3.get(0).text();

            System.out.println(result);

        } catch (IOException e) {
            System.err.println(" 에러가 났습니다 . ");
        }
    }

    public static void main(String[] args) {

        Connection con;
        PreparedStatement pstmt;

        String img1 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275623616_1116531799135726_9169152130124622986_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=110&_nc_ohc=LWgvYNxoutcAX9muQaQ&tn=nZuhcPgjqr4tEv-a&edm=ALQROFkBAAAA&ccb=7-4&ig_cache_key=Mjc5MjA4OTk0MTcwMzQzMDM3Mg%3D%3D.2-ccb7-4&oh=00_AT8W0IQzknNAIwD5XYRHLZ69P0kAG1TfkRi32UR1GjrV6w&oe=6232F814&_nc_sid=30a2ef";
        String img2 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275518448_695670461614736_3706352208556107491_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=108&_nc_ohc=T7su0dRV-ZcAX_hnUkK&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjA4OTQ0NzU4OTI5NjY3NQ%3D%3D.2-ccb7-4&oh=00_AT_vmEHXoqjMJNc5zQSgnyM8kZmlsJK0XGkdWRsGXCsOuQ&oe=62326362&_nc_sid=4efc9f";
        String img3 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275515289_127866999788066_6464758431883133110_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=102&_nc_ohc=3w-iBRLRqV4AX8Y-iv-&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTE4MzgxMTk1NzAwMDQ0OA%3D%3D.2-ccb7-4&oh=00_AT_FPEa4C2xI4VW2RIsecg-WcIreAwOuLomN0pX5H2kuIQ&oe=6232F208&_nc_sid=4efc9f";
        String img4 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275515289_127866999788066_6464758431883133110_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=102&_nc_ohc=3w-iBRLRqV4AX8Y-iv-&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTE4MzgxMTk1NzAwMDQ0OA%3D%3D.2-ccb7-4&oh=00_AT_FPEa4C2xI4VW2RIsecg-WcIreAwOuLomN0pX5H2kuIQ&oe=6232F208&_nc_sid=4efc9f";
        String img5 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275226200_527292192347149_2842015571693201285_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=101&_nc_ohc=ncxbAeS-J1sAX949oRT&tn=nZuhcPgjqr4tEv-a&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc4ODI5MjkxMzQzNDg4MTMwOQ%3D%3D.2-ccb7-4&oh=00_AT9eMTDm6Hm1ng3ePhkhE5wXt_sGjSJqywgFXq0ssErTVA&oe=6233C219&_nc_sid=4efc9f";
        String img6 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275612768_1601637100204637_1164132206439927686_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=105&_nc_ohc=z3dsxCPbLMYAX8oKaq5&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MTg4MDQxODQ4NjI4MzQ0NA%3D%3D.2-ccb7-4&oh=00_AT8LT5khjso53ZUCiaevrAGhQ0SH8HuLniwNFQjsnIyJlw&oe=62341C3A&_nc_sid=4efc9f";
        String img7 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275599894_507620457693228_2872863216210058671_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=100&_nc_ohc=llHhFXt1r40AX93sPqN&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjAzOTY2NjYxOTkwNDc3MQ%3D%3D.2-ccb7-4&oh=00_AT-qYS-P9ECKQC1hcI-s9b95DbpKVvPY7zv2mZF469GqtA&oe=623350DB&_nc_sid=4efc9f";
        String img8 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275541226_4914518948631281_2856873257723146173_n.jpg?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=105&_nc_ohc=2UnrRgpIqVMAX89aNQW&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc5MjAzNjc5NjY2ODEyOTI1Mw%3D%3D.2-ccb7-4&oh=00_AT-mMbTWqSYy415WJZmLwHw2doKep1VSHN7foOd54rI0hA&oe=62341611&_nc_sid=4efc9f";
        String img9 = "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-15/275274400_999330507340628_1696192635965113904_n.webp?stp=dst-webp_e35&cb=9ad74b5e-95d2b877&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=108&_nc_ohc=lNKalh6cBQgAX86-g4d&edm=ABZsPhsBAAAA&ccb=7-4&ig_cache_key=Mjc4Njg2NjQzNTM1MDM1MDU0MQ%3D%3D.2-ccb7-4&oh=00_AT-4Pj4PO-P7D5p5e-mWTwsbQYh3CwkZV-bBq2sWSQt0NQ&oe=62343ADC&_nc_sid=4efc9f";

        try {

            String sql = "INSERT INTO crawling(count,placeType,created,timeType,img_source)values(?,?,now(),?,?)";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");

            System.out.println(" ");
            System.out.println("연결 됐습니다.");
            System.out.println(" ");

            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1,0);
            pstmt.setString(2,"텐동집 (음식점)");
            pstmt.setString(3,"실시간");
            pstmt.setString(4,img9);

            pstmt.executeUpdate();

            System.out.println("확인");

            pstmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.err.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("에러 발생 . " + e.getMessage());
            e.printStackTrace();
        }
    }
}



//    public database() {
//
//        try {
//            // 드라이버 로딩.
//            Class.forName("com.mysql.cj.jdbc.Driver"); // 객체화 하는 과정 , 메모리상에 잡히게 된다.
//            // 연결하기.
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");
//            System.out.println(" ");
//            System.out.println("연결 됐습니다.");
//            System.out.println(" ");
//        }
//
//        catch (ClassNotFoundException e) {
//            System.err.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
//            e.printStackTrace(); // 에러가 어디서 났는지 알려주고 전체적인 결과를 노출해준다.
//        } catch (SQLException e) {
//            System.out.println("에러: " + e);
//        }
//
//    }



//
//    public boolean isAdmin(String adminID, String adminPassword) {  // 검색 예제
//
//        try
//        {
//            String SQL = "SELECT * FROM ADMIN";
//            rs = pstmt.executeQuery(SQL);
//            if(rs.next())
//            {
//                return true;
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("데이터베이스 검색 오류 : " + e.getMessage());
//        }
//        return false;
//    }



// https://www.youtube.com/watch?v=HgjUd3vFm0M&list=PLq8wAnVUcTFWxwoc41CqmwnO-ZyRDL0og&index=3 참고자료



/* 1. Class.forName("com.mysql.cj.jdbc.Driver") ; // 객체화 하는 과정 , 메모리상에 잡히게 된다.
   2. Connection con = DriverManager.getConnection(...) ; // 연결 객체
   3. Statement st = con.createStatement(); // 실행 도구 객체
   4. ResultSet rs = st.executeQuery(sql); // 결과 집합을 패치해 올 수 있는 도구 객체 , 클라이언트에게 전달하는 그릇이 리절트셋
   5. rs.next();
   6. String title = rs.getString("title");
*/

//        Connection con = null;
//        Statement st = null;
//        ResultSet rs = null;
//            try {
//                // 드라이버 로딩.
//                Class.forName("com.mysql.jdbc.Driver");
//                // 연결하기.
//                con = DriverManager.getConnection();
//                System.out.println(" 연결 됐습니다. ");
//            } catch (ClassNotFoundException e) {
//                System.err.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
//                e.printStackTrace(); // 에러가 어디서 났는지 알려주고 전체적인 결과를 노출해준다.
//            } catch (SQLException e) {
//                System.out.println("에러: " + e);
//            }
//        }
//    }


// https://victorydntmd.tistory.com/145 참고자료


//        String server = "localhost"; // MySQL 서버 주소
//        String database = ""; // MySQL DATABASE 이름
//        String user_name = "root"; //  MySQL 서버 아이디
//        String password = "QhrtnswoTkddl1!6"; // MySQL 서버 비밀번호
//
//        // 1.드라이버 로딩
//        try {
//            Class.forName("com.mysql.jdbc.Driver"); // Class란 클래스에 속한 메소드를 인자로 받은 문자열에 해당하는 클래스의 객체를 생성해 메모리 공간에 로딩하는 기능을 가지고있다
//        } catch (ClassNotFoundException e) {        // (위에 내용 이어서) forName()메소드는 static 메소드이기 때문에 따로 객체화를 시켜주지 않아도 사용이 가능하다.
//            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//        // 2.연결
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
//            System.out.println("정상적으로 연결되었습니다.");
//        } catch(SQLException e) {
//            System.err.println("con 오류:" + e.getMessage());
//            e.printStackTrace();
//        }
//
//        // 3.해제
//        try {
//            if(con != null)
//                con.close();
//        } catch (SQLException e) {}
//    }
