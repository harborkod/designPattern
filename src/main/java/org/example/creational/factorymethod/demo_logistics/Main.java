package org.example.creational.factorymethod.demo_logistics;

import org.example.creational.factorymethod.demo_logistics.concreteFactory.RoadTransportFactory;
import org.example.creational.factorymethod.demo_logistics.concreteFactory.SeaTransportFactory;
import org.example.creational.factorymethod.demo_logistics.factory.TransportFactory;

/**
 * @author : [ zhouge ]
 * @version : [ v1.0 ]
 * @className : Main
 * @description : [ Description ]
 * @email : [ zhouge@ubox.cn ]
 * @createTime : [ 2024/6/18 17:23 ]
 * @updateUser : [ zhouge ]
 * @updateTime : [ 2024/6/18 17:23 ]
 * @updateRemark : [ 暂无修改 ]
 */
public class Main {
    public static void main(String[] args) {
        TransportFactory roadFactory = new RoadTransportFactory();
        roadFactory.planDelivery();

        TransportFactory seaFactory = new SeaTransportFactory();
        seaFactory.planDelivery();
    }
}
