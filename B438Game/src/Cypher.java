
import java.util.ArrayList;

public class Cypher
{

    public static void main(String[] args)
    {
        String[] quote = new String[2];
        quote[0] = "Beauty is in the heart of the beholder.";
        quote[1] = "H. G. Wells";
        Cypher cypher = new Cypher();

        String[] encryptedQuote = cypher.encrypt(quote);

        System.out.println(encryptedQuote[0]);
        System.out.println("\t" + encryptedQuote[1]);
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

        String[] encryptedQuote = new String[2];

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
            encryptedQuote[i] = temp;
        }
        return encryptedQuote;
    }
}