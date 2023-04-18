package bai2;

import java.util.*;

public class manager {

    public static void menu () {
        System.out.println("1: Insert.");
        System.out.println("2: Remove.");
        System.out.println("3: Update.");
        System.out.println("4: Search.");
        System.out.println("5: Sort.");
        System.out.println("6: Show Data.");
        System.out.println("7: Exit.");
    }

    public static void main(String[] args) {
        PhoneBook x = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int index;
        do {
            menu();
            System.out.print("Nhap lua chon cua ban: ");
            index = sc.nextInt();
            if(index <= 0 || index > 7){
                System.out.println("lua chon cua ban khong hop le!!!");
            }
        }while(index <= 0 || index > 7 );   

        switch(index) {
            case 1: 
            String name, phone;
            sc.nextLine();
            System.out.print("Moi ban nhap ten: ");
            name = sc.nextLine();
            System.out.print("Moi ban nhao so dthoai: ");
            phone = sc.nextLine();
            x.insertPhone(name, phone);
            break;

            case 2:
            sc.nextLine();
            String name2;
            System.out.println("Nhap ten ban muon xoa: ");
            name2 = sc.nextLine();
            x.removePhone(name2);
            break;

            case 3: 
            sc.nextLine();
            String name3, Phone3;
            System.out.print("Nhap ten ban muon cap nhat: ");
            name3 = sc.nextLine();
            System.out.print("Nhap so dien thoai ban muon Update: ");
            Phone3 = sc.nextLine();
            x.updatePhone(name3, Phone3);
            break;

            case 4: 
            sc.nextLine();
            String name4;
            System.out.print("Nhap ten ban muon tim kiem: ");
            name4 = sc.nextLine();
            x.searchPhone(name4);
            break;

            case 5: 
            x.sort();
            break;

            case 6: 
            x.showData();
            break;

            case 7:
            sc.nextLine();
            System.out.println("Ban da thoat khoi chuong trinh!!!!"); 
            break;

            
        }

        if (index == 7) {
            break;
        }

    }
    
    }
    
}
