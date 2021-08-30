package _observator_;

public class Main {

    public static void main(String[] args) {

        Button button = new Button();

        Subscriber sampleSubscriber1 = new LogSubscriber();
        button.addSubscriber(sampleSubscriber1);

        //... simule le click de l'utilisateur
        button.click();

        Anchor anchor = new Anchor();
        anchor.addSubscriber(sampleSubscriber1);

        anchor.click();

        Subscriber subscriber2 = new SendMailSubscriber();
        button.addSubscriber(subscriber2);
        button.addSubscriber(subscriber2);

        Subscriber hello = o -> System.out.println("hello");
        button.addSubscriber(hello);

        button.addSubscriber(new Subscriber() {
            @Override
            public void update(Object o) {
                System.out.println("hello");
            }
        });

        // input.addClickListener(...);
        // input.addKeyUpListener(...);
        // input.addKeyDownListener(...);

    }
}
