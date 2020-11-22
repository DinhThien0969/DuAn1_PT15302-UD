package DAO;

import Entity.DichVu;
import JdbcHelper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DichVuDAO extends EduSysDAO<DichVu, String> {

    String INSERT_SQL = "INSERT INTO DichVu(MaDV, LoaiDV, DonVi, DonGia, MoTa) VALUES(?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE DichVu SET LoaiDV=?, DonVi=?, DonGia=?, MoTa=? WHERE MaDV=?";
    String DELETE_SQL = "DELETE FROM DichVu WHERE MaDV=?";
    String SELECT_ALL_SQL = "SELECT*FROM DichVu";
    String SELECT_BY_ID_SQL = "SELECT*FROM DichVu WHERE MaDV=?";

    @Override
    public void insert(DichVu entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaDV(), entity.getLoaiDV(), entity.getDonVi(), entity.getDonGia(), entity.getMoTa());
    }

    @Override
    public void update(DichVu entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMaDV(), entity.getLoaiDV(), entity.getDonVi(), entity.getDonGia(), entity.getMoTa());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<DichVu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DichVu selectById(String key) {
        List<DichVu> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DichVu entity = new DichVu();
                entity.setMaDV(rs.getString("MaDV"));
                entity.setLoaiDV(rs.getString("LoaiDV"));
                entity.setDonVi(rs.getDouble("DonVi"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
    
      public List<DichVu> select(){ 
          String sql="SELECT * FROM chuyenDe";
          return selectBySql(sql);
      }
      public DichVu findById(String madv) {
            String sql = "SELECT * FROM DichVu WHERE MaDV=?";
            List<DichVu> list = selectBySql(sql, madv);
            return list.size() > 0 ? list.get(0) : null;
        }
}
