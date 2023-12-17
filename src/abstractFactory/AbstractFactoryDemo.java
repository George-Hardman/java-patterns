package abstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(200);

        CreditCard card = creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

    }

}
