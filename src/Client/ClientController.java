package Client;

import javax.swing.*;
import java.io.IOException;

public class ClientController {
    private ClientModel model;
    private ClientView view;

    public ClientController(ClientModel model, ClientView view) {
        this.model = model;
        this.view = view;
    }


    JFrame frame = new JFrame("View");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
