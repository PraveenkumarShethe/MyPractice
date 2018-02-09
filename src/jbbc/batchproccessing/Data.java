package jbbc.batchproccessing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {

    public static void main(String[] args) {

        Connection con = null;
        try {
            Statement stmt = null;

            // load the Driver Class
            Class.forName("org.postgresql.Driver");

            // create the connection now
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserDB",
                    "user",
                    "userpassword");
            stmt = con.createStatement();

            long start = System.currentTimeMillis();
            for(int i =0; i<100000;i++){
                String query = "insert into Emoloyee values ("+i+",'Name"+i+"')";
                stmt.execute(query);
            }
            System.out.println("Time Taken="+(System.currentTimeMillis()-start));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

