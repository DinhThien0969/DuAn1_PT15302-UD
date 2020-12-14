package DAO;

import Entity.KhachHang;
import JdbcHelper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO extends EduSysDAO<KhachHang, String> {

    String INSERT_SQL = "INSERT INTO KhachHang(MaKH, TenKH, GioiTinh, DiaChi, SDT, GhiChu, MaNV) VALUES(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhachHang SET MaKH=?, TenKH=?, GioiTinh=?, DiaChi=?, SDT=?, GhiChu=?, MaNV=? WHERE MaKH=?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH=?";
    String SELECT_ALL_SQL = "SELECT*FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT*FROM KhachHang WHERE MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaKH(), entity.getTenKH(), entity.getGioiTinh(), entity.getDiaChi(), entity.getSDT(), entity.getGhiChu(), entity.getMaNV());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaKH(), entity.getTenKH(), entity.getGioiTinh(), entity.getDiaChi(), entity.getSDT(), entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<KhachHang> selectAll() {
        return (List<KhachHang>) this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String key) {
        List<KhachHang> list = (List<KhachHang>) this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSDT(rs.getInt("SDT"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<Object[]> getKhachHang() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "SELECT KhachHang.MaKH, MaHD,TenKH, GioiTinh, DiaChi, NgayTra FROM dbo.KhachHang\n"
                        + "JOIN dbo.HoaDon ON HoaDon.MaKH = KhachHang.MaKH";
                rs = JdbcHelper.query(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaKH"),
                        rs.getString("MaHD"),
                        rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"),                      
                        rs.getString("DiaChi"),                        
                        rs.getDate("NgayTra"),                        
                    };
                    list.add(model);

                }
            } finally {
                rs.getStatement().getConnection().close();

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
        return list;

    }

}
