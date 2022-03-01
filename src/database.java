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

        database database = new database();

        database.crawling_data();



        Connection con;
        PreparedStatement pstmt;

        try {

            try {

                String url = "https://finance.naver.com/item/main.nhn?code=086900";

                Document doc = Jsoup.connect(url).get();

                Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
                Element e2 = e1.get(0);
                Elements e3 = e2.select("span");

                result = e3.get(0).text();

                System.out.println(result);

            }

            catch (IOException e)
            {
                System.err.println(" 에러가 났습니다 . ");
            }

            String sql = "INSERT INTO crawling(placeType,timeType,created,count,IMG_SOURCE)values(?,?,?,?,?)";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");

            System.out.println(" ");
            System.out.println("연결 됐습니다.");
            System.out.println(" ");

            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, "1");
            pstmt.setString(2, "test");
            pstmt.setString(3, "2022-02-28");
            pstmt.setInt(4, 0);
            pstmt.setString(5,result);


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
