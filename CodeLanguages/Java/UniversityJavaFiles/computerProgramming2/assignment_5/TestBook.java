public class TestBook
{
    public static void main(String[] args)
    {
        System.out.println("Default constructor and getters:");
        Book b1 = new Book();
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("ISBN: " + b1.getISBN());

        System.out.println();

        System.out.println("Result of toString():");
        System.out.println(b1.toString());

        System.out.println();

        System.out.println("Using the setters and toString():");
        b1.setTitle("The Book of Five Rings");
        b1.setAuthor("Miyamoto Musashi");
        b1.setISBN(2222222222L);
        System.out.println(b1.toString());

        System.out.println();

        System.out.println("Using other constructor:");
        Book b2 = new Book("The C Programming Language", "Kernighan and Ritchie", 3333333333L);

        System.out.println();

        System.out.println("Using the getters:");
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("ISBN: " + b2.getISBN());
    }
}