/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "serverhall")



public class Return  implements Serializable{
    private static long serialVersionUID = 1L;
    private int temperatur;
    private int elförbruknig;
    private int elkostnad;
    private int id;
    serverhall hall = new serverhall();
    
    
    public Return(){}
    
    public Return(int id, String name, String nummer){
        this.id = id;
        this.elförbruknig = elförbruknig;
        this.elkostnad = elkostnad;
        this.temperatur = temperatur;
        
    }
    
    public int getId(){
        return id;
        
    }
    @XmlElement
    public void setId(int id){
        this.id = id;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the namn
     */
    public int gettemperatur() {
        return temperatur;
    }

    public int getelförbruknig(){
        return elförbruknig;
    }
    public int getelkostnad(){
        return elkostnad;
    }
    
    public int getall(){
       
       return id + temperatur + elförbruknig + elkostnad;
    }

}

