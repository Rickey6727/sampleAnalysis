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
public class MSurveyAnswerCountryListener implements EntityListener<MSurveyAnswerCountry> {

    @Override
    public void preInsert(MSurveyAnswerCountry entity, PreInsertContext<MSurveyAnswerCountry> context) {
    }

    @Override
    public void preUpdate(MSurveyAnswerCountry entity, PreUpdateContext<MSurveyAnswerCountry> context) {
    }

    @Override
    public void preDelete(MSurveyAnswerCountry entity, PreDeleteContext<MSurveyAnswerCountry> context) {
    }

    @Override
    public void postInsert(MSurveyAnswerCountry entity, PostInsertContext<MSurveyAnswerCountry> context) {
    }

    @Override
    public void postUpdate(MSurveyAnswerCountry entity, PostUpdateContext<MSurveyAnswerCountry> context) {
    }

    @Override
    public void postDelete(MSurveyAnswerCountry entity, PostDeleteContext<MSurveyAnswerCountry> context) {
    }
}