package person.zhangyu.cola.domain.gateway;

import person.zhangyu.cola.domain.customer.Customer;
import person.zhangyu.cola.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
