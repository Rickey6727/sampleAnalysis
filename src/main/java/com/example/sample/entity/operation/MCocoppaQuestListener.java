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
public class MCocoppaQuestListener implements EntityListener<MCocoppaQuest> {

    @Override
    public void preInsert(MCocoppaQuest entity, PreInsertContext<MCocoppaQuest> context) {
    }

    @Override
    public void preUpdate(MCocoppaQuest entity, PreUpdateContext<MCocoppaQuest> context) {
    }

    @Override
    public void preDelete(MCocoppaQuest entity, PreDeleteContext<MCocoppaQuest> context) {
    }

    @Override
    public void postInsert(MCocoppaQuest entity, PostInsertContext<MCocoppaQuest> context) {
    }

    @Override
    public void postUpdate(MCocoppaQuest entity, PostUpdateContext<MCocoppaQuest> context) {
    }

    @Override
    public void postDelete(MCocoppaQuest entity, PostDeleteContext<MCocoppaQuest> context) {
    }
}