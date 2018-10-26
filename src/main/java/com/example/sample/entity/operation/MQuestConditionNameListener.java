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
public class MQuestConditionNameListener implements EntityListener<MQuestConditionName> {

    @Override
    public void preInsert(MQuestConditionName entity, PreInsertContext<MQuestConditionName> context) {
    }

    @Override
    public void preUpdate(MQuestConditionName entity, PreUpdateContext<MQuestConditionName> context) {
    }

    @Override
    public void preDelete(MQuestConditionName entity, PreDeleteContext<MQuestConditionName> context) {
    }

    @Override
    public void postInsert(MQuestConditionName entity, PostInsertContext<MQuestConditionName> context) {
    }

    @Override
    public void postUpdate(MQuestConditionName entity, PostUpdateContext<MQuestConditionName> context) {
    }

    @Override
    public void postDelete(MQuestConditionName entity, PostDeleteContext<MQuestConditionName> context) {
    }
}