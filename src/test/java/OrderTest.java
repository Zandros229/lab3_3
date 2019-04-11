
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public void orderExpiredDateTest() {
        order = new Order();
        order.submit();
        Assertions.assertThrows(OrderExpiredException.class, () -> order.confirm());
    }
}
