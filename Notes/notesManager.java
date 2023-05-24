package Notes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class notesManager {

    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote() {
        int ID = 1;
        if (!notes.isEmpty()) {
            Note lastNote = notes.get(notes.size() - 1);
            ID = lastNote.getID() + 1;
        }
        System.out.println("Введите название: ");
        String title = new Scanner(System.in).nextLine();
        System.out.println("Введите текст записки: ");
        String content = new Scanner(System.in).nextLine();
        Date date = new Date();
        Note note = new Note(ID, title, content, date);
        notes.add(note);
        System.out.println("Добавленно");
    }

    public void deleteNoteByID(int ID) {
        if (ID != 0) {
            notes.remove(ID - 1);
            System.out.println("Запись удалена");
        } else {
            System.out.println("Запись не найдена");
        }

    }

    public void printAllNotes() {
        if (notes.isEmpty()) {
            System.out.println("Записок нет");
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            for (Note note : notes) {
                System.out.println("-----------------------------------------------");
                System.out.println("ID: " + note.getID());
                System.out.println("Заголовок: " + note.getTitele());
                System.out.println("Текст: " + note.getContent());
                System.out.println("Дата создания: " + dateFormat.format(note.getDate()));
                System.out.println("-----------------------------------------------");
            }
        }

    }

    void editNoteByID(int ID) {
        if (ID != 0) {
            System.out.println("Введите новое название: ");
            String title = new Scanner(System.in).nextLine();
            System.out.println("Введите новый текст записки: ");
            String content = new Scanner(System.in).nextLine();
            Date date = new Date();
            Note note = new Note(ID, title, content, date);
            note.setTitle(title);
            note.setContent(content);
            note.setDate(date);
            notes.set(ID - 1, note);
            System.out.println("Отредактировано");
        }else{
            System.out.println("Не найдено");
        }
    }

    Note findeNoteByID(int ID) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        for (Note note : notes) {
            if (note.getID() == ID) {
                System.out.println("-----------------------------------------------");
                System.out.println("ID: " + note.getID());
                System.out.println("Заголовок: " + note.getTitele());
                System.out.println("Текст: " + note.getContent());
                System.out.println("Дата создания: " + dateFormat.format(note.getDate()));
                System.out.println("-----------------------------------------------");
            }
        }
        return null;
    }

}
