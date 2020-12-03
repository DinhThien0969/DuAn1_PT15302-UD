package GiaoDien;

import LopTienIch.ThongKeService;
import LopTienIch.ThongKeServiceImpl;
import java.util.List;
import javax.swing.JPanel;
import Entity.KhachHangBean;
import Entity.MathangBean;
import java.awt.CardLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

public class ThongKeController {

    ThongKeService thongKeService = null;

    public ThongKeController() {
        thongKeService = new ThongKeServiceImpl();
    }

    public void setDateToChart1(JPanel jpnItem) {
        List<KhachHangBean> listItem = thongKeService.getListByKhachHang();
        if (listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (KhachHangBean item : listItem) {
                dataset.addValue(item.getSoLuongKhachHang(), "Khach Hang", item.getNgayDangKy());
            }

            JFreeChart chart = ChartFactory.createBarChart("Thống kê số lượng khách hàng",
                    "Thời gian", "Số lượng", dataset, PlotOrientation.HORIZONTAL, true, true, true);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));

            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }

    public void setDateToChart2(JPanel jpnItem) {
        List<MathangBean> listItem = thongKeService.getListByMatHang();
        if (listItem != null) {
            TaskSeriesCollection ds = new TaskSeriesCollection();
            TaskSeries taskSeries;
            Task task;
            for (MathangBean item : listItem) {
                taskSeries = new TaskSeries(item.getTenMatHang());
                task = new Task(item.getTenMatHang(), item.getNgayNhap(), item.getNgayXuat());
                taskSeries.add(task);
                ds.add(taskSeries);
            }
            JFreeChart chart = ChartFactory.createGanttChart("Thống kê tình trạng mặt hàng",
                    "Mặt hàng", "Thời gian", ds, true, true, true);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));

            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
}
