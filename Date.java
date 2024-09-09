package Sem2_miniproject;

public class Date {
    int date;
    int month;
    int year;
    void setDate(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    void showDate(){
        System.out.println(date+"-"+month+"-"+year);
    }
}
