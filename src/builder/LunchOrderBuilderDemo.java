package builder;

public class LunchOrderBuilderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder order = builder.bread("Loaf").condiments("Mayo").build();

        System.out.println(order.getBread());

    }


}
