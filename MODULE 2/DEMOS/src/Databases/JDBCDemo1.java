import java.sql.*;

public class JDBCDemo1 {

  public static void main(String[] args) {
    try {

      // Steps involved in PDBC Application?

      // Step 1: Load the driver and register with DriverManager
      Class.forName("com.mysql.cj.jdbc.Driver");


      // Step 2: Establish the connection
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/test", "root", "root");


      // Step 3: Create a Statement object using connection object
      Statement st = con.createStatement();


      // Step 4: Execute SQL statement
      String query = "CREATE TABLE department(dept_id INT, d_name VARCHAR(20), location VARCHAR(20))";

      st.execute(query); // This will execute SQL query on a selected database


      // Step 5: Close/Release all connections and statements
        st.close();
        con.close();


      System.out.println("Connected.");
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println(e);
    }
  }

}
