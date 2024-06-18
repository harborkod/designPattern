package org.example.creational.factorymethod.demo_logistics.concreteFactory;

import org.example.creational.factorymethod.demo_logistics.concreteProduct.Ship;
import org.example.creational.factorymethod.demo_logistics.product.Transport;
import org.example.creational.factorymethod.demo_logistics.factory.TransportFactory;

/**
 * @author : [ zhouge ]
 * @version : [ v1.0 ]
 * @className : SeaTransportFactory
 * @description : [ Description ]
 * @email : [ zhouge@ubox.cn ]
 * @createTime : [ 2024/6/18 17:23 ]
 * @updateUser : [ zhouge ]
 * @updateTime : [ 2024/6/18 17:23 ]
 * @updateRemark : [ 暂无修改 ]
 */
public class SeaTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
