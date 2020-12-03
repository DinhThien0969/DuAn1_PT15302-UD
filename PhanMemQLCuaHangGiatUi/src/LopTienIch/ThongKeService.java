
package LopTienIch;

import Entity.KhachHangBean;
import Entity.MathangBean;
import java.util.List;


public interface ThongKeService {
    public  List<KhachHangBean> getListByKhachHang();
    
    public List<MathangBean> getListByMatHang();
}
