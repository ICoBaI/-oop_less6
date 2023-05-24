package Notes;

import java.util.Date;


public class Note {
    private int ID;
    private String title;
    private String content;
    private Date date;

    public Note(int ID, String title, String content, Date date) {
        this.ID = ID;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitele() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;  
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;  
    }
}