package person.zhangyu.cola.controller;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import person.zhangyu.cola.api.CustomerServiceI;
import person.zhangyu.cola.dto.CustomerAddCmd;
import person.zhangyu.cola.dto.CustomerListByNameQry;
import person.zhangyu.cola.dto.domainmodel.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @GetMapping(value = "/customer")
    public MultiResponse<Customer> listCustomerByName(@RequestParam String name){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd){
        return customerService.addCustomer(customerAddCmd);
    }
}
