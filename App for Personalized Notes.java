import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakerApp {

    private static final String NOTES_FILE_PATH = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> notes = loadNotes();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. View Notes");
            System.out.println("2. Add Note");
            System.out.println("3. Delete Note");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewNotes(notes);
                    break;
                case 2:
                    addNote(scanner, notes);
                    break;
                case 3:
                    deleteNote(scanner, notes);
                    break;
                case 4:
                    saveNotes(notes);
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("NA. Please enter a number between 1 and 4.");
            }
        }
    }

    private static ArrayList<String> loadNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOTES_FILE_PATH))) {
            ArrayList<String> notes = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }
            return notes;
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private static void saveNotes(ArrayList<String> notes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOTES_FILE_PATH))) {
            for (String note : notes) {
                writer.write(note);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void viewNotes(ArrayList<String> notes) {
        if (notes.isEmpty()) {
            System.out.println("No notes. Add a note first.");
        } else {
            System.out.println("Your Notes:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i));
            }
        }
    }

    private static void addNote(Scanner scanner, ArrayList<String> notes) {
        System.out.print("Enter your note: ");
        String newNote = scanner.nextLine();
        notes.add(newNote);
        System.out.println("Note added");
    }

    private static void deleteNote(Scanner scanner, ArrayList<String> notes) {
        if (notes.isEmpty()) {
            System.out.println("No notes to delete.");
            return;
        }

        System.out.print("Enter the note number to delete: ");
        int noteNumber = scanner.nextInt();
        scanner.nextLine(); 

        if (noteNumber >= 1 && noteNumber <= notes.size()) {
            notes.remove(noteNumber - 1);
            System.out.println("Note deleted");
        } else {
            System.out.println("Invalid note number.");
        }
    }
}


