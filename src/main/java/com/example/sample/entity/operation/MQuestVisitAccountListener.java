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
public class MQuestVisitAccountListener implements EntityListener<MQuestVisitAccount> {

    @Override
    public void preInsert(MQuestVisitAccount entity, PreInsertContext<MQuestVisitAccount> context) {
    }

    @Override
    public void preUpdate(MQuestVisitAccount entity, PreUpdateContext<MQuestVisitAccount> context) {
    }

    @Override
    public void preDelete(MQuestVisitAccount entity, PreDeleteContext<MQuestVisitAccount> context) {
    }

    @Override
    public void postInsert(MQuestVisitAccount entity, PostInsertContext<MQuestVisitAccount> context) {
    }

    @Override
    public void postUpdate(MQuestVisitAccount entity, PostUpdateContext<MQuestVisitAccount> context) {
    }

    @Override
    public void postDelete(MQuestVisitAccount entity, PostDeleteContext<MQuestVisitAccount> context) {
    }
}