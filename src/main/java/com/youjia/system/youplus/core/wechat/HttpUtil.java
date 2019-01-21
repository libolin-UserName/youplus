package com.youjia.system.youplus.core.wechat;

import com.youjia.system.youplus.global.util.FastJsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author wuweifeng wrote on 2018/8/2.
 */
@Component
public class HttpUtil {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Resource
    private RestTemplate restTemplate;

    public String build(String url, Map<String, Object> map) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
        logger.info(FastJsonUtils.convertObjectToJSON(map));
        HttpEntity<String> requestEntity = new HttpEntity<>(FastJsonUtils.convertObjectToJSON(map), httpHeaders);
        String sttr = restTemplate.postForEntity(url, requestEntity,
                String.class)
                .getBody();
        logger.info("返回的结果是：" + sttr);
        return sttr;
    }

}
