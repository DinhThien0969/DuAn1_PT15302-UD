
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.DichVu;
import Entity.MatHang;
import JdbcHelper.JdbcHelper;


public class MatHangDAO extends EduSysDAO<MatHang, String>{
    String INSERT_SQL = "insert into MatHang (TenMH, SoLuong, DonVi, DonGia, TrangThai,NgayNhap, NgayXuat, MaNV, MaDV) values (?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update MatHang set MaMH=?, TenMH = ?, SoLuong = ?, DonVi=?, DonGia=?, TrangThai=?, NgayNhap=?, NgayXuat=?, MaNV=?, MaDV=? where MaMH=?";
    String DELETE_SQL = "delete from MatHang where MaMH = ?";
    String SELECT_ALL_SQL = "select * from MatHang";
    String SELECT_BY_ID_SQL = "select * from MatHang where MaMH = ?";

    
    @Override
    public void insert(MatHang entity) {

        JdbcHelper.update(INSERT_SQL,
                entity.getTenMH(), entity.getSoLuong(), entity.getDonVi(), entity.getDonGia(), entity.getTrangThai(), entity.getNgayNhap(), entity.getNgayXuat(), entity.getMaNV(), entity.getMaDV());

    }

    @Override
    public void update(MatHang entity) {

        JdbcHelper.update(UPDATE_SQL,
                entity.getMaMH(), entity.getTenMH(), entity.getSoLuong(), entity.getDonVi(), entity.getDonGia(),
                entity.getTrangThai(), entity.getNgayNhap(), entity.getNgayXuat(),entity.getMaNV(), entity.getMaDV(), entity.getMaMH());

    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<MatHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MatHang selectById(String key) {
        List<MatHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<MatHang> selectBySql(String sql, Object... args) {
        List<MatHang> list = new ArrayList<MatHang>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                MatHang entity = new MatHang();
                entity.setMaMH(rs.getInt("MaMH"));
                entity.setTenMH(rs.getString("TenMH"));                
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setDonVi(rs.getDouble("DonVi"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setNgayNhap(rs.getDate("NgayNhap"));
                entity.setNgayXuat(rs.getDate("NgayXuat"));
                entity.setMaDV(rs.getString("MaDV"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public List<MatHang> selectByDichVu(String madv) {
        String sql = "select * from MatHang where MaDV=?";
        return this.selectBySql(sql, madv);
    }
    
    public List<Integer> selectYear() {
        String sql = "select DISTINCT year(NgayKG) from KhoaHoc ORDER BY year(NgayKG) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    
}
