package bai2;

import java.util.*;
import java.lang.NullPointerException;


public class PhoneBook extends Phone{
    Scanner sc = new Scanner(System.in);

    Phone PhoneList[] = new Phone[0];

    public boolean checkName (String name) {
        for (int i = 0; i < PhoneList.length; i++) {
            if (PhoneList[i].name.equalsIgnoreCase(name)) {
                return false;       
            }
        }
            return true;
    }

    public boolean checkPhone (String phone) {
        for (int i = 0; i < PhoneList.length; i++ ) {
            if (PhoneList[i].phone.equalsIgnoreCase(phone)) {
                return false;
            }
        }
        return true;
    }

    public int takeIndex (String name) {
        for (int i = 0; i < PhoneList.length; i++ ) {
            if (PhoneList[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void insertPhone(String name, String phone) {
        if (checkName(name)) {
            PhoneList = Arrays.copyOf(PhoneList,PhoneList.length + 1);
            PhoneList[PhoneList.length -1] = new PhoneBook();
            PhoneList[PhoneList.length -1 ].name = name;
            PhoneList[PhoneList.length -1].phone = phone;
        } else if(checkPhone(phone)) {
            PhoneList[takeIndex(name)].phone = phone;
        }



    }
    public void removePhone(String name) {
        int index = -1;
        
        for (int i =0 ; i < PhoneList.length; i ++) {
           if (!checkName(name)) {
                index = takeIndex(name);
                for (int j = index; i < PhoneList.length - 1; j++) {
                    PhoneList[j] = PhoneList[j + 1];
                }
            }
            break;
        }
        PhoneList = Arrays.copyOf(PhoneList, PhoneList.length - 1);
    }

    public void updatePhone(String name, String newPhone){
            int index = -1;
            if(!checkName(name)){ 
                index = takeIndex(name);
            }

            PhoneList[index].phone = newPhone;
        
    }
    public void searchPhone(String name){
            int index = -1;
            if(!checkName(name)) {
                index = takeIndex(name);
                System.out.printf("%-20s%-20s\n",PhoneList[index].name, PhoneList[index].phone);
            }
    }

    public void showData() {
        System.out.printf("%-20s%-20s\n", "Name", "Phone");
        for (int i =0 ; i < PhoneList.length; i++) {
            System.out.printf("%-20s%-20s\n", PhoneList[i].name, PhoneList[i].phone);
        }
    }

    public void sort(){
        int n = PhoneList.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++ ) {
                long num1, num2;
                num1 = Long.parseLong(PhoneList[j].phone);
                num2 = Long.parseLong(PhoneList[j+1].phone);
                if( num1 > num2 ) {
                    //Swap
                    Phone s = new PhoneBook();
                    s = PhoneList[j];
                    PhoneList[j] = PhoneList[j + 1];
                    PhoneList[j+1] = s;
                     
                }
            }
        }

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    


}
