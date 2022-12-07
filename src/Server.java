import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Server {
    public static void main(String[] argv) throws IOException {
        ServerSocket server = new ServerSocket(6789);
        while(true)
        {
            Socket connection = server.accept();
            BufferedReader message = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String outputFromUser = message.readLine();
            System.out.println("Received: " + outputFromUser);
        }
    }
}
