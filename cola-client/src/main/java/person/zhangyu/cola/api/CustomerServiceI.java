package person.zhangyu.cola.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import person.zhangyu.cola.dto.CustomerAddCmd;
import person.zhangyu.cola.dto.CustomerListByNameQry;
import person.zhangyu.cola.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
