package Lab2b;

import java.util.Arrays;

/*	Comp3111LEx\Lab2b\Book.java		*/
public class Book {
    private final String[] chapters;
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        Arrays.fill(chapters, "n/a");
    }
    public Book(String[] argument) {
        /* construct the object with an array of chapter names */
        /* PLEASE ADD YOUR CODE HERE */
        chapters = new String[argument.length];
        System.arraycopy(argument, 0, chapters, 0, argument.length);
    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        /* PLEASE ADD YOUR CODE HERE */
        return chapters[i-1];
    }
    public String[] getChapters() {
        return chapters;
    }
}