public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter (23);
        hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter (59);
        seconds.setValue(secondsAtBeginning);
        
// the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
            
                if (minutes.getValue() == 0){
                    hours.next();
                }
            }
        // Clock advances by one second
    }
    
    public String toString() {
        // returns the string representation
        return "" + hours + ":" + minutes +":" + seconds;
    }
}
