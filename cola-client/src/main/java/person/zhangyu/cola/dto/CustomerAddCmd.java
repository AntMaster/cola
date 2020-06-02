package person.zhangyu.cola.dto;

import com.alibaba.cola.dto.Command;
import person.zhangyu.cola.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
