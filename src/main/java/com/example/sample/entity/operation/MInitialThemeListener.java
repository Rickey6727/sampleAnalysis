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
public class MInitialThemeListener implements EntityListener<MInitialTheme> {

    @Override
    public void preInsert(MInitialTheme entity, PreInsertContext<MInitialTheme> context) {
    }

    @Override
    public void preUpdate(MInitialTheme entity, PreUpdateContext<MInitialTheme> context) {
    }

    @Override
    public void preDelete(MInitialTheme entity, PreDeleteContext<MInitialTheme> context) {
    }

    @Override
    public void postInsert(MInitialTheme entity, PostInsertContext<MInitialTheme> context) {
    }

    @Override
    public void postUpdate(MInitialTheme entity, PostUpdateContext<MInitialTheme> context) {
    }

    @Override
    public void postDelete(MInitialTheme entity, PostDeleteContext<MInitialTheme> context) {
    }
}