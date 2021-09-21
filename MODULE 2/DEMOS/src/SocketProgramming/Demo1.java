import java.net.*;
import java.io.*;

class Server {

  public static void main(String[] args) {

    // Create a Server Socket Object

    ServerSocket ss = new ServerSocket(777);

    System.out.println("Server Started");

    ss.accept(); // Blocking call. Waits for clients request

    OutputStream os = ss.getOutputStream();

    PrintStream ps = new PrintStream(os);

    ps.println("Hey Client, I am ready to serve your requests");

    ps.close();
  }
}
