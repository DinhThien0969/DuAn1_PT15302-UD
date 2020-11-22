
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.DichVu;
import Entity.MatHang;
import JdbcHelper.JdbcHelper;


public class MatHangDAO extends EduSysDAO<MatHang, String>{
    String INSERT_SQL = "insert into MatHang (MaMH, TenMH, SoLuong, TrangThai, MaNV, MaDV) values (?,?,?,?,?,?)";
    String UPDATE_SQL = "update MatHang set TenMH = ?, SoLuong = ?, TrangThai=?, MaNV=?, MaDV=? where MaMH=?";
    String DELETE_SQL = "delete from MatHang where MaMH = ?";
    String SELECT_ALL_SQL = "select * from MatHang";
    String SELECT_BY_ID_SQL = "select * from MatHang where MaMH = ?";

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

    public List<MatHang> selectByDichVu(String madv) {
        String sql = "select * from MatHang where MaDV=?";
        return this.selectBySql(sql, madv);
    }

    @Override
    public void insert(MatHang entity) {

        JdbcHelper.update(INSERT_SQL,
                entity.getMaMH(), entity.getTenMH(), entity.getSoLuong(), entity.getTrangThai(), entity.getMaDV(), entity.getMaNV());

    }

    @Override
    public void update(MatHang entity) {

        JdbcHelper.update(UPDATE_SQL,
                entity.getMaMH(), entity.getTenMH(), entity.getSoLuong(), entity.getTrangThai(), entity.getMaDV(), entity.getMaNV());

    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<MatHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MatHang selectById(String id) {
        List<MatHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<MatHang> selectBySql(String sql, Object... args) {
        List<MatHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                MatHang entity = new MatHang();
                entity.setMaMH(rs.getString("MaMH"));
                entity.setTenMH(rs.getString("TenMH"));                
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));                
                entity.setMaDV(rs.getString("MaDV"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
