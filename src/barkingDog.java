public class barkingDog {
    public static void main (String[] args) {

        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (hourOfDay >= 0 && hourOfDay < 8 && barking) || (hourOfDay == 23 && barking);
    }

}
