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
public class FooListener implements EntityListener<Foo> {

    @Override
    public void preInsert(Foo entity, PreInsertContext<Foo> context) {
    }

    @Override
    public void preUpdate(Foo entity, PreUpdateContext<Foo> context) {
    }

    @Override
    public void preDelete(Foo entity, PreDeleteContext<Foo> context) {
    }

    @Override
    public void postInsert(Foo entity, PostInsertContext<Foo> context) {
    }

    @Override
    public void postUpdate(Foo entity, PostUpdateContext<Foo> context) {
    }

    @Override
    public void postDelete(Foo entity, PostDeleteContext<Foo> context) {
    }
}