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
public class MQuestMessageListener implements EntityListener<MQuestMessage> {

    @Override
    public void preInsert(MQuestMessage entity, PreInsertContext<MQuestMessage> context) {
    }

    @Override
    public void preUpdate(MQuestMessage entity, PreUpdateContext<MQuestMessage> context) {
    }

    @Override
    public void preDelete(MQuestMessage entity, PreDeleteContext<MQuestMessage> context) {
    }

    @Override
    public void postInsert(MQuestMessage entity, PostInsertContext<MQuestMessage> context) {
    }

    @Override
    public void postUpdate(MQuestMessage entity, PostUpdateContext<MQuestMessage> context) {
    }

    @Override
    public void postDelete(MQuestMessage entity, PostDeleteContext<MQuestMessage> context) {
    }
}