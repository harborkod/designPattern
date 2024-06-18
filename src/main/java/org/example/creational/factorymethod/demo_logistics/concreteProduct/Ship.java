package org.example.creational.factorymethod.demo_logistics.concreteProduct;

import org.example.creational.factorymethod.demo_logistics.product.Transport;

/**
 * @author : [ zhouge ]
 * @version : [ v1.0 ]
 * @className : Ship
 * @description : [ Description ]
 * @email : [ zhouge@ubox.cn ]
 * @createTime : [ 2024/6/18 17:19 ]
 * @updateUser : [ zhouge ]
 * @updateTime : [ 2024/6/18 17:19 ]
 * @updateRemark : [ 暂无修改 ]
 */
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
