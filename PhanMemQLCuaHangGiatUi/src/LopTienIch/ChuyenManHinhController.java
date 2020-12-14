package LopTienIch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "Màn hình chính";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new ManHinhChinhJPanel());
        root.validate();
        root.repaint();
    }

    public void setView2(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "QLHoaDon";
        jpnItem.setBackground(new Color(51,204,255));
        jlbItem.setBackground(new Color(51,204,255));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new FillBangHoaDon());
        root.validate();
        root.repaint();
    }
            
    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public void setEvent2(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent2(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jpbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jpbItem;
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            switch (kind) {
                case "ManHinhChinh":
                    node = new ManHinhChinhJPanel();
                    break;
                case "QLHoaDon":
                    node = new QLHoaDonJPanel();
                    break;
                case "QLKhachHang":
                    node = new QLKhachHangJPanel();
                    break;
                case "QLMatHang":
                    node = new QLMatHangJPanel();
                    break;
                case "QLDichVu":
                    node = new QLDichVuJPanel();
                    break;
                case "QLNhanVien":
                    node = new QLNhanVienJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent me) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if (kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }

    }
    
    class LabelEvent2 implements MouseListener{

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent2(String kind, JPanel jpnItem, JLabel jpbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jpbItem;
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            switch (kind) {                
                case "QLHoaDon":
                    node = new FillBangHoaDon();
                    break;
                case "QLKhachHang":
                    node = new FillBangKhachHang();
                    break;
                case "QLMatHang":
                    node = new FillBangMatHang();
                    break;
                case "QLDichVu":
                    node = new FillBangDichVu();
                    break;
                case "QLNhanVien":
                    node = new FillBangNhanVien();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud2(kind);
        }

        @Override
        public void mousePressed(MouseEvent me) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(51,204,255));
            jlbItem.setBackground(new Color(51,204,255));
        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            jpnItem.setBackground(new Color(51,204,255));
            jlbItem.setBackground(new Color(51,204,255));
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if (kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(255,51,51));
                jlbItem.setBackground(new Color(255,51,51));
            }
        }
        
    }

    private void setChangeBackgroud(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJlb().setBackground(new Color(96, 100, 191));
            } else {
                item.getJpn().setBackground(new Color(76, 175, 80));
                item.getJlb().setBackground(new Color(76, 175, 80));
            }
        }
    }
    
    private void setChangeBackgroud2(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(51,204,255));
                item.getJlb().setBackground(new Color(51,204,255));
            } else {
                item.getJpn().setBackground(new Color(255,51,51));
                item.getJlb().setBackground(new Color(255,51,51));
            }
        }
    }
}
