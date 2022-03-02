public class Question9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class Book{
    private String name;
    private int bookID;
    private String genres;
    private double price;
    //构造方法
    public Book(String name, int bookID, String genres, double price) {
        super();
        this.name = name;
        this.bookID = bookID;
        this.genres = genres;
        this.price = price;
    }
    //设置get和set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public String getGenres() {
        return genres;
    }
    public void setGenres(String genres) {
        this.genres = genres;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}