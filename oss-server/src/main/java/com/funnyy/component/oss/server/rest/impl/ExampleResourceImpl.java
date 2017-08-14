package com.funnyy.component.oss.server.rest.impl;

import com.funnyy.component.oss.api.rest.ExampleResource;
import com.funnyy.component.oss.server.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by sky on 17-6-14.
 */
@Service
@Resource
public class ExampleResourceImpl implements ExampleResource {

    @Override
    public String getApplicationName() {
        return "oss";
    }
}
