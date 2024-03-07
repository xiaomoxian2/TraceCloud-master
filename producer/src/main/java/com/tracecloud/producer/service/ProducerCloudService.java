package com.tracecloud.producer.service;

import com.tracecloud.producer.dao.ProducerCloudDao;
import com.tracecloud.producer.entity.Goods;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Version V1.0
 */
@Service
public class ProducerCloudService {

    @Resource
    private ProducerCloudDao producerCloudDao;

    public List<Goods> list() {
        return producerCloudDao.findAll();
    }

}
