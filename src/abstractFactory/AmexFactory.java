package abstractFactory;

public class AmexFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case PLATINUM -> {
                return new AmexPlatinumCreditCard();
            }
            case GOLD -> {
                return new AmexGoldCreditCard();
            }
            default -> {
                throw new IllegalStateException("Invalid Card Type: " + cardType);
            }
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case PLATINUM -> {
                return new AmexPlatinumValidator();
            }
            case GOLD -> {
                return new AmexGoldValidator();
            }
            default -> {
                throw new IllegalStateException("Invalid Card Type: " + cardType);
            }
        }
    }
}
