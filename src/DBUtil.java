import java.sql.*;

public class DBUtil {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/maritime_library";
        String user = "sa";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            //建表
            String createTable = "CREATE TABLE IF NOT EXISTS seats (" +
                    "seat_id INT PRIMARY KEY, " +
                    "seat_row INT, " +
                    "seat_col INT, " +
                    "status INT DEFAULT 0)";
            stmt.execute(createTable);
            System.out.println("建表成功");

            //清空旧数据
            stmt.execute("DELETE FROM seats");

            //插入48个座位
            int count = 0;
            for (int row = 1; row <= 8; row++) {
                for (int col = 1; col <= 6; col++) {
                    int seatId = (row - 1) * 6 + col;
                    String insert = "INSERT INTO seats VALUES (" + seatId + ", " + row + ", " + col + ", 0)";
                    stmt.execute(insert);
                    count++;
                }
            }
            System.out.println("插入了 " + count + " 个座位");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}