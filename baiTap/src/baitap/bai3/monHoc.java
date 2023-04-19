package baiTap.bai3;

import java.util.*;

public abstract class monHoc {
   public String maMonHoc; 
   public String tenMonHoc;
   public String khoaPhuTrach;
   public double diem;


   Scanner sc = new Scanner(System.in);

   public monHoc (){

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

  public String setKhoaPhuTrach(String khoaPhuTrach) {
      return this.khoaPhuTrach = khoaPhuTrach;
  }

   public void input() {
      System.out.print("Nhap ma mon hoc: ");
      setMaMonHoc(sc.nextLine());
      System.out.print("Nhap ten mon hoc: ");
      setTenMonHoc(sc.nextLine());
      System.out.print("Nhap khoa phu trach: ");
      setKhoaPhuTrach(sc.nextLine());
   }

   public abstract double tinhDiem();

   public abstract int tinhHocPhi();


}