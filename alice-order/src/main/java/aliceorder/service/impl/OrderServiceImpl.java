package aliceorder.service.impl;

import aliceorder.dao.OrderMapper;
import aliceorder.service.OrderService;
import com.alice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Override
    public int addOrder(Order order) {
        order.setCreateTime(new Date());
        return orderMapper.insertSelective(order);
    }
}
