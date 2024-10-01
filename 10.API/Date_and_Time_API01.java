import java.util.Date;

public class Date_and_Time_API01{
    public static void main(String[] args) {

        Date dt1 = new Date();
        System.out.println(dt1);
        long TimeinMS = dt1.getTime();
        java.sql.Date dt2 = new  java.sql.Date(TimeinMS);
        System.out.println(dt2);

    }
}