package Lab06;

public class Cau01 {
    public static void main(String[] args) {
        String myStringInput = "3hrs and 6 minutes";

        // Split subStr hour and subStr minute
        String[] splitTime = myStringInput.split("and");

        // Index subString
        String hourStr = splitTime[0];
        String minuteStr = splitTime[1];

        // Split hour and minute
        int hrs = Integer.parseInt(hourStr.replaceAll("[^0-9]",""));
        int mins = Integer.parseInt(minuteStr.replaceAll("[^0-9]",""));

        // Total minutes
        int totalTime = hrs*(60) + mins;
        System.out.println("Total minutes is: " + totalTime + " mins");
    }
}
