/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import domain.MeasurementUnit;
import domain.Product;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class ProductTableModel extends AbstractTableModel{
    
    private final List<Product> products;
    private final String[] columns = new String[]{"ID","Name","Quantity","MeasurementUnit","Price with VAT","Price without VAT"};
    private final Class[] columnsType = new Class[]{int.class, String.class, int.class, MeasurementUnit.class, double.class,double.class};
    
    
    public ProductTableModel(List<Product> products) {
        this.products = products;
    }
    
    

    @Override
    public int getRowCount() {
        if(products == null){
            return 0;
        } 
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Product product = products.get(row);
        switch(column){
            case 0: return product.getID();
            case 1: return product.getName();
            case 2: return product.getQuantity(); 
            case 3: return product.getMeasurementUnit(); 
            case 4: return product.getPriceWithVAT(); 
            case 5: return product.getPriceWithoutVAT(); 
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 2 || column == 3 || column == 4 || column == 5;
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        Product product = products.get(row);
        
        switch(column){
            case 2: 
                product.setQuantity(new Integer((int) value));
            break;
            case 3: 
                product.setMeasurementUnit((MeasurementUnit) value);
            break;
            case 4: 
                product.setPriceWithVAT(new Double(value.toString()));
            break;
            case 5: 
                product.setPriceWithoutVAT((double) value);
            break;
        
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnsType[columnIndex];
    }
    
    
    
    
}
