package DAO;

import JdbcHelper.JdbcHelper;
import Entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV, TenNV, GioiTinh, MatKhau, SDT, Email, DiaChi, VaiTro) VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MaNV=?, TenNV=?, GioiTinh=?, MatKhau=?, SDT=?, Email=?, DiaChi=?, VaiTro=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT*FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT*FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaNV(),  entity.getTenNV(),entity.getGioiTinh(), entity.getMatKhau(), 
                entity.getSDT(), entity.getEmail(), entity.getDiaChi(), entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaNV(), entity.getTenNV(), entity.getGioiTinh(), entity.getMatKhau(), 
                entity.getSDT(), entity.getEmail(), entity.getDiaChi(), entity.getVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                NhanVien entity = new NhanVien();               
               entity.setMaNV(rs.getString("MaNV"));
               entity.setTenNV(rs.getString("TenNV"));
               entity.setGioiTinh(rs.getBoolean("GioiTinh"));
               entity.setMatKhau(rs.getString("MatKhau"));
               entity.setSDT(rs.getInt("SDT"));
               entity.setEmail(rs.getString("Email"));
               entity.setDiaChi(rs.getString("DiaChi"));
               entity.setVaiTro(rs.getBoolean("VaiTro"));
               
               list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
