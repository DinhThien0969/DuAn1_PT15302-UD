
package DAO;

import Entity.HoaDon;
import JdbcHelper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class HoaDonDAO extends EduSysDAO<HoaDon, String> {
    String INSERT_SQL = "INSERT INTO HoaDon(MaHD, NgayNhan, NgayTra, TrangThai, Thanhtien, MaNV, MaKH) VALUES(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDon SET NgayNhan=?, NgayTra=?, TrangThai=?, Thanhtien=? WHERE MaHD=?";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD=?";
    String SELECT_ALL_SQL = "SELECT*FROM HoaDon";
    String SELECT_BY_ID_SQL = "SELECT*FROM HoaDon WHERE MaHD=?";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaHD(),  entity.getNgayNhan(),entity.getNgayTra(), entity.getTrangThai(), 
                entity.getThanhTien()); 
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaHD(),  entity.getNgayNhan(),entity.getNgayTra(), entity.getTrangThai(), 
                entity.getThanhTien());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDon> selectAll() {
        return (List<HoaDon>) this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String key) {
        List<HoaDon> list = (List<HoaDon>) this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                HoaDon entity = new HoaDon();               
               entity.setMaHD(rs.getString("MaHD"));
               entity.setNgayNhan(rs.getDate("NgayNhan"));
               entity.setNgayTra(rs.getDate("NgayTra"));
               entity.setTrangThai(rs.getBoolean("TrangThai"));
               entity.setThanhTien(rs.getDouble("ThanhTien"));
               
               
               list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
