package mx.sisu.challengueajax.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sisu.challengueajax.entities.Pais;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-06T19:54:44")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Long> id;
    public static volatile SingularAttribute<Estado, String> nombre;
    public static volatile SingularAttribute<Estado, Pais> pais;

}