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
public class MQuestLinkedListener implements EntityListener<MQuestLinked> {

    @Override
    public void preInsert(MQuestLinked entity, PreInsertContext<MQuestLinked> context) {
    }

    @Override
    public void preUpdate(MQuestLinked entity, PreUpdateContext<MQuestLinked> context) {
    }

    @Override
    public void preDelete(MQuestLinked entity, PreDeleteContext<MQuestLinked> context) {
    }

    @Override
    public void postInsert(MQuestLinked entity, PostInsertContext<MQuestLinked> context) {
    }

    @Override
    public void postUpdate(MQuestLinked entity, PostUpdateContext<MQuestLinked> context) {
    }

    @Override
    public void postDelete(MQuestLinked entity, PostDeleteContext<MQuestLinked> context) {
    }
}