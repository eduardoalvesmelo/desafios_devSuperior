package com.eduardo.alves.desafios.services;

import com.eduardo.alves.desafios.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Double total(Order order){
        return order.getBasic() - (order.getBasic() * (order.getDiscount()/100));
    }
}
