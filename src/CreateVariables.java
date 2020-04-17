    /*Y Peudocode
    Import java currency scanners in case need conversion
    Include  opening salutation to Mom and Dad
    Declare variables for  country, population, Capital, and currency.
    Provide details about country visiting
    Print U.S. dollar converted to Fijian dollars
    Print details about country
    */

    import java.text.NumberFormat;
    import java.util.Currency;
    import java.util.Locale;

    public class CreateVariables {


        public static int Fiji;
        public static int Suva;

        public static void main(String[] args) {


            float fijipopulation;
            double uscurrency;
            double fijiandollar;

                        uscurrency = 1;
            fijiandollar = 2.27;
            fijipopulation = (float) 895.000;

            System.out.println("Hey Mom and Dad!");
            System.out.println("Here are some interesting details about the first country I'm visiting");
            System.out.println("Name: Fiji");
            System.out.println("Population size:" +"" + fijipopulation + "thousand");
            System.out.println("Capital: Suva");
            System.out.println("Currency:" + uscurrency + "U.S Dollar equals" + "" + fijiandollar + "Fiji dollars!!");
            System.out.println("I'm so excited to visit the Island of Fiji and feel the warm sand");


        }

}

