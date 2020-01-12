
package server;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.PathParam;
import java.lang.String;
import java.util.ArrayList;



@Path("/Server")

public class Server {
    serverhall hall = new serverhall();
    List<String> mylist = serverhall.connectToAndQueryDatabase();
    Object[] Return = mylist.toArray();
    
    @GET
    @Path("values/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Return getid(@PathParam("id") int id){
        Return res = new Return();
        serverhall.connectToAndQueryDatabase();
        System.out.println(Return);
        for(Return b : mylist){
            if(b.getId() == id){
                res = b;
            }
        }
        return res;
    }
    
    @GET
    @Path("values/{Temperatur}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Return gettemperatur(@PathParam("Temperatur") int Temperatur){
        Return res = new Return();
        serverhall.connectToAndQueryDatabase();
        
        for(Return b : mylist){
            if(b.gettemperatur() == Temperatur){
                res = b;
            }
        }
        return res;
    }
    
    @GET
    @Path("values/{Elförbrukning}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Return getelförbruknig(@PathParam("Elförbrukning") int Elförbrukning){
        Return res = new Return();
        serverhall.connectToAndQueryDatabase();
        
        for(Return b : mylist){
            if(b.getelförbruknig() == Elförbrukning){
                res = b;
            }
        }
        return res;
    }
    
    @GET
    @Path("values/{Elkostnad}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Return getelkostnad(@PathParam("Elkostnad") int Elkostnad){
        Return res = new Return();
        serverhall.connectToAndQueryDatabase();
        
        for(Return b : mylist){
            if(b.getelkostnad() == Elkostnad){
                res = b;
            }
        }
        return res;
    }
    
     @GET
    @Path("values/{getall}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Return getall(@PathParam("getall") int getall){
        Return res = new Return();
        serverhall.connectToAndQueryDatabase();
        
        for(Return b : mylist){
            if(b.getall() == Elkostnad){
                res = b;
            }
        }
        return res;
    }
   
    
//    public Return getall(@PathParam("id") int id){
//        Return res = new Return();
//        serverhall.connectToAndQueryDatabase();
//        
//        for(Return b : values){
//            if(b.getid() == id){
//                res = b;
//            }
//            return res;
//        }
//    }
    
    
}    