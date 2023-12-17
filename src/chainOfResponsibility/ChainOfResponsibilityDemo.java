package chainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director bryan = new Director();
        VP george = new VP();
        CEO bob = new CEO();


        bryan.setSuccessor(george);
        george.setSuccessor(bob);

        Request request1 = new Request(RequestType.CONFERENCE, 30);

        bryan.handleRequest(request1);
        Request request2 = new Request(RequestType.PURCHASE, 3000);

        bryan.handleRequest(request2);

    }
}
