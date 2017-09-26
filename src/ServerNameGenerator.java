import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {
        "Bitter",
        "Lemon-flavored",
        "Spicy",
        "Bland",
        "Minty",
        "Sweet",
        "Delicious",
        "Pickled",
        "Tangy",
        "Fruity"
    };
    public static String[] nouns = {
        "beach",
        "lamp",
        "money",
        "dog",
        "mountain",
        "computer",
        "book",
        "ball",
        "phone",
        "bag"
    };

    public static String getRandomNoun() {
        int rand = new Random().nextInt(nouns.length - 1);

        return nouns[rand];
    }

    public static String getRandomAdjective() {
        int rand = new Random().nextInt(adjectives.length-1);

        return adjectives[rand];
    }

    public static void main(String[] args) {
        System.out.println(getRandomAdjective() + "-" + getRandomNoun());
    }

}