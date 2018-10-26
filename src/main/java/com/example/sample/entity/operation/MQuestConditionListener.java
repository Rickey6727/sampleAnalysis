package com.example.sample.entity.operation;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class MQuestConditionListener implements EntityListener<MQuestCondition> {

    @Override
    public void preInsert(MQuestCondition entity, PreInsertContext<MQuestCondition> context) {
    }

    @Override
    public void preUpdate(MQuestCondition entity, PreUpdateContext<MQuestCondition> context) {
    }

    @Override
    public void preDelete(MQuestCondition entity, PreDeleteContext<MQuestCondition> context) {
    }

    @Override
    public void postInsert(MQuestCondition entity, PostInsertContext<MQuestCondition> context) {
    }

    @Override
    public void postUpdate(MQuestCondition entity, PostUpdateContext<MQuestCondition> context) {
    }

    @Override
    public void postDelete(MQuestCondition entity, PostDeleteContext<MQuestCondition> context) {
    }
}