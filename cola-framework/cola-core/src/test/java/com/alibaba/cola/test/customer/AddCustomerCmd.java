package com.alibaba.cola.test.customer;


import com.alibaba.cola.dto.Command;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * AddCustomerCmd
 *
 * @author Frank Zhang 2018-01-06 7:28 PM
 */
@Data
public class AddCustomerCmd extends Command {

    @NotNull
    @Valid
    private CustomerCO customerCO;
}
