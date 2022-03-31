import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.crypto.Data;
import java.io.IOException;

public class Database {

    static String img1,img2,img3,img4,img5,img6,img7,img8
            ,img9,img10,img11,img12,img13,img14,img15,img16,
            img17 = null;

    static Connection con;
    static PreparedStatement pstmt;

    public Database() {  // 데이터베이스 생성 , 인스턴스화

        try {
            // 드라이버 로딩.
            Class.forName("com.mysql.cj.jdbc.Driver"); // 객체화 하는 과정 , 메모리상에 잡히게 된다.
            // 연결하기.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");
            System.out.println("  ");
            System.out.println("연결 됐습니다.");
            System.out.println("  ");
        } catch (ClassNotFoundException e) {
            System.err.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
            e.printStackTrace(); // 에러가 어디서 났는지 알려주고 전체적인 결과를 노출해준다.
        } catch (SQLException e) {
            System.out.println("에러: " + e);
        }
    }

    public static void main(String[] args) {

        System.out.println();

        String url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%99%8D%EB%8C%80+%EB%A7%9B%EC%A7%91&oquery=%ED%99%8D%EB%8C%80+%EB%A7%9B%EC%A7%91&tqi=hC6%2F%2Fsp0J14ssnoOIKVssssss%2B4-003887";
        Document doc;

        try {

            doc = Jsoup.connect(url).get();

            Elements e1 = doc.getElementsByAttributeValue("class", "cb7hz QmdzL");

            for (int i = 6; i < 24; i++) {

                String e2 = e1.get(i)
                        .attr("style")
                        .replace("width:100%;height:99px;background-image:url(\"", "")
                        .replace("\")", "");

                if (i == 7) {
                    img1 = e2;
                    System.out.println(img1 + " img1 ");
                } else if (i == 8) {
                    img2 = e2;
                    System.out.println(img2 + " img2 ");
                } else if (i == 9) {
                    img3 = e2;
                    System.out.println(img3 + " img3 ");
                } else if (i == 10) {
                    img4 = e2;
                    System.out.println(img4 + " img4 ");
                } else if (i == 11) {
                    img5 = e2;
                    System.out.println(img5 + " img5 ");
                } else if (i == 12) {
                    img6 = e2;
                    System.out.println(img6 + " img6 ");
                } else if (i == 13) {
                    img7 = e2;
                    System.out.println(img7 + " img7 ");
                } else if (i == 14) {
                    img8 = e2;
                    System.out.println(img8 + " img8 ");
                } else if (i == 15) {
                    img9 = e2;
                    System.out.println(img9 + " img9 ");
                } else if (i == 16) {
                    img10 = e2;
                    System.out.println(img10 + " img10 ");
                } else if (i == 17) {
                    img11 = e2;
                    System.out.println(img11 + " img11 ");
                } else if (i == 18) {
                    img12 = e2;
                    System.out.println(img12 + " img12 ");
                } else if (i == 19) {
                    img13 = e2;
                    System.out.println(img13 + " img13 ");
                } else if (i == 20) {
                    img14 = e2;
                    System.out.println(img14 + " img14 ");
                } else if (i == 21) {
                    img15 = e2;
                    System.out.println(img15 + " img15 ");
                } else if (i == 22) {
                    img16 = e2;
                    System.out.println(img16 + " img16 ");
                } else if (i == 23) {
                    img17 = e2;
                    System.out.println(img17 + " img17 ");
                }
            }
        } catch (IOException e) {
            System.out.println("에러 발생" + e.getMessage());
            e.printStackTrace();
        }

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
            pstmt.setString(4,img1);

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


//        Connection con;
//        PreparedStatement pstmt;

//        try {
//
//            String sql = "INSERT INTO crawling(count,placeType,created,timeType,img_source)values(?,?,now(),?,?)";
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");
//
//            System.out.println(" ");
//            System.out.println("연결 됐습니다.");
//            System.out.println(" ");
//
//            pstmt = con.prepareStatement(sql);
//
//            pstmt.setInt(1,0);
//            pstmt.setString(2,"텐동집 (음식점)");
//            pstmt.setString(3,"실시간");
//            pstmt.setString(4,img9);
//
//            pstmt.executeUpdate();
//
//            System.out.println("확인");
//
//            pstmt.close();
//            con.close();
//
//        } catch (ClassNotFoundException e) {
//            System.err.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
//        } catch (SQLException e) {
//            System.err.println("에러 발생 . " + e.getMessage());
//            e.printStackTrace();
//        }
//

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

    }
}



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
