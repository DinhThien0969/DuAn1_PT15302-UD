
package LopTienIch;

import Entity.KhachHangBean;
import java.util.List;
import DAO.ThongKeDAO;
import DAO.ThongKeDAOImpl;
import Entity.MathangBean;


public class ThongKeServiceImpl implements ThongKeService{

    ThongKeDAO thongKeDAO = null;
    public ThongKeServiceImpl(){
        thongKeDAO = new ThongKeDAOImpl();
    }
    @Override
    public List<KhachHangBean> getListByKhachHang() {
        return thongKeDAO.getListByKhachHang();
    }

    @Override
    public List<MathangBean> getListByMatHang() {
        return  thongKeDAO.getListByMatHang();
    }
    
}
