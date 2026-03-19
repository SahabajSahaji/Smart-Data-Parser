import java.util.*;

public class Utils {

    public static void printPretty(Map<String, String> map) {
        System.out.println("\n🔹 Parsed Data:");
        map.forEach((k, v) -> System.out.println("✔ " + k + " → " + v));
    }

    public static String toJSON(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        int i = 0;
        for (String key : map.keySet()) {
            sb.append("  \"").append(key).append("\": \"")
                    .append(map.get(key)).append("\"");

            if (i < map.size() - 1) sb.append(",");
            sb.append("\n");
            i++;
        }

        sb.append("}");
        return sb.toString();
    }
}