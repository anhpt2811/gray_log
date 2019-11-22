package ascendcorp.com.order.mapper;

import ascendcorp.com.order.entity.VerifyOrderEntity;
import ascendcorp.com.order.entity.VerifyOrderEntity.VerifyOrderEntityBuilder;
import ascendcorp.com.order.model.VerifyOrder;
import ascendcorp.com.order.model.VerifyOrder.VerifyOrderBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class VerifyOrderMapperImpl extends VerifyOrderMapper {

    @Override
    public VerifyOrderEntity transform(VerifyOrder object) {
        if ( object == null ) {
            return null;
        }

        VerifyOrderEntityBuilder verifyOrderEntity = VerifyOrderEntity.builder();

        verifyOrderEntity.id( object.getId() );
        verifyOrderEntity.oldStatus( object.getOldStatus() );
        verifyOrderEntity.newStatus( object.getNewStatus() );

        return verifyOrderEntity.build();
    }

    @Override
    public VerifyOrder transform(VerifyOrderEntity object) {
        if ( object == null ) {
            return null;
        }

        VerifyOrderBuilder verifyOrder = VerifyOrder.builder();

        return verifyOrder.build();
    }
}
