import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateJavaFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Problem Name: ");
        String problemName = sc.nextLine();

        // Change this path if needed
        File currentFolder = new File(
                "C:\\Users\\SURYA\\Music\\EXPERIMENTS\\DSA\\src"
        );

        Pattern pattern =
                Pattern.compile("DSA(\\d{3})_.*\\.java");

        int highestNumber = 0;

        File[] files = currentFolder.listFiles();

        if (files != null) {

            for (File file : files) {

                Matcher matcher =
                        pattern.matcher(file.getName());

                if (matcher.matches()) {

                    int number =
                            Integer.parseInt(matcher.group(1));

                    highestNumber =
                            Math.max(highestNumber, number);
                }
            }
        }

        int nextNumber = highestNumber + 1;

        String formattedNumber =
                String.format("%03d", nextNumber);

        String formattedName =
                problemName.trim()
                        .toUpperCase()
                        .replaceAll("[^A-Z0-9 ]", "")
                        .replaceAll("\\s+", "_");

        String className =
                "DSA" + formattedNumber + "_" + formattedName;

        String fileName =
                className + ".java";

        File newFile =
                new File(currentFolder, fileName);

        try {

            if (newFile.createNewFile()) {

                FileWriter writer =
                        new FileWriter(newFile);

                writer.write(
                        "import java.util.*;\n\n" +
                                "public class " + className + " {\n\n" +
                                "    public static void main(String[] args) {\n\n" +
                                "        Scanner sc = new Scanner(System.in);\n\n" +
                                "        \n\n" +
                                "        sc.close();\n" +
                                "    }\n" +
                                "}\n"
                );

                writer.close();

                System.out.println();
                System.out.println("Created Successfully:");
                System.out.println(fileName);

            } else {

                System.out.println("File already exists.");
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        sc.close();
    }
}
