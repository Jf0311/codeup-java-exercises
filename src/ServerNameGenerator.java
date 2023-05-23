import java.util.Random;

public class ServerNameGenerator {

    private static final String[] nouns = {
            "server", "park", "network", "application", "school",
            "car", "cloud", "protocol", "work", "security"
    };

    private static final String[] adjectives = {
            "awesome", "brilliant", "creative", "lazy", "moron",
            "fantastic", "kind", "hilarious", "intelligent", "humble"
    };

    public static void main(String[] args) {
        String generatedServerName = generateServerName();
        System.out.println("Generated Server Name: " + generatedServerName);
    }

    private static String generateServerName() {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        return adjective + "-" + noun;
    }

    private static String getRandomElement(String[] array) {


        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
