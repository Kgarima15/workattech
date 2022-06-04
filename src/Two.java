import java.util.Scanner;

public class Two {

        public static void main(String args[] ) throws Exception {

            //Write code here
            Scanner sc = new Scanner(System.in);
            String launchTime = sc.nextLine();
            String travelTime = sc.nextLine();

            String launch[] = launchTime.split(" ");
            String travel[] = travelTime.split( " ");

            int launchMin = Integer.parseInt(launch[1]);
            int launchHour = Integer.parseInt(launch[0]);

            int travelMin = Integer.parseInt(travel[1]);
            int travelHour = Integer.parseInt(travel[0]);

            int carry = 0;
            int totalMin = launchMin+travelMin;
            if(totalMin >= 60) {
                totalMin = totalMin-60;
                carry = 1;
            }

            int totalHour = launchHour+travelHour+carry;
            if(totalHour >= 24){
                totalHour = totalHour-24;
            }
            String sTotalHour;
            if(totalHour/10 == 0) {
                sTotalHour = "0"+String.valueOf(totalHour);
            } else
             sTotalHour = String.valueOf(totalHour);



            String sTotalMin;
            if(totalMin/10 == 0) {
                sTotalMin = "0"+String.valueOf(totalMin);
            } else
                sTotalMin = String.valueOf(totalMin);

            String result = sTotalHour+ " "+sTotalMin;

            System.out.println(result);


        }

}
