class Book {
    private String title;
    private String author;
    private int year;
    private int changePage;
    
    public Book (String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.changePage = 0;
    }
    
    public void details() {
        System.out.println("Title: " + title + ", Author " + author + ", Year: " + year + ", Current Page: " + changePage);
        
    }
    
    public void changePage(int page) {
        this.changePage = page;
    }
    
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
        return year;
    }
}
