package JavaLearning;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskManager {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;

            @Override
            public void run() {
                if (counter>0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 20);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.MILLISECOND, 0);

        //timer.schedule(task, 1000);
        //timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
