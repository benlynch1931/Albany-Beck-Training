import java.io.*;

public class MyConsoleReader {

    public static void main(String[] args) {
        readAndPrint();
    }

    public static void readAndPrint() {

        StringBuffer stringBufferObject = new StringBuffer();

        InputStreamReader inputStreamReaderObject = new InputStreamReader(System.in);
        BufferedReader bufferedReaderObject = new BufferedReader(inputStreamReaderObject);

        String inputLine;
        try {
            while (true) {
                inputLine = bufferedReaderObject.readLine();
                if (inputLine.equalsIgnoreCase("STOP")) {
                    break;
                }
                stringBufferObject.append(inputLine);
            }
        }
        catch(IOException e) {

        }
        finally {
            try {
                bufferedReaderObject.close();
            }
            catch (IOException e) {

            }
        }
    }
}