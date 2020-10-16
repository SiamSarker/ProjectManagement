package abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu = new MobileUser() {
            @Override
            void sendMessage() {

            }
        };

        mu = new Rahim();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();

    }
}
