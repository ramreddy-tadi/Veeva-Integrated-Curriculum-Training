
import java.io.File;
import java.util.Scanner;

public class FileVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String path = sc.nextLine();

        File file = new File(path);

        if (file.exists()) {

            System.out.println("\nFile exists!");

            if (file.isDirectory()) {
                System.out.println("Type: Directory");
            } else if (file.isFile()) {
                System.out.println("Type: Data File");
            }

            if (file.canRead() && file.canWrite()) {
                System.out.println("Permission: Readable and Writable");
            } else if (file.canRead()) {
                System.out.println("Permission: Read-only");
            } else if (file.canWrite()) {
                System.out.println("Permission: Writable only");
            } else {
                System.out.println("Permission: Neither readable nor writable");
            }

            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());

        } else {
            System.out.println("File does not exist!");
        }

        sc.close();
    }
}
