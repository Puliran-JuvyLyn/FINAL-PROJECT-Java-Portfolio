public class MyBookList {
    public static void main(String[] args) {
        Book book1 = new Book ("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book ("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book ("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book ("Java Programming", "John Doe", 2020);
        Book book5 = new Book ("I love You Since 1892", "Binibining Mia", 2018);
        
        book1.details();
        book2.details();
        book3.details();
        book4.details();
        book5.details();
        
        book1.changePage(50);
        book3.changePage(100);
        
        System.out.println();
        
        book1.details();
        book3.details();
        
        System.out.println();
        
        book5.changePage(127);
        book5.details();
        
        System.out.println();
        
        book4.changeAuthor("Jane Smith");
        book4.details();
        
        System.out.println();
        
        Book[] books = {book1, book2, book3, book4, book5};
        System.out.println("Books published after 2010: ");
            for (Book b: books){
                if (b.getYear() > 2010){
                    System.out.println("- " + b.getTitle());
                }
            }
            
    }
}
