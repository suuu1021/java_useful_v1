package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 메서드 재정의
    @Override
    public String toString() {
        return "title : " + title + " , " + "author : " + author;
    }

    // equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EBook) {
            if (this.title.equals(((EBook) obj).title) && this.author.equals(((EBook) obj).author)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // hashcode() 메서드 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }

    public static void main(String[] args) {

        Book book1 = new Book(1, "자바", "홍길동");
        Book book2 = new Book(1, "자바", "홍길동");
        Book book3 = new Book(2, "플러터", "가나다");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(book3);

        System.out.println(result1);
        System.out.println(result2);
    }
}
