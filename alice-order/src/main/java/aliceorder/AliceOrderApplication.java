package aliceorder;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@SpringBootApplication
@MapperScan("aliceorder.dao")
@EnableFeignClients
@EnableDiscoveryClient
public class AliceOrderApplication {


	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(AliceOrderApplication.class, args);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+applicationContext.getEnvironment().getProperty("server.port"));
	}



}

