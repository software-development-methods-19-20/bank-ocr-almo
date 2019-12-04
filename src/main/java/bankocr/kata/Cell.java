package bankocr.kata;

import java.util.HashMap;
import java.util.Map;

public class Cell {

    private static Map<String, String> NumbToInt = new HashMap<>();
    static {
        NumbToInt.put(" _ " + "| |" + "|_|", "0");
        NumbToInt.put("   " + "  |" + "  |", "1");
        NumbToInt.put(" _ " + " _|" + "|_ ", "2");
        NumbToInt.put(" _ " + " _|" + " _|", "3");
        NumbToInt.put("   " + "|_|" + "  |", "4");
        NumbToInt.put(" _ " + "|_ " + " _|", "5");
        NumbToInt.put(" _ " + "|_ " + "|_|", "6");
        NumbToInt.put(" _ " + "  |" + "  |", "7");
        NumbToInt.put(" _ " + "|_|" + "|_|", "8");
        NumbToInt.put(" _ " + "|_|" + " _|", "9");
    }

    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        for(String key : NumbToInt.keySet()){
            if(cellAsText.equals(key)){
                return NumbToInt.get(key);
            }
        }
        return null;
    }
}
