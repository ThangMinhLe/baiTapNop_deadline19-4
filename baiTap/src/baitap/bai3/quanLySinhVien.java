
package baiTap.bai3;

import java.util.*;

public class quanLySinhVien {
    private String name;
    private double diem;
    private double hocPhi;
    monHoc[] mh = new monHoc[0];

    quanLySinhVien sv[] = new quanLySinhVien[0];


    public quanLySinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public static void menu() {
        System.out.println("1: Ly Thuyet.");
        System.out.println("2: Thuc hanh.");
        System.out.println("3: Do an.");
        System.out.println("0: Da nhap xong mon hoc.");
    }

    public void addElement() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cho sinh vien: ");
        setName(sc.nextLine());

        while (true) {
            int choose;
            do {
                menu();
                System.out.println("Nhap mon hoc cho sinh vien " + name + " : ");
                choose = Integer.parseInt(sc.nextLine());
            } while (choose < 0 || choose > 3);

            if (choose == 0) {
                break;
            }

            switch (choose) {
                case 1:
                    monHoc lt = new lyThuyet();
                    lt.input();
                    diem = diem + lt.tinhDiem();
                    hocPhi = lt.tinhHocPhi();
                    n += 1;
                    break;

                case 2:
                    monHoc th = new thucHanh();
                    th.input();
                    diem = diem + th.tinhDiem();
                    hocPhi = th.tinhHocPhi();
                    n += 1;
                    break;

                case 3:
                    monHoc da = new doAn();
                    da.input();
                    diem = diem + da.tinhDiem();
                    hocPhi = da.tinhHocPhi();
                    n += 1;
                    break;

            }
        }
                diem = diem / n;

      
    }

    public void showdata() {

        
        System.out.printf("%-20s%-20s%-20s\n", "Ten", "Diem", "Hoc Phi");
        for(quanLySinhVien x:sv) {
        System.out.printf("%-20s%-20s%-20s\n", x.getName(), x.getDiem(), x.getHocPhi());
        }
    }



    public static void main(String[] args) {
        quanLySinhVien ql = new quanLySinhVien();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            int chon;
            do{ 
            System.out.println("1: Them sinh vien: ");
            System.out.println("2: Show thong tin.");
            System.out.println("0: Exit.");
            chon = sc.nextInt(); } while(chon < 0 || chon > 2);
            
            switch(chon) {
                case 1: 
                ql.addElement();
                break;
                case 2: 
                ql.showdata();
                break;
            }
       
        }
       
    }
}
