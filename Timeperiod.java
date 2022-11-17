
public class Timeperiod {

    int seconds;
    int minutes;
    int hours;

    public Timeperiod(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {

    	Timeperiod start = new Timeperiod(8, 12, 15);
    	Timeperiod stop = new Timeperiod(12, 34, 55);
    	Timeperiod diff;
 
        diff = difference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static Timeperiod difference(Timeperiod start, Timeperiod stop)
    {
        Timeperiod diff = new Timeperiod(0, 0, 0);

        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;
        return(diff);
    }
}