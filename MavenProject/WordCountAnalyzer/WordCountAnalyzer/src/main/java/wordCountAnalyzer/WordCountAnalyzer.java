package wordCountAnalyzer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCountAnalyzer {
    public static void main(String[] args) {
        try {
            String content = FileUtils.readFileToString(new File("reading-file.txt"), StandardCharsets.UTF_8);
            content = content.replaceAll("[^A-Za-z ]", ""); // Keep only letters and spaces

            String[] words = StringUtils.split(content, ' '); // Split by spaces
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

            int uniqueWordCount = uniqueWords.size();
            System.out.println("Number of unique words: " + uniqueWordCount);

            // Write the result to another file
            FileUtils.writeStringToFile(new File("result.txt"), "Number of unique words: " + uniqueWordCount, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
