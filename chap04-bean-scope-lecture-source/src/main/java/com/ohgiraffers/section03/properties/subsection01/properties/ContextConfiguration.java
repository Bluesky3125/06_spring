package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/section03/properties/subsection01/properties/product-info.properties")
public class ContextConfiguration {

    @Value("${bread.carpBread.name}")
    private String carpBreadName;

    @Value("${bread.carpBread.price}")
    private int carpBreadPrice;

    @Value("${beverage.strawberryMilk.name}")
    private String strawberryMilkName;

    @Value("${beverage.strawberryMilk.price}")
    private int strawberryMilkPrice;

    @Value("${beverage.strawberryMilk.capacity}")
    private int strawberryMilkCapacity;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
    }

    @Bean
    public Product strawberryMilk() {
        return new Beverage(strawberryMilkName, strawberryMilkPrice, strawberryMilkCapacity);
    }
}
