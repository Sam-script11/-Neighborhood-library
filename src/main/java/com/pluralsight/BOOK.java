package com.pluralsight;
public class BOOK {

    private int id;
    private String isbn;
    private String title;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public BOOK(int id, String title, String isbn, String checkedOutTo, boolean isCheckedOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "BOOK{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }

    public void checkOut(String name){
        if(!isCheckedOut){
            //this.isCheckedOut;
            checkedOutTo = name;
            System.out.println(name +" checked out to "+ title);
        }
        System.out.println(title+ "checked out to " + checkedOutTo);

    }
    public void checkIn(){
        if(isCheckedOut){
            System.out.println(checkedOutTo + "checked in "+ title);
            isCheckedOut = false;
        }else{
            System.out.println(title + " is not checked out");
        }

    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}