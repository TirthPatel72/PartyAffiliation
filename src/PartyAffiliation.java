import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.print("Choose your party affiliation: (D) Democrat, (R) Republican, or (I) Independent): ");
        party = in.nextLine().toUpperCase(); // D R I or something else

        if (party.equals("D")) {
            System.out.println("You choose a Democrat.You get an Donkey.");
        }
        else if (party.equals("R"))
        {
            System.out.println("You choose a Republican. You get a Elephant.");
        }
        else if (party.equals("I"))
        {
            System.out.println("You choose an Independent. You get a person.");
        }
        else
        {
            System.out.println("I don't know what party this is: " + party);

        }


    }
}
