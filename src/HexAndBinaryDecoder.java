import java.util.Scanner;
public class HexAndBinaryDecoder {


    public static long hexStringDecode(String hex) // decodes hexidecimal and gives back a decimal value//
    {
        long hexValue = 0;
        int currentCount = 0;
        for (int i = hex.length(); i > 0; i--){
            if (Character.toLowerCase(hex.charAt(i - 1)) != 'x') {
                hexValue += (hexCharDecode(hex.charAt(i-1))) * (Math.pow(16,currentCount));
                currentCount++;
            }
            else break;
        }
        return hexValue;
    }

    public static short hexCharDecode(char hexChar) // decodes characters given from input into numbers//
    {
        if (!Character.isDigit(hexChar)) return (short)(Character.toUpperCase(hexChar)-55);
        else return (short) Character.getNumericValue(hexChar);
    }

    public static long binaryStringDecode(String bin) // decodes binary string to decimal //
    {
        long binValue = 0;
        int currentCount = 0;
        for (int i = bin.length(); i > 0; i--){
            if (!((Character.toLowerCase(bin.charAt(i - 1)) == 'b') && i==2 && bin.charAt(i-2) == '0')) {
                if (!Character.isDigit(bin.charAt(i-1))){
                    binValue += (Character.toUpperCase(bin.charAt(i-1))) * (Math.pow(2,currentCount));
                }
                else binValue += (Character.getNumericValue(bin.charAt(i-1))) * (Math.pow(2,currentCount));
                currentCount++;
            }
            else break;
        }
        return binValue;
    }

    public static String binaryToHex(String bin){

        return null;
    }




    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int userInput;
        String bin;
        String hex;
        // This while loop enables the menu to be displayed after each result has been given.
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Decode a hex string.");
            System.out.println("2. Decode a binary string.");
            System.out.println("3. Convert binary to hex.");
            System.out.println("4. Quit.");
            userInput = scnr.nextInt();

            switch (userInput) // based upon user input it will go to different cases//
            {
                case 1: //chose to decode a hexidecimal string //
                    System.out.println("Please enter the hex string: ");
                    hex = scnr.next();
                    System.out.print("Result: ");
                    System.out.println(hexStringDecode(hex));

                    break;
                case 2: // chose to decode binary string //
                    System.out.println("Please enter the binary string: ");
                    bin = scnr.next();
                    System.out.print("Result: ");
                    System.out.println(binaryStringDecode(bin));

                    break;
                case 3: // chose to convert from binary to hexidecimal //
                    System.out.println("Please enter the binary string: ");
                    bin = scnr.next();
                    System.out.print("Result: ");
                    binaryToHex(bin);

                    break;
                case 4: // exits programs //
                    System.out.println("Quitting program.");
                    System.exit(4);
                    break;


            }
        }













    }
}
