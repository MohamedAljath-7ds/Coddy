/*
 Create a function named aquariumCodeTranslator that receives fishCount as its parameter.

This function aims to convert the number of fish in an aquarium into a special message code used by the aquarium's computer system.

The aquarium uses a unique coding system to display the status of their fish tanks. The number of fish in a tank is first converted to its binary string representation. Then, each bit in this binary string is translated to either 'Fish' (for '1') or 'Water' (for '0'). This creates a message code that simulates the tank's contents.

For example, if there are 5 fish in the tank, the binary representation would be '101'. Translating this, the final message code would be 'FishWaterFish', indicating there is a fish, then some water, and then another fish in the tank.

Your task is to implement this aquarium code translator to convert the fish count into the corresponding message code.

Parameters:

fishCount (int): The number of fish in the aquarium tank. It will be a non-negative integer.
The function returns a String representing the translated aquarium code message, with '1's replaced by 'Fish' and '0's replaced by 'Water'.
 */

class AquariumCodeTranslator {
    public static String aquariumCodeTranslator(int fishCount) {
        // Write code here
        String IntToBinary = Integer.toBinaryString(fishCount);
        String ans = "";
        for (int i = 0; i < IntToBinary.length(); i++) {
            if (IntToBinary.charAt(i) == '1') {
                ans = ans.concat("Fish");
            } else if (ans.charAt(i) == '0') {
                ans = ans.concat("Water");
            }
        }
        return ans;
    }
}
