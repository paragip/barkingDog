public class barkingDog {
    public static void main (String[] args) {

        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 0 && hourOfDay < 8 && barking) || (hourOfDay == 23 && barking)) {
            return true;
        } else {
            return false;
        }
    }

}
