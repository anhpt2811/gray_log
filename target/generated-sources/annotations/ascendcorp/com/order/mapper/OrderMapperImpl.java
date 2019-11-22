package ascendcorp.com.order.mapper;

import ascendcorp.com.order.entity.OrderEntity;
import ascendcorp.com.order.entity.OrderEntity.OrderEntityBuilder;
import ascendcorp.com.order.model.Order;
import ascendcorp.com.order.model.Order.OrderBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class OrderMapperImpl extends OrderMapper {

    @Override
    public OrderEntity transform(Order object) {
        if ( object == null ) {
            return null;
        }

        OrderEntityBuilder orderEntity = OrderEntity.builder();

        orderEntity.id( object.getId() );
        orderEntity.value( object.getValue() );
        orderEntity.status( object.getStatus() );
        orderEntity.message( object.getMessage() );

        return orderEntity.build();
    }

    @Override
    public Order transform(OrderEntity object) {
        if ( object == null ) {
            return null;
        }

        OrderBuilder order = Order.builder();

        order.id( object.getId() );
        order.message( object.getMessage() );
        order.status( object.getStatus() );
        order.value( object.getValue() );

        return order.build();
    }
}
