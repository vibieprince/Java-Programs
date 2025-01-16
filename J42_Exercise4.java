package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("available books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for (String b : this.books) {
            for (int i=0; i<this.books.length;i++){
                if (this.books[i].equals(book)){
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
            System.out.println("This book doesn't exist!");
        }
    }
    void returnbook(String book){
        this.books[no_of_books] = book;
        addbook(book);
    }
}
public class J42_Exercise4 {
    public static void main(String[] args) {
//        You have to implement a library using java class library
//        methods : addbook,issuebook, borrowbook,returnbook
//        proprties : array to store the available books
//        array of store th issued books
        Library central_library = new Library();
        central_library.addbook("Think and grow rich");
        central_library.addbook("Algorithms");
        central_library.addbook("C++");
        central_library.showAvailableBooks();
        central_library.issueBook("C++");
        central_library.showAvailableBooks();
        central_library.returnbook("C++");
        central_library.showAvailableBooks();
    }
}
