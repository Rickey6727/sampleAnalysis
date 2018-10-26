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
public class TGuildChatHistoryListener implements EntityListener<TGuildChatHistory> {

    @Override
    public void preInsert(TGuildChatHistory entity, PreInsertContext<TGuildChatHistory> context) {
    }

    @Override
    public void preUpdate(TGuildChatHistory entity, PreUpdateContext<TGuildChatHistory> context) {
    }

    @Override
    public void preDelete(TGuildChatHistory entity, PreDeleteContext<TGuildChatHistory> context) {
    }

    @Override
    public void postInsert(TGuildChatHistory entity, PostInsertContext<TGuildChatHistory> context) {
    }

    @Override
    public void postUpdate(TGuildChatHistory entity, PostUpdateContext<TGuildChatHistory> context) {
    }

    @Override
    public void postDelete(TGuildChatHistory entity, PostDeleteContext<TGuildChatHistory> context) {
    }
}