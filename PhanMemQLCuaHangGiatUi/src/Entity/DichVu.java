package Entity;

public class DichVu {

    String MaDV;
    String LoaiDV;
    double DonVi;
    double DonGia;
    String MoTa;

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getLoaiDV() {
        return LoaiDV;
    }

    public void setLoaiDV(String LoaiDV) {
        this.LoaiDV = LoaiDV;
    }

    public Double getDonVi() {
        return DonVi;
    }

    public void setDonVi(Double DonVi) {
        this.DonVi = DonVi;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    @Override
    public String toString(){
        return this.LoaiDV;
    }
    @Override
    public boolean  equals(Object obj){
        DichVu other = (DichVu) obj;
        return other.getMaDV().equals(this.getMaDV());
    }
    
}
