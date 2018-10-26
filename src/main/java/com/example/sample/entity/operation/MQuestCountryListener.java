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
public class MQuestCountryListener implements EntityListener<MQuestCountry> {

    @Override
    public void preInsert(MQuestCountry entity, PreInsertContext<MQuestCountry> context) {
    }

    @Override
    public void preUpdate(MQuestCountry entity, PreUpdateContext<MQuestCountry> context) {
    }

    @Override
    public void preDelete(MQuestCountry entity, PreDeleteContext<MQuestCountry> context) {
    }

    @Override
    public void postInsert(MQuestCountry entity, PostInsertContext<MQuestCountry> context) {
    }

    @Override
    public void postUpdate(MQuestCountry entity, PostUpdateContext<MQuestCountry> context) {
    }

    @Override
    public void postDelete(MQuestCountry entity, PostDeleteContext<MQuestCountry> context) {
    }
}