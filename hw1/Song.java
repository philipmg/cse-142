public class Song {
    public static void main(String[] args) {
        System.out.println("There was an old woman who swallowed a fly.");
        fly();
        System.out.println();

        System.out.println("There was an old woman who swallowed a spider.");
        System.out.println("That wriggled and igled and jiggled inside her.");
        spider();
        System.out.println();

        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        bird();
        System.out.println();

        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        System.out.println("She swallowed the cat to catch the bird,");
        bird();
        System.out.println();

        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow  dog.");
        System.out.println("She swallowed the dog to catch the cat,");
        System.out.println("She swallowed the cat to catch the bird,");
        bird();
        System.out.println();

        System.out.println("There was an old woman who swallowed a pig,");
        System.out.println("What a pig to swallow a pig,");
        System.out.println("She swallowed the pig to catch the dog,");
        System.out.println("She swallowed the dog to catch the cat,");
        System.out.println("She swallowed the cat to catch the bird,");
        bird();
        System.out.println();

        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void bird() {
        System.out.println("She swallowed the bird to catch the spider,");
        spider();
    }

    public static void spider() {
        System.out.println("She swallowed the spider to catch the fly,");
        fly();
    }

    public static void fly() {
        System.out.println("I don't know why she swallowed the fly,");
        System.out.println("Perhaps she'll die.");
    }
}