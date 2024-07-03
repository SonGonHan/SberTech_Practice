public class Main {
    public static void main(String[] args) {
        Author author = new Author("Акумов", "akumov@mail.ru", Gender.MALE);
        Book book = new Book("Лунный грааль", author, 2003);
        System.out.println(book);
        Author author2 = new Author("Бимбо", "bimbolove@mail.ru", Gender.FEMALE);
        Book book2 = new Book("Основы серфинга", author2, 2024);
        System.out.println(book2);
        author.setName(author2.getName());
        author.setMail(author2.getMail());
        author.setGender(author2.getGender());
        book.setTitle(book2.getTitle());
        book.setAuthor(book2.getAuthor());
        book.setReleaseDate(book2.getReleaseDate());
        System.out.println(book);
    }
}
