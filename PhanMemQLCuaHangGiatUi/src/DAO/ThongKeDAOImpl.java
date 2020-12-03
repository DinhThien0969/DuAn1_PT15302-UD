package DAO;

import Entity.KhachHangBean;
import Entity.MathangBean;
import JdbcHelper.JdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ThongKeDAOImpl implements ThongKeDAO {

    @Override
    public List<KhachHangBean> getListByKhachHang() {
        try {
            Connection cons = JdbcHelper.getConnection();
            String sql = "SELECT NgayNhan, COUNT(*) AS So_luong FROM dbo.HoaDon \n" +
"GROUP BY NgayNhan";
            List<KhachHangBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangBean khacHangBean = new KhachHangBean();
                khacHangBean.setNgayDangKy(rs.getString("NgayNhan"));
                khacHangBean.setSoLuongKhachHang(rs.getInt("so_luong"));
                list.add(khacHangBean);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MathangBean> getListByMatHang() {
        try {
            Connection cons = JdbcHelper.getConnection();
            String sql = "SELECT TenMH, NgayNhap, NgayXuat FROM dbo.MatHang WHERE TrangThai = 1";
            List<MathangBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MathangBean matHangBean = new MathangBean();
                matHangBean.setTenMatHang(rs.getString("TenMH"));
                matHangBean.setNgayNhap(rs.getDate("NgayNhap"));
                matHangBean.setNgayXuat(rs.getDate("NgayXuat"));
                list.add(matHangBean);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
