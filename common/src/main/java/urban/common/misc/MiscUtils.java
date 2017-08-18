package urban.common.misc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by Diego on 01/07/2017.
 */
public class MiscUtils {

    /**
     * A function to tell us if a full deck of cards shuffledDeck is a single riffle of two other halves half1 and half2.
     * <p>
     * We walk through shuffledDeck, seeing if each card so far could have come from a riffle of the other two halves.
     * <p>
     * Complexity: O(n) time and O(1) additional space.
     *
     * @param half1
     * @param half2
     * @param shuffledDeck
     * @return true if is single riffle of two other halves
     */
    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
        int half1Index = 0;
        int half2Index = 0;
        int half1MaxIndex = half1.length - 1;
        int half2MaxIndex = half2.length - 1;

        for (int card : shuffledDeck) {

            // if we still have cards in half1
            // and the "top" card in half1 is the same
            // as the top card in shuffledDeck
            if (half1Index <= half1MaxIndex
                    && card == half1[half1Index]) {
                half1Index++;

                // if we still have cards in half2
                // and the "top" card in half2 is the same
                // as the top card in shuffledDeck
            } else if (half2Index <= half2MaxIndex
                    && card == half2[half2Index]) {
                half2Index++;

                // if the top card in shuffledDeck doesn't match the top
                // card in half1 or half2, this isn't a single riffle.
            } else {
                return false;
            }
        }

        // all cards in shuffledDeck have been "accounted for"
        // so this is a single riffle!
        return true;
    }

    /**
     * Write a function that returns a list of all the duplicate files. We'll check them by hand before actually deleting them, since programmatically deleting files is really scary. To help us confirm that two files are actually duplicates, return a list of tuples where:
     * - the first item is the duplicate file;
     * - the second item is the original file;
     * <p>
     * Complexity: Each "fingerprint" takes O(1) time and space, so our total time and space costs are O(n) where nn is the number of files on the file system;
     *
     * @param startingDirectory the starting directory
     * @return the list of file paths
     */
    public static List<FilePaths> findDuplicateFiles(Path startingDirectory) {
        Map<String, FileInfo> filesSeenAlready = new HashMap<>();
        Stack<Path> stack = new Stack<>();
        stack.push(startingDirectory);

        List<FilePaths> duplicates = new ArrayList<>();

        while (!stack.empty()) {

            Path currentPath = stack.pop();
            File currentFile = new File(currentPath.toString());

            // if it's a directory,
            // put the contents in our stack
            if (currentFile.isDirectory()) {
                for (File file : currentFile.listFiles()) {
                    stack.add(file.toPath());
                }

                // if it's a file
            } else {

                // get its hash
                String fileHash;
                try {
                    fileHash = FileHasher.sampleHashFile(currentPath);
                } catch (IOException e) {

                    // show error and skip this file
                    e.printStackTrace();
                    continue;
                } catch (NoSuchAlgorithmException e) {

                    // show error and skip this file
                    e.printStackTrace();
                    continue;
                }

                // get its last edited time
                long currentLastEditedTime = currentFile.lastModified();

                // if we've seen it before
                if (filesSeenAlready.containsKey(fileHash)) {

                    FileInfo fileInfo = filesSeenAlready.get(fileHash);
                    long existingLastEditedTime = fileInfo.getTimeLastEdited();
                    Path existingPath = fileInfo.getPath();

                    if (currentLastEditedTime > existingLastEditedTime) {

                        // current file is the dupe!
                        duplicates.add(new FilePaths(currentPath, existingPath));

                    } else {

                        // old file is the dupe!
                        duplicates.add(new FilePaths(existingPath, currentPath));

                        // but also update filesSeenAlready to have the new file's info
                        filesSeenAlready.put(fileHash, new FileInfo(currentLastEditedTime, currentPath));
                    }

                    // if it's a new file, throw it in filesSeenAlready
                    // and record its path and last edited time,
                    // so we can tell later if it's a dupe
                } else {
                    filesSeenAlready.put(fileHash, new FileInfo(currentLastEditedTime, currentPath));
                }
            }
        }
        return duplicates;
    }
}
