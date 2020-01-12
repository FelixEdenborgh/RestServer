package server;


//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Driver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class serverhall {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        
        
        
        try{
            
            connectToAndQueryDatabase();
        }
        catch(Exception p){
            p.printStackTrace();
            System.out.println("Some thing whent wrong!");
        }
        
        
        
        
        
        
        
        
    }
    
    public static List<String> connectToAndQueryDatabase(){
        String username = "root";
        String password = "Hinsaringen39";
        List<String> mylist = new ArrayList<>();
        int id = 0;
        int temp = 0;
        int elf = 0;
        int elk = 0;
        
        try (Connection con = (Connection) DriverManager.getConnection(" jdbc:MySQL://localhost:3306/systemintergration1database", username, password);){
            if(con != null){
                System.out.println("Connected to database successfully");
            }
            
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, temp, elforbrukning, elkostnad, FROM serverhall");
            
            while(rs.next()){
                id = rs.getInt("id");
                temp = rs.getInt("temp");
                elf = rs.getInt("elforbrukning");
                elk = rs.getInt("elkostnad");
                
                String sid = Integer.toString(id);
                String stemp = Integer.toString(temp);
                String self = Integer.toString(elf);
                String selk = Integer.toString(elk);
                
                mylist.add(sid + stemp + self + selk);
               
            }
            System.out.println(mylist);
            
            
           
            

            
        }catch(Exception e){
            System.out.println("not connected to database");
        }
        return mylist;
    }
    
    

    

    
}
