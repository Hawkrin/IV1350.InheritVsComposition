package task2;

import java.util.List;

public class CreateStringUsingComposition {
    private Builder builder = new Builder();
    
    public String listToString(List<String> newList) {
        return builder.listToString(newList);
    }

    public void appendNewRow(StringBuilder sb) {
        builder.appendNewRow(sb);
    }

    public void appendSpace(StringBuilder sb) {
        builder.appendSpace(sb);
    }

    public void appendLine(StringBuilder sb, String line) {
        builder.appendLine(sb, line);
    }

    public void printOutString(StringBuilder sb) {
        builder.printOutString(sb);
    }

    public int sizeOfString(StringBuilder sb) {
        return builder.sizeOfString(sb);
    }
    
}
