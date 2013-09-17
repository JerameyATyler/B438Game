
import java.io.File;
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

        cypher.quote = cypher.getQuote();
        cypher.encryptedQuote = cypher.encrypt(cypher.quote);

        System.out.println(cypher.encryptedQuote[0]);
        System.out.println("\t" + cypher.encryptedQuote[1]);
        System.out.println(cypher.quote[0]);
        System.out.println("\t" + cypher.quote[1]);
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
}