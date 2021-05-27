package task2;

import java.util.List;

/**
 * A class that creates strings
 */
public class CreateStringUsingInheritance extends Builder {

    @Override
    public String listToString(List<String> newListExample) {
        return super.listToString(newListExample);
    }

    @Override
    public void appendNewRow(StringBuilder builder) {
        super.appendNewRow(builder);
    }

    @Override
    public void appendSpace(StringBuilder builder) {
        super.appendSpace(builder);
    }

    @Override
    public void appendLine(StringBuilder builder, String line) {
        super.appendLine(builder, line);
    }

    @Override
    public void printOutString(StringBuilder string) {
        super.printOutString(string);
    }

    @Override
    public int sizeOfString(StringBuilder string) {
        return super.sizeOfString(string);
    }   
}
