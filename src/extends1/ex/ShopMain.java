package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("java", 1000, "han", "1234");
        Album album = new Album("앨범1", 1000, "seo");
        Movie movie = new Movie("영화1", 1000, "seo", "han");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();

        System.out.println(sum);
    }
}
