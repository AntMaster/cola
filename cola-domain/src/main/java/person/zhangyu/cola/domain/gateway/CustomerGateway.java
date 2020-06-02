package person.zhangyu.cola.domain.gateway;

import person.zhangyu.cola.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
