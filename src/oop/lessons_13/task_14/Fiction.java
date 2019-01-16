package oop.lessons_13.task_14;

import java.time.LocalDate;

public class Fiction {
    private int codId;
    private String name;
    private String author;
    private LocalDate localDate;
    static int count;

    public Fiction(int codId, String name, String author, LocalDate localDate) {
        this.codId = codId;
        this.name = name;
        this.author = author;
        this.localDate = localDate;
        count++;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "codId=" + codId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", localDate=" + localDate +
                '}';
    }

    public String searchByAuthor(String author){
        String str = "Нет такой книги";
        if (this.author.equalsIgnoreCase(author)){
            str = toString();
        }
        return str;

    }
}
