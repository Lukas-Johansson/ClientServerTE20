package Client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientModel model = new ClientModel("172.17.240.1", 8001);
        ClientView view = new ClientView();
        ClientController controller = new ClientController(model, view);
        controller.run();
    }

}
