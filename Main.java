import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            Menu.show();
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.println("Enter data:");
                String data = input.nextLine();

                process(data);

            } else if (choice == 2) {
                System.out.println("Enter file path:");
                String path = input.nextLine();

                String data = FileHandler.readFile(path);
                process(data);

            } else {
                System.out.println("👋 Exiting...");
                break;
            }
        }

        input.close();
    }

    private static void process(String data) {

        Map<String, String> map = Parser.parse(data);

        Utils.printPretty(map);

        String json = Utils.toJSON(map);

        System.out.println("\n📦 JSON Output:\n" + json);

        FileHandler.writeJSON("output.json", json);
    }
}
