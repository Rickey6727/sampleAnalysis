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
public class MSurveyAnswerListener implements EntityListener<MSurveyAnswer> {

    @Override
    public void preInsert(MSurveyAnswer entity, PreInsertContext<MSurveyAnswer> context) {
    }

    @Override
    public void preUpdate(MSurveyAnswer entity, PreUpdateContext<MSurveyAnswer> context) {
    }

    @Override
    public void preDelete(MSurveyAnswer entity, PreDeleteContext<MSurveyAnswer> context) {
    }

    @Override
    public void postInsert(MSurveyAnswer entity, PostInsertContext<MSurveyAnswer> context) {
    }

    @Override
    public void postUpdate(MSurveyAnswer entity, PostUpdateContext<MSurveyAnswer> context) {
    }

    @Override
    public void postDelete(MSurveyAnswer entity, PostDeleteContext<MSurveyAnswer> context) {
    }
}