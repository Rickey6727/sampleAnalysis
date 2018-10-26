package com.example.sample.entity.manage;

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
public class MMoveThemeListener implements EntityListener<MMoveTheme> {

    @Override
    public void preInsert(MMoveTheme entity, PreInsertContext<MMoveTheme> context) {
    }

    @Override
    public void preUpdate(MMoveTheme entity, PreUpdateContext<MMoveTheme> context) {
    }

    @Override
    public void preDelete(MMoveTheme entity, PreDeleteContext<MMoveTheme> context) {
    }

    @Override
    public void postInsert(MMoveTheme entity, PostInsertContext<MMoveTheme> context) {
    }

    @Override
    public void postUpdate(MMoveTheme entity, PostUpdateContext<MMoveTheme> context) {
    }

    @Override
    public void postDelete(MMoveTheme entity, PostDeleteContext<MMoveTheme> context) {
    }
}