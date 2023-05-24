package Notes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        notesManager notesManager = new notesManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню: ");
            System.out.println("1) Добавить запись");
            System.out.println("2) Редактировать запись");
            System.out.println("3) Удалить запись");
            System.out.println("4) Прочитать запись");
            System.out.println("5) Вывести все записи");
            System.out.println("6) Выход");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    notesManager.addNote();
                    break;
                case 2:
                    System.out.println("Введите ID записи");
                    int editID = scanner.nextInt();
                    notesManager.editNoteByID(editID);
                    break;
                case 3:
                    System.out.println("Введите ID записи");
                    int deleteID = scanner.nextInt();
                    notesManager.deleteNoteByID(deleteID);
                    break;
                case 4:
                    System.out.println("Введите ID записи");
                    int readID = scanner.nextInt();
                    notesManager.findeNoteByID(readID);
                    break;
                case 5:
                    notesManager.printAllNotes();
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("Неверный выбор");

            }

        }
    }

}
