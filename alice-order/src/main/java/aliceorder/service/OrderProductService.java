package aliceorder.service;

import aliceorder.config.FeignConfig;
import com.alice.entity.RespData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="alice-order-product",configuration = FeignConfig.class)
public interface OrderProductService {
    @PostMapping(value = "/reduceProduct")
    RespData reduceProduct(Integer id);
}
