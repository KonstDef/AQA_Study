package Lesson8.EnumExamp;

public class DayOfWeek {
    private String title;
    static int num;
    int numa;

    private DayOfWeek(String title){
        this.title = title;
    }

    public static DayOfWeek SUNDAY = new DayOfWeek("Sunday");
    public static DayOfWeek MONDAY = new DayOfWeek("Monday");
    public static DayOfWeek TUESDAY = new DayOfWeek("Tuesday");
    public static DayOfWeek WEDNESDAY = new DayOfWeek("Wednesday");
    public static DayOfWeek THURSDAY = new DayOfWeek("Thursday");
    public static DayOfWeek FRIDAY = new DayOfWeek("Friday");
    public static DayOfWeek SATURDAY = new DayOfWeek("Saturday");

    @Override
    public String toString(){
        return "DayOfWeek{title = '"+title+"\'"+"};";
    }
}

class Main{
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        System.out.println(dayOfWeek);
    }
}
