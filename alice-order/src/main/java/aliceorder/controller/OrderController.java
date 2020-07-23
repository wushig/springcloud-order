package aliceorder.controller;

import aliceorder.service.OrderProductService;
import aliceorder.service.OrderService;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosProperty;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.naming.NamingService;
import com.alice.entity.Order;
import com.alice.entity.RespData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.UUID;

@RestController
@Slf4j
@RefreshScope
public class OrderController {

    @Resource
    private OrderService orderService;
    @NacosInjected
    private ConfigService configService;
    @Autowired
    private OrderProductService orderProductService;

    @Value("${server.port}")
    private String test;
    @PostMapping("addOrder")
    public RespData addOrder(Order order){
        try {
//            String default_group = configService.getConfig("alice-order-80-dev.yaml", "DEFAULT_GROUP", 5000);
//            log.info(default_group);
            log.info(test);
            order.setOrderNo(UUID.randomUUID().toString());
            orderService.addOrder(order);
            orderProductService.reduceProduct(order.getProductId());
            return new RespData<Order>("200","操作成功",order);
        } catch (Exception e) {
            e.printStackTrace();
            return  new RespData<Order>("500",e.getMessage(),order);
        }
    }





}
