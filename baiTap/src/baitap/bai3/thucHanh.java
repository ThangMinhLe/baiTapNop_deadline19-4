package baiTap.bai3;

import java.util.*;

public class thucHanh extends monHoc {
    public double bai1;
    public double bai2;
    public double bai3;    
    public double bai4;
    public int soTin;

    Scanner sc = new Scanner(System.in);

    public thucHanh() {
        
    }



 public thucHanh(double bai1, double bai2, double bai3, double bai4, int soTin) {
        this.bai1 = bai1;
        this.bai2 = bai2;
        this.bai3 = bai3;
        this.bai4 = bai4;
        this.soTin = soTin;
    }

    public double getBai1() {
        return bai1;
    }

    public void setBai1(double bai1) {
        this.bai1 = bai1;
    }

    public double getBai2() {
        return bai2;
    }

    public void setBai2(double bai2) {
        this.bai2 = bai2;
    }

    public double getBai3() {
        return bai3;
    }

    public void setBai3(double bai3) {
        this.bai3 = bai3;
    }

    public double getBai4() {
        return bai4;
    }

    public void setBai4(double bai4) {
        this.bai4 = bai4;
    }

    public int getSoTin() {
        return soTin;
    }

    public int setSoTin(int soTin) {
        return this.soTin = soTin;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getKhoaPhuTrach() {
        return khoaPhuTrach;
    }
   

   


    public void input() {
        super.input();
        System.out.print("Nhap diem bai 1: ");
        setBai1(sc.nextDouble());
        System.out.print("Nhap diem bai 2: ");
        setBai2(sc.nextDouble());
        System.out.print("Nhap diem bai 3: ");
        setBai3(sc.nextDouble());
        System.out.print("Nhap diem bai 4: ");
        setBai4(sc.nextDouble());
        System.out.print("Nhap so tin chi: ");
        soTin = sc.nextInt();
    }
    

    public double tinhDiem() {
        return (bai1 + bai2 + bai3 + bai4)/4;
    }

   

    public int tinhHocPhi() {
        return (350000*soTin) + 100000;
    }



}
