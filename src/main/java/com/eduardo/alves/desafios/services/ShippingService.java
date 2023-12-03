package com.eduardo.alves.desafios.services;

import com.eduardo.alves.desafios.entities.Order;

public class ShippingService {

    public double shipment(Order order) {

        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0.0;
        }

    }
}
