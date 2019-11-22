package ascendcorp.com.order.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderEntity.class)
public abstract class OrderEntity_ extends ascendcorp.com.order.entity.BaseEntity_ {

	public static volatile SingularAttribute<OrderEntity, String> id;
	public static volatile SingularAttribute<OrderEntity, String> message;
	public static volatile SingularAttribute<OrderEntity, Long> value;
	public static volatile SingularAttribute<OrderEntity, String> status;

	public static final String ID = "id";
	public static final String MESSAGE = "message";
	public static final String VALUE = "value";
	public static final String STATUS = "status";

}

