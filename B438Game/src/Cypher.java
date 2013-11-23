
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Cypher
{

    String[] quote = new String[2];
    String[] encryptedQuote = new String[2];
    ArrayList<String[]> quotesList = new ArrayList();

    public static void main(String[] args)
    {
        Cypher cypher = new Cypher();

        cypher.populateQuoteList();

        try
        {
            ServerSocket ss = new ServerSocket(9001);
            Socket socket = ss.accept();
            while (true)
            {
                
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
                String command = in.readLine();
                if (command.compareToIgnoreCase("get") == 0)
                {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(),
                            true);

                    cypher.quote = cypher.getQuote();
                    cypher.encryptedQuote = cypher.encrypt(cypher.quote);

                    out.println(cypher.encryptedQuote[0] + "/n" 
                            + cypher.encryptedQuote[1]);
                    
                    for(String s : cypher.quote)
                    {
                        System.out.println(s);
                    }
                }
                else
                {
                    String[] message = command.split("/n");
                    if(message[0].compareToIgnoreCase(cypher.quote[0]) == 0 &&
                            message[1].compareToIgnoreCase(cypher.quote[1]) == 0)
                    {
                        PrintWriter out = new PrintWriter(socket.getOutputStream(),
                                true);
                        
                        out.println("true");
                    }
                    else
                    {
                        PrintWriter out = new PrintWriter(socket.getOutputStream(),
                                true);
                        
                        out.println("false");
                    }
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void populateQuoteList()
    {
        File quotes = new File("Quotes.txt");

        try
        {
            Scanner in = new Scanner(quotes);

            while (in.hasNext())
            {
                String[] s =
                {
                    in.nextLine(), in.nextLine()
                };
                quotesList.add(s);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public String[] getQuote()
    {
        return (quotesList.get((int) (Math.random() * (quotesList.size()))));
    }

    public String[] encrypt(String[] original)
    {
        ArrayList<Integer> alpha = new ArrayList();
        while (alpha.size() < 26)
        {
            Integer x = ((int) (Math.random() * 26));
            if (!alpha.contains(x))
            {
                alpha.add(x);
            }
        }

        String[] encrypted = new String[2];

        for (int i = 0; i < 2; i++)
        {
            String temp = "";
            for (int j = 0; j < original[i].length(); j++)
            {
                if (original[i].charAt(j) != 32 && original[i].charAt(j) < 91
                        && original[i].charAt(j) > 64)
                {
                    temp +=
                            (char) (alpha.get((original[i].charAt(j)) - 65) + 65);
                }
                else if (original[i].charAt(j) != 32 && original[i].charAt(j)
                        < 123
                        && original[i].charAt(j) > 96)
                {
                    temp +=
                            (char) (alpha.get((original[i].charAt(j)) - 97) + 97);
                }
                else
                {
                    temp += original[i].charAt(j);
                }
            }
            encrypted[i] = temp;
        }
        return encrypted;
    }
    
    public boolean compare(String[] userGuess, String[] actualQuote) 
    {
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < actualQuote[i].length(); j++) 
            {
                if (userGuess[i].charAt(j) != actualQuote[i].charAt(j)) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}