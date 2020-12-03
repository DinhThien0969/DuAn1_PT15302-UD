
package Entity;


public class KhachHangBean {
    String ngayDangKy;
    int soLuongKhachHang;

    public KhachHangBean() {
    }

    public KhachHangBean(String ngayDangKy, int soLuongKhachHang) {
        this.ngayDangKy = ngayDangKy;
        this.soLuongKhachHang = soLuongKhachHang;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public int getSoLuongKhachHang() {
        return soLuongKhachHang;
    }

    public void setSoLuongKhachHang(int soLuongKhachHang) {
        this.soLuongKhachHang = soLuongKhachHang;
    }
    
    
}
