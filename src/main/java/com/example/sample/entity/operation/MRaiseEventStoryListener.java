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
public class MRaiseEventStoryListener implements EntityListener<MRaiseEventStory> {

    @Override
    public void preInsert(MRaiseEventStory entity, PreInsertContext<MRaiseEventStory> context) {
    }

    @Override
    public void preUpdate(MRaiseEventStory entity, PreUpdateContext<MRaiseEventStory> context) {
    }

    @Override
    public void preDelete(MRaiseEventStory entity, PreDeleteContext<MRaiseEventStory> context) {
    }

    @Override
    public void postInsert(MRaiseEventStory entity, PostInsertContext<MRaiseEventStory> context) {
    }

    @Override
    public void postUpdate(MRaiseEventStory entity, PostUpdateContext<MRaiseEventStory> context) {
    }

    @Override
    public void postDelete(MRaiseEventStory entity, PostDeleteContext<MRaiseEventStory> context) {
    }
}