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
public class MSurveyQuestionListener implements EntityListener<MSurveyQuestion> {

    @Override
    public void preInsert(MSurveyQuestion entity, PreInsertContext<MSurveyQuestion> context) {
    }

    @Override
    public void preUpdate(MSurveyQuestion entity, PreUpdateContext<MSurveyQuestion> context) {
    }

    @Override
    public void preDelete(MSurveyQuestion entity, PreDeleteContext<MSurveyQuestion> context) {
    }

    @Override
    public void postInsert(MSurveyQuestion entity, PostInsertContext<MSurveyQuestion> context) {
    }

    @Override
    public void postUpdate(MSurveyQuestion entity, PostUpdateContext<MSurveyQuestion> context) {
    }

    @Override
    public void postDelete(MSurveyQuestion entity, PostDeleteContext<MSurveyQuestion> context) {
    }
}