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
public class MSurveyListener implements EntityListener<MSurvey> {

    @Override
    public void preInsert(MSurvey entity, PreInsertContext<MSurvey> context) {
    }

    @Override
    public void preUpdate(MSurvey entity, PreUpdateContext<MSurvey> context) {
    }

    @Override
    public void preDelete(MSurvey entity, PreDeleteContext<MSurvey> context) {
    }

    @Override
    public void postInsert(MSurvey entity, PostInsertContext<MSurvey> context) {
    }

    @Override
    public void postUpdate(MSurvey entity, PostUpdateContext<MSurvey> context) {
    }

    @Override
    public void postDelete(MSurvey entity, PostDeleteContext<MSurvey> context) {
    }
}