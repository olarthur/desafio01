package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double v = 0;

        if (order.getBasic() < 100) {
            v += 20;
        } else if (order.getBasic() <= 200) {
            v += 12;
        }

        return v;
    }
}
