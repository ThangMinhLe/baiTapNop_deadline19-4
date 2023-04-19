package baiTap.bai3;

public class lyThuyet extends monHoc {
    public double tieuLuan;
    public double giuaKy;
    public double cuoiKy;
    public int soTin;

    public lyThuyet() {

    }

    public lyThuyet(double tieuLuan, double giuaKy, double cuoiKy, int soTin) {
        this.tieuLuan = tieuLuan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
        this.soTin = soTin;
    }

    public double getTieuLuan() {
        return tieuLuan;
    }

    public void setTieuLuan(double tieuLuan) {
        this.tieuLuan = tieuLuan;
    }

    public double getGiuaKy() {
        return giuaKy;
    }

    public void setGiuaKy(double giuaKy) {
        this.giuaKy = giuaKy;
    }

    public double getCuoiKy() {
        return cuoiKy;
    }

    public void setCuoiKy(double cuoiKy) {
        this.cuoiKy = cuoiKy;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
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

  

    // public double getDiem() {
    //     return diem;
    // }

    // public void setDiem(double diem) {
    //     this.diem = diem;
    // }

    public void input() {
        super.input();
        System.out.print("Nhap diem tieu luan: ");
        setTieuLuan(sc.nextDouble());
        System.out.print("Nhap diem giua ky: ");
        setGiuaKy(sc.nextDouble());
        System.out.print("Nhap diem cuoi ky: ");
        setCuoiKy(sc.nextDouble());
        System.out.print("Nhap so tin: ");
        setSoTin(sc.nextInt());
    }


    public double tinhDiem() {
        return tieuLuan*0.2 + giuaKy*0.3 + cuoiKy*0.5;
    }

    public int tinhHocPhi() {
        return 250000*soTin;
    }


    
}
