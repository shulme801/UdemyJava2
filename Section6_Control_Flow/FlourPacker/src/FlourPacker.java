public class FlourPacker {
    public static void main(String[] args) {


        int bigCount = 1;
        int smallCount = 0;
        int orderSize = 4;
        String resultString = canPack(bigCount, smallCount, orderSize) ? "works" : "doesn't work";
        System.out.println("for a "+ orderSize + " kilo order, "+ bigCount +" x 5 kilo bags" + " plus "+ smallCount + " 1 kilo bags " +
                resultString);


        bigCount = 1;
        smallCount = 0;
        orderSize = 5;
        resultString = canPack(bigCount, smallCount, orderSize) ? "works" : "doesn't work";
        System.out.println("for a "+ orderSize + " kilo order, "+ bigCount +" x 5 kilo bags" + " plus "+ smallCount + " 1 kilo bags " +
                resultString);


        bigCount = 0;
        smallCount = 5;
        orderSize = 4;
        resultString = canPack(bigCount, smallCount, orderSize) ? "works" : "doesn't work";
        System.out.println("for a "+ orderSize + " kilo order, "+ bigCount +" x 5 kilo bags" + " plus "+ smallCount + " 1 kilo bags " +
                resultString);

        bigCount = 2;
        smallCount = 2;
        orderSize = 11;
        resultString = canPack(bigCount, smallCount, orderSize) ? "works" : "doesn't work";
        System.out.println("for a "+ orderSize + " kilo order, "+ bigCount +" x 5 kilo bags" + " plus "+ smallCount + " 1 kilo bags " +
                resultString);

        bigCount = -3;
        smallCount = 2;
        orderSize = 12;
        resultString = canPack(bigCount, smallCount, orderSize) ? "works" : "doesn't work";
        System.out.println("for a "+ orderSize + " kilo order, "+ bigCount +" x 5 kilo bags" + " plus "+ smallCount + " 1 kilo bags " +
                resultString);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Algorithm suggested by Michal Kasiarz (Github.com/michalkasiarz)

        if ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)) {
            int bigK = 5 * bigCount;

            if (bigK + smallCount < goal) {
                return false; // no way we can make up an order that weighs "goal" kilos
            }

            // if we get here, we know that the goal is greater than bigK+smallCount kilos
            // the question is this: do we have enough small bags to fill the order -- even if we leave some small or
            // large bags on the shelf?
            if ((goal % 5) > smallCount) {
                return false; // false because we've used up all our big bags and all our small bags, and still don't have enough
            }

            return true;

        } else {
            return false;
        }
    }
}
