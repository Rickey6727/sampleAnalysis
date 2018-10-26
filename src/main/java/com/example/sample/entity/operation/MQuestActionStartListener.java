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
public class MQuestActionStartListener implements EntityListener<MQuestActionStart> {

    @Override
    public void preInsert(MQuestActionStart entity, PreInsertContext<MQuestActionStart> context) {
    }

    @Override
    public void preUpdate(MQuestActionStart entity, PreUpdateContext<MQuestActionStart> context) {
    }

    @Override
    public void preDelete(MQuestActionStart entity, PreDeleteContext<MQuestActionStart> context) {
    }

    @Override
    public void postInsert(MQuestActionStart entity, PostInsertContext<MQuestActionStart> context) {
    }

    @Override
    public void postUpdate(MQuestActionStart entity, PostUpdateContext<MQuestActionStart> context) {
    }

    @Override
    public void postDelete(MQuestActionStart entity, PostDeleteContext<MQuestActionStart> context) {
    }
}