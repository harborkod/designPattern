package org.example.creational.factorymethod.demo_logistics.concreteProduct;

import org.example.creational.factorymethod.demo_logistics.product.Transport;

/**
 * @author : [ zhouge ]
 * @version : [ v1.0 ]
 * @className : Truck
 * @description : [ 交通工具-卡车 ]
 * @email : [ zhouge@ubox.cn ]
 * @createTime : [ 2024/6/18 17:18 ]
 * @updateUser : [ zhouge ]
 * @updateTime : [ 2024/6/18 17:18 ]
 * @updateRemark : [ 暂无修改 ]
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
