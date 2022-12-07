import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] argv) throws IOException {
        Socket client = new Socket("localhost",6789);
        DataOutputStream getServer = new DataOutputStream(client.getOutputStream());

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        String sentence = inFromUser.readLine();
        getServer.writeBytes(sentence + '\n');
        client.close();
    }
}
