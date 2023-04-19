package baiTap.bai3;

public class doAn extends monHoc {
    public double GVHD;
    public double GVPB;
    public int soTin;
    public doAn(){

    }

    public doAn(double GVHD, double GVPB) {
        this.GVHD = GVHD;
        this.GVPB = GVPB;
    }

    public double getGVHD() {
        return GVHD;
    }

    public void setGVHD(double GVHD) {
        this.GVHD = GVHD;
    }

    public double getGVPB() {
        return GVPB;
    }

    public void setGVPB(double GVPB) {
        this.GVPB = GVPB;
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

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }


    // public double getDiem() {
    //     return diem;
    // }

    // public void setDiem(double diem) {
    //     this.diem = diem;
    // }



    public void input() {
        super.input();
        System.out.print("Diem GVHD: ");
        setGVHD(sc.nextDouble());
        System.out.print("Diem GVPB: ");
        setGVPB(sc.nextDouble());
        System.out.print("Nhap so tin: ");
        setSoTin(sc.nextInt());
    }


    public double tinhDiem() {
        return (GVHD + GVPB) / 2;
    }

    public int tinhHocPhi() {
        return 2000000;
    }

    
}
