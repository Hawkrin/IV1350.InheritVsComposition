package task2;

import java.util.List;

/**
 * Represents a string
 */
public class Builder {
    
    /**
     * Creates a string of a list
     * 
     * @param listExample the list to turn to a string
     * @return the created string
     */
    public String listToString(List<String> listExample) {
        StringBuilder builder = new StringBuilder();
        for(String element : listExample) {
            builder.append(element).append(" ");
        }
        return builder.toString();
    }

    /**
     * Appends a new row to a StringBuilder
     * 
     * @param builder the stringBuilder being built
     */
    public void appendNewRow(StringBuilder builder){
        builder.append("\n");
    }

    /**
     * Appends a blank space to a StringBuilder
     * 
     * @param builder the stringBuilder being built
     */
    public void appendSpace(StringBuilder builder){
        builder.append(" ");
    }

    /**
     * Appends a new line to a StringBuilder
     * 
     * @param builder the stringBuilder being built
     * @param line the content of the new line
     */
    public void appendLine(StringBuilder builder, String line){
        builder.append(line);
    }

    /**
     * Prints out a StringBuilder to the console
     * 
     * @param string the StringBuilder beign printed.
     */
    public void printOutString(StringBuilder string) {
        string.toString();
        System.out.println(string);
    }

    /**
     * Counts the number of characters in the String
     * 
     * @param string the stringbuilder beign counted
     * @return the number counted.
     */
    public int sizeOfString(StringBuilder string) {
        return string.length();
    }
    
}
