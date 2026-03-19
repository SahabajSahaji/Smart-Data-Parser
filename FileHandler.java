import java.io.*;
import java.util.*;

public class FileHandler {

    public static String readFile(String path) {
        StringBuilder data = new StringBuilder();
        try (Scanner sc = new Scanner(new File(path))) {
            while (sc.hasNextLine()) {
                data.append(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("❌ Error reading file");
        }
        return data.toString();
    }

    public static void writeJSON(String path, String json) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(json);
            System.out.println("✅ JSON saved to " + path);
        } catch (Exception e) {
            System.out.println("❌ Error writing file");
        }
    }
}
