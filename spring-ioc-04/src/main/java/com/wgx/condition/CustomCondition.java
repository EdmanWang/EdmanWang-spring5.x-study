package com.wgx.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 作为条件判断
 */
public class CustomCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (conditionContext.getBeanFactory().containsBean("cat")) {
            return true;
        }
        return false;
    }
}
