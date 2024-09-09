package Sem2_miniproject;

public class Address {
    String locality;
    String cityName;
    int pinCode;
    void setAddress(String locality,String cityName,int pinCode){
        this.locality=locality;
        this.cityName=cityName;
        this.pinCode=pinCode;
    }
    void showAddress(){
        System.out.println(locality+" , "+cityName+" , "+pinCode);
    }


}
