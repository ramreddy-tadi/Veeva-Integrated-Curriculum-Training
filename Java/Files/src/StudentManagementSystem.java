import java.io.*;
import java.util.*;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static String fileName = "student.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(fileName);

        if (file.createNewFile()) {
            System.out.println("Student file created successfully!");
        }

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Records");
            System.out.println("2. Read All Records");
            System.out.println("3. Read Record by Roll No");
            System.out.println("4. Read Record by Name");
            System.out.println("5. Delete Record by Roll No");
            System.out.println("6. Update Record");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addRecord();
                    break;

                case 2:
                    readAllRecords();
                    break;

                case 3:
                    readByRollNo();
                    break;

                case 4:
                    readByName();
                    break;

                case 5:
                    deleteRecord();
                    break;

                case 6:
                    updateRecord();
                    break;

                case 7:
                    System.out.println("Application closed!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }

    static void addRecord() throws IOException {

        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();


        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length == 9 && data[0].equals(rollNo)) {
                System.out.println("Roll number already exists!");
                br.close();
                return;
            }
        }

        br.close();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        String age = sc.nextLine();

        System.out.print("Enter M1: ");
        String m1 = sc.nextLine();

        System.out.print("Enter M2: ");
        String m2 = sc.nextLine();

        System.out.print("Enter M3: ");
        String m3 = sc.nextLine();

        System.out.print("Enter M4: ");
        String m4 = sc.nextLine();

        System.out.print("Enter M5: ");
        String m5 = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        FileWriter fw = new FileWriter(fileName, true);

        fw.write(rollNo + "|" + name + "|" + age + "|"
                + m1 + "|" + m2 + "|" + m3 + "|"
                + m4 + "|" + m5 + "|" + grade + "\n");

        fw.close();

        System.out.println("Record added successfully!");
    }


    static void readAllRecords() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length != 9) {
                continue;
            }

            found = true;

            System.out.println("\n-----------------------------");
            System.out.println("Roll No: " + data[0]);
            System.out.println("Name: " + data[1]);
            System.out.println("Age: " + data[2]);
            System.out.println("M1: " + data[3]);
            System.out.println("M2: " + data[4]);
            System.out.println("M3: " + data[5]);
            System.out.println("M4: " + data[6]);
            System.out.println("M5: " + data[7]);
            System.out.println("Grade: " + data[8]);
            System.out.println("-----------------------------");
        }

        br.close();

        if (!found) {
            System.out.println("No records found!");
        }
    }


    static void readByRollNo() throws IOException {

        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length == 9 && data[0].equals(rollNo)) {

                System.out.println("\nStudent Found!");
                System.out.println("Roll No: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("M1: " + data[3]);
                System.out.println("M2: " + data[4]);
                System.out.println("M3: " + data[5]);
                System.out.println("M4: " + data[6]);
                System.out.println("M5: " + data[7]);
                System.out.println("Grade: " + data[8]);

                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Student not found!");
        }
    }


    static void readByName() throws IOException {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length == 9 &&
                    data[1].equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found!");
                System.out.println("Roll No: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("M1: " + data[3]);
                System.out.println("M2: " + data[4]);
                System.out.println("M3: " + data[5]);
                System.out.println("M4: " + data[6]);
                System.out.println("M5: " + data[7]);
                System.out.println("Grade: " + data[8]);

                found = true;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    static void deleteRecord() throws IOException {

        System.out.print("Enter Roll No to Delete: ");
        String rollNo = sc.nextLine();

        ArrayList<String> records = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length == 9 && data[0].equals(rollNo)) {

                found = true;

            } else {

                records.add(line);
            }
        }

        br.close();

        if (found) {

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            for (String record : records) {
                bw.write(record);
                bw.newLine();
            }

            bw.close();

            System.out.println("Record deleted successfully!");

        } else {

            System.out.println("Student not found!");
        }
    }

    1
    static void updateRecord() throws IOException {

        System.out.print("Enter Roll No to Update: ");
        String rollNo = sc.nextLine();

        ArrayList<String> records = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\|", -1);

            if (data.length == 9 && data[0].equals(rollNo)) {

                found = true;

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Age: ");
                String age = sc.nextLine();

                System.out.print("Enter New M1: ");
                String m1 = sc.nextLine();

                System.out.print("Enter New M2: ");
                String m2 = sc.nextLine();

                System.out.print("Enter New M3: ");
                String m3 = sc.nextLine();

                System.out.print("Enter New M4: ");
                String m4 = sc.nextLine();

                System.out.print("Enter New M5: ");
                String m5 = sc.nextLine();

                System.out.print("Enter New Grade: ");
                String grade = sc.nextLine();

                String updatedRecord = rollNo + "|" + name + "|" + age
                        + "|" + m1 + "|" + m2 + "|" + m3
                        + "|" + m4 + "|" + m5 + "|" + grade;

                records.add(updatedRecord);

            } else {

                records.add(line);
            }
        }

        br.close();

        if (found) {

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            for (String record : records) {
                bw.write(record);
                bw.newLine();
            }

            bw.close();

            System.out.println("Record updated successfully!");

        } else {

            System.out.println("Student not found!");
        }
    }
}