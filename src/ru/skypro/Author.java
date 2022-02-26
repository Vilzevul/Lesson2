package ru.skypro;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(this.nameAuthor, author.nameAuthor) && Objects.equals(this.lastNameAuthor, author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, lastNameAuthor);
    }

}

