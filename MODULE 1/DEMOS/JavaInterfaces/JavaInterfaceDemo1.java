interface Database {

  // These methods are abstract AND public by default
  void openConnection();
  void close();

}

class OracleImpl implements Database {

  @Override
  public void openConnection() {
    System.out.println("Open Connection...");
  }

  @Override
  public void close() {
    System.out.println("Close Connection...");
  }

}


public class JavaInterfaceDemo1 {

  public static void main(String[] args) {
    OracleImpl ora1 = new OracleImpl();

    ora1.openConnection();
    ora1.close();
  }
}
