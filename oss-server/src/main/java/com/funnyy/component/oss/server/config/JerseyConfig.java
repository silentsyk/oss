package com.funnyy.component.oss.server.config;

import com.funnyy.component.oss.server.annotation.Resource;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by sky on 17-5-18.
 */
@Configuration
public class JerseyConfig extends ResourceConfig implements ApplicationContextAware {
    private final static Logger logger= LoggerFactory.getLogger(JerseyConfig.class);

    private Map<String,Object> map;

    public JerseyConfig() {

    }

    @PostConstruct
    public void init(){
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Class<? extends Object> clazz = entry.getValue().getClass();//获取到实例对象的class信息
            Class<? extends Object>  [] interfaces = clazz.getInterfaces();
            for(Class<? extends Object>  aInterface : interfaces){
                //接口信息
                logger.info("load rest resource [{}] -> [{}]",entry.getKey(),entry.getValue());
                this.register(aInterface);
            }

        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        map=applicationContext.getBeansWithAnnotation(Resource.class);
    }
}
