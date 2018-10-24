package com.example.sample.entity;

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
public class TSurveyAnswerListener implements EntityListener<TSurveyAnswer> {

    @Override
    public void preInsert(TSurveyAnswer entity, PreInsertContext<TSurveyAnswer> context) {
    }

    @Override
    public void preUpdate(TSurveyAnswer entity, PreUpdateContext<TSurveyAnswer> context) {
    }

    @Override
    public void preDelete(TSurveyAnswer entity, PreDeleteContext<TSurveyAnswer> context) {
    }

    @Override
    public void postInsert(TSurveyAnswer entity, PostInsertContext<TSurveyAnswer> context) {
    }

    @Override
    public void postUpdate(TSurveyAnswer entity, PostUpdateContext<TSurveyAnswer> context) {
    }

    @Override
    public void postDelete(TSurveyAnswer entity, PostDeleteContext<TSurveyAnswer> context) {
    }
}