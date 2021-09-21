import java.sql.*;

class CallableStatementDemo1 {

  public static void main(String[] args) {
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:889/test", "root", "root");
      CallableStatement cs = con.prepareCall("{CALL addNumbers(?, ?, ?)}");
    ) {

      cs.setInt(1, 100); // Specify position of argument
      cs.setInt(2, 100);
      cs.registerOutParameter(3, Types.INTEGER);  // Param 3 is special parameter

      cs.execute();

      System.out.println("Sum is " + cs.getInt(3));
    } catch (SQLException e) {
      System.out.println(e);
    }
  }
}
