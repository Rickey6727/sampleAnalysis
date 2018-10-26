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
public class MQuestListener implements EntityListener<MQuest> {

    @Override
    public void preInsert(MQuest entity, PreInsertContext<MQuest> context) {
    }

    @Override
    public void preUpdate(MQuest entity, PreUpdateContext<MQuest> context) {
    }

    @Override
    public void preDelete(MQuest entity, PreDeleteContext<MQuest> context) {
    }

    @Override
    public void postInsert(MQuest entity, PostInsertContext<MQuest> context) {
    }

    @Override
    public void postUpdate(MQuest entity, PostUpdateContext<MQuest> context) {
    }

    @Override
    public void postDelete(MQuest entity, PostDeleteContext<MQuest> context) {
    }
}