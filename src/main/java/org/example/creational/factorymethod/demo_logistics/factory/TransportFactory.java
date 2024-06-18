package org.example.creational.factorymethod.demo_logistics.factory;

import org.example.creational.factorymethod.demo_logistics.product.Transport;

/**
 * @author : [ zhouge ]
 * @version : [ v1.0 ]
 * @className : TransportFactory
 * @description : [ 物流运输工厂 ]
 * @email : [ zhouge@ubox.cn ]
 * @createTime : [ 2024/6/18 17:20 ]
 * @updateUser : [ zhouge ]
 * @updateTime : [ 2024/6/18 17:20 ]
 * @updateRemark : [ 暂无修改 ]
 */
public abstract class TransportFactory {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

}
