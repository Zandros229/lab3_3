
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.Time;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.PortableServer.POAManagerPackage.State;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import java.time.temporal.TemporalAmount;

public class OrderTest {
    private Order order;

    @Test
    public void orderExpiredDateThrowIfCanceldTest() {
        DateTime dateTime=new DateTime();
        Time time=new Time(dateTime);
        order = new Order(time);
        order.submit();
        time.changeTime(new DateTime(2019,6,29,10,10));
        Assertions.assertThrows(OrderExpiredException.class, () -> order.confirm());
    }

    @Test
    public void orderExpiredDateThrowExceptionTest() {
        Time time=new Time(new DateTime());
        order = new Order(time);
        order.submit();
        Assertions.assertEquals(Order.State.SUBMITTED,order.getOrderState());
    }
}
