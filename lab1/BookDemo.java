package lab1;

public class BookDemo {
    public static void main(String[] args) {
        Book a = new Book("Developing Java Software", "Russel Winder", 79.75);
        System.out.println("Title : "+a.getTitle()+" | "+"Author : "+a.getAuthor()+" | "+"Price : "+a.getPrice());
    }
}
