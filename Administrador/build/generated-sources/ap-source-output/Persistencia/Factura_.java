package Persistencia;

import Persistencia.Linea;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T00:00:57")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile CollectionAttribute<Factura, Linea> lineas;
    public static volatile SingularAttribute<Factura, Integer> total;
    public static volatile SingularAttribute<Factura, Integer> IdReserva;
    public static volatile SingularAttribute<Factura, String> nickCliente;
    public static volatile SingularAttribute<Factura, Long> id;
    public static volatile SingularAttribute<Factura, Date> FechaGenerada;

}