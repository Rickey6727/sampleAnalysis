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
public class MSurveyQuestionCountryListener implements EntityListener<MSurveyQuestionCountry> {

    @Override
    public void preInsert(MSurveyQuestionCountry entity, PreInsertContext<MSurveyQuestionCountry> context) {
    }

    @Override
    public void preUpdate(MSurveyQuestionCountry entity, PreUpdateContext<MSurveyQuestionCountry> context) {
    }

    @Override
    public void preDelete(MSurveyQuestionCountry entity, PreDeleteContext<MSurveyQuestionCountry> context) {
    }

    @Override
    public void postInsert(MSurveyQuestionCountry entity, PostInsertContext<MSurveyQuestionCountry> context) {
    }

    @Override
    public void postUpdate(MSurveyQuestionCountry entity, PostUpdateContext<MSurveyQuestionCountry> context) {
    }

    @Override
    public void postDelete(MSurveyQuestionCountry entity, PostDeleteContext<MSurveyQuestionCountry> context) {
    }
}