  
package mongocrud;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.net.UnknownHostException;


public class Coneccion {
    
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();
    
    /**
     *
     */
    public Coneccion(){
        Mongo mongo = new Mongo("localhost", 27017);
        BaseDatos = mongo.getDB("crudAct6");
        coleccion = BaseDatos.getCollection("Actividades501");
        System.out.println("Conexion exitosa");
    }
    public boolean insertar (String accion){
        document.put("accion", accion);
        coleccion. insert (document) ;
        return true;

    }
    public void Mostrar(){
        DBCursor cursor = coleccion.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
    }
    }
    public boolean Actualizar(String accionVieja, String accionNueva){
        document.put("accion",accionVieja) ;
        BasicDBObject documentoNuevo = new BasicDBObject();
        documentoNuevo.put("accion", accionNueva) ;
        coleccion.findAndModify(document, documentoNuevo);
        return true;
    }
    public boolean eliminar(String accion){
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
}

