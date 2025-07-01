/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

import DBConnection.DBConnect;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HP
 */
public class CetakStrukPembelian {
    private DefaultTableModel tb;
    
    public CetakStrukPembelian(DefaultTableModel tb) {
        this.tb = tb;
    }
    
    public void run() {
        DBConnect db = new DBConnect();
        
        DefaultTableModel reportModel = new DefaultTableModel();
        reportModel.setColumnIdentifiers(new Object[]{
            "name", "harga_jual"
        });
        
        try {
            JasperDesign jd = JRXmlLoader.load("D:\\Fernando Jocevine\\Kampus\\Semester 4\\OOP 2\\Codes\\UAS-OOP\\src\\iReport\\StrukKasir.jrxml");
            
            for (int i = 0; i < tb.getRowCount(); i++) {
                reportModel.addRow(new Object[]{
                    this.tb.getValueAt(i, 3), // name
                    this.tb.getValueAt(i, 4)  // harga_jual
                });
            }
            
            JRTableModelDataSource datas = new JRTableModelDataSource(reportModel);
            
            Map<String, Object> params = new HashMap<>();
            
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint jp = JasperFillManager.fillReport(jr, params, datas);
            
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
