package chainOfResponsibility;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount()< 1500){
            System.out.println("VPs can approve conferences");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
