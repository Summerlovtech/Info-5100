public class Main {

    public static void main(String[] args) {
        Fiction fiction = new Fiction("Anne Frank", 20, "2010");
        Reference reference = new Reference("World Maps", 15, "2021", "encyclopedia");


        System.out.println(fiction.description());
        System.out.println(reference.description());


    }
}
