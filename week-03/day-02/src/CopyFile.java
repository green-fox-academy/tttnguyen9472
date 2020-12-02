import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        copyContent();
    }

    private static void copyContent() throws IOException {
        List<String> content = Files.readAllLines(filePath);
       Files.write(newFile, content);
        isFileCopied();

    }

    private static boolean isFileCopied() {

        return true;
    }
}
