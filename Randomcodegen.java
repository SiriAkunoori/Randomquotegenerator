import java.util.Random;
public class Randomcodegen{
    public static void main(String[] args) {
        String[] quotes = {
            "as thick as theifs",
            "rat race shit",
            "live a life less ordinary",
            "you're 100% correct sir",
            "sadhuvukondra first",
            "she is my MJ",
            "to be frank nak em akkuthaledh",
            "cute ga unav ,tax veyyala",
            "in cloud!9",
            "thagudham"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        System.out.println("Random Quote: ");
        System.out.println(quotes[randomIndex]);
    }
}
