import java.io.*;

public class MyFileReader {

    public static void main(String[] args) {
//        writeMyFile();
        int value = 1;
        try {
            readMyFile();
        } catch (BadLineException e) {
            System.out.println("On iteration" + value + ":" + e);
        }
    }


    public MyFileReader() {

    }

    public void readAndPrint() {
        BufferedReader sourceFileBuffer = null;
        try {
            FileReader sourceFileReader = new FileReader("./myFileObject");
            // Bypasses read() method in FileReader and uses readLine() method in BufferedReader
            sourceFileBuffer = new BufferedReader(sourceFileReader);

            String line;

            while ((line = sourceFileBuffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        } catch (IOException ioException) {
            System.out.println(ioException);
        } finally {
            if (sourceFileBuffer != null) {
                try {
                    sourceFileBuffer.close();
                } catch (IOException ioException) {
                    System.out.println(ioException);
                }
            }
        }
    }

    public static void writeMyFile() {
        BufferedWriter sourceFileBufferWriter = null;
        try {
            FileWriter sourceFileWriter = new FileWriter("./Output.txt");
            sourceFileBufferWriter = new BufferedWriter(sourceFileWriter);

            for (int i = 0; i <= 100; i++) {
                sourceFileBufferWriter.append(String.format("This is line %s \n", i));
            }
        }
        catch (IOException ioException) {
            System.out.println(ioException);
        }
        finally {
            try {
                if (sourceFileBufferWriter != null) {
                    sourceFileBufferWriter.close();
                }
            } catch (IOException ioException) {
                System.out.println(ioException);
            }
        }
    }

    public static void readMyFile() throws BadLineException {
        BufferedReader sourceFileBuffer = null;

        try {
            FileReader sourceFileReader = new FileReader("./Output.txt");
            // Bypasses read() method in FileReader and uses readLine() method in BufferedReader
            sourceFileBuffer = new BufferedReader(sourceFileReader);

            String line;
            int lineNumber = 0;
            while ((line = sourceFileBuffer.readLine()) != null) {

                if (line.indexOf("This is line") != 0) {
                    throw new BadLineException(String.format("Error on line %s. Line does not begin \"This is line\"...", lineNumber));
                }

                System.out.println(line);
                lineNumber++;
            }
        } catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        } catch (IOException ioException) {
            System.out.println(ioException);
        } finally {
            if (sourceFileBuffer != null) {
                try {
                    sourceFileBuffer.close();
                } catch (IOException ioException) {
                    System.out.println(ioException);
                }
            }
        }
    }
}
