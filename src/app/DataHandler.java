package app;

public class DataHandler {

    // <T> — dumbfounded type for method
    // T[] items — input parameter (array of any object type)
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // Use a for-each loop to iterate over elements of type T
        for (T item : items) {
            count++;
            // Use %s to have Java automatically call toString() on an object
            sb.append(String.format("(%d) %s ", count, item));
        }

        return sb.toString().trim(); // Return molding row
    }
}