package BooKookSecurities.Model;

import javafx.scene.control.CheckBox;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Report implements Comparable<Report>{
    public static final int NUM_FIELDS = 3;
    private int item_code;
    private String item_name, writer;
    private Date item_added_date;
    private int date_difference;


    public Report() {
    }

    public Report(int item_code, String item_name, Date item_added_date) {
        this.item_code = item_code;
        this.item_name = item_name;
        this.item_added_date = item_added_date;
        date_difference = getDifference();
    }

    public void updateDayDifference(){
        date_difference = getDifference();
    }
    private int getDifference(){
        Date curDate = Calendar.getInstance().getTime();
        long diff = curDate.getTime() - item_added_date.getTime();
        return (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public int compareTo(Report o) {
        return getItem_added_date().compareTo(o.getItem_added_date());
    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Date getItem_added_date() {
        return item_added_date;
    }

    public void setItem_added_date(Date item_added_date) {
        this.item_added_date = item_added_date;
    }

    public int getDate_difference() {
        return date_difference;
    }

    public void setDate_difference(int date_difference) {
        this.date_difference = date_difference;
    }


}
