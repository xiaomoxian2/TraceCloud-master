package com.tracecloud.producer.dao;

import com.tracecloud.producer.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @Version V1.0
 */
public interface ProducerCloudDao extends JpaRepository<Goods, Long> {
}
