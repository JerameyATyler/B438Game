
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CypherClient
{

    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("127.0.0.1", 9001);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("get");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.
                    getInputStream()));
            String message = in.readLine();
            System.out.println(message);

            String[] quote = message.split("/n");
            for (String s : quote)
            {
                System.out.println(s);
            }
            
            
            
            Scanner input = new Scanner(System.in);
            String inquote = input.nextLine();
            String inquoter = input.nextLine();
            out.println(inquote + "/n" + inquoter);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
