package ru.skypro;

public class Author {
    private String nameAuthor;
    private String lastNameAuthor;

    public Author(String nameAuthor, String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
        this.nameAuthor = nameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public String toString() {
        return nameAuthor + " " + lastNameAuthor;
    }


}
