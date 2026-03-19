import java.util.*;

public class Parser {

    public static Map<String, String> parse(String data) {

        Map<String, String> map = new LinkedHashMap<>();

        Scanner sc = new Scanner(data);
        sc.useDelimiter("[,;|]");

        while (sc.hasNext()) {
            String pair = sc.next();

            String[] kv = pair.split("[:=]");

            if (kv.length == 2) {
                map.put(kv[0].trim(), kv[1].trim());
            } else {
                System.out.println("⚠ Invalid pair skipped: " + pair);
            }
        }

        sc.close();
        return map;
    }
}