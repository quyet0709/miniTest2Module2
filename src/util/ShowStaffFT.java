package util;

import entity.Staff;
import entity.StaffFullTime;

import java.util.ArrayList;
import java.util.List;

public class ShowStaffFT {


    //Trả về mảng full time
    public static List<Staff> arrStaffFullTime(List<Staff> arr){
        List<Staff> newStaff = new ArrayList<>();

        for (Staff x : arr) {
            if (x instanceof StaffFullTime) {
                newStaff.add(x);
            }
        }
        return newStaff;
    }
    //In ra full time
    public static void listStaffFullTime(List<Staff> arr){
        for (Staff x: arr
             ) {
            if(x instanceof StaffFullTime){
                System.out.println(x);
                System.out.println("Lương là:"+x.netWage());
            }

        }
    }

}
