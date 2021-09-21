import java.io.*;
import java.util.*;

public class BookReader {

    private HashMap<String, Integer> wordMap;
    private BufferedReader bfr;

    public static void main(String[] args) throws FileNotFoundException {
        BookReader br = new BookReader(
                new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("src/books")
                        )
                ),
                new HashMap<>()
        );

        try {
            br.readFile();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    private BookReader(BufferedReader bfr, HashMap<String, Integer> wordMap) {

       this.bfr = bfr;
       this.wordMap = wordMap;

    }

    public void readFile() throws IOException {

        String line;
        while ((line = this.bfr.readLine()) != null) {

            line.replace(". ", " "); // mid-line line periods
            line.replace(".\n", "\n"); // End of line periods
            line.replace("http://", ""); // web addresses
            line.replace(".", " "); // web addresses

            String[] wordsOnLine = line.split(" ");
            for (String word : wordsOnLine) {

                if (!this.wordMap.containsKey(word)) {
                    this.wordMap.put(word, 0);
                }

                Integer val = this.wordMap.get(word);
                this.wordMap.replace(word, val+1);

            }
        }
        TreeMap<Integer, String> swappedValuesMap = new TreeMap<>(Collections.reverseOrder());

        Iterator<Map.Entry<String, Integer>> iterator = this.wordMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> wordInfo = iterator.next();
            swappedValuesMap.put(wordInfo.getValue(), wordInfo.getKey());
        }

        int i = 0;
        Iterator<Map.Entry<Integer, String>> swappedIterator = swappedValuesMap.entrySet().iterator();
        while(i < 3) {
            Map.Entry<Integer, String> wordInfo = swappedIterator.next();
            System.out.printf("%s : %s\n", wordInfo.getValue(), wordInfo.getKey());
            i++;
        }

    }

}
