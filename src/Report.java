/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;



/**
 *
 * @author fjz
 */
public class Report {
    Connection conn;
    private String[] columnNames;
    private int column = 0;
    private int row = 0;
    Object[][] cellData;
    
    public Report(){
        try{
            //获取行数
            conn = JavaConnect.ConnecrDb();
            String sqlCountRow = "select count(*) from report";
            Statement stmt = conn.createStatement();
            ResultSet rrow = stmt.executeQuery(sqlCountRow);
            if(rrow.next()){row = rrow.getInt(1);}
            stmt.close();
            rrow.close();
            //获取列数
            String sqlCountColumn = "select * from report";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlCountColumn);
            ResultSetMetaData meta = rs.getMetaData();
            column = meta.getColumnCount();
            stmt.close();
            rs.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        //填入数据
        cellData = new Object[row][column];
        try{    
            String sql = "select * from report";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);  
            int count = 0;
            while(rs.next()){
                for (int i=1; i<=column; i++){
                    cellData[count][i-1] = rs.getString(i);
                }
                count += 1;
            }
            stmt.close();
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
