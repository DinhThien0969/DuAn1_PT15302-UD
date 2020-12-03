
package DAO;

import java.util.List;
import Entity.KhachHangBean;
import Entity.MathangBean;

public interface ThongKeDAO {
    public  List<KhachHangBean> getListByKhachHang();
    
    public List<MathangBean> getListByMatHang();
}
