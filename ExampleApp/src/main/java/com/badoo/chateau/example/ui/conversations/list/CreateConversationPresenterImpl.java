package com.badoo.chateau.example.ui.conversations.list;

import com.badoo.barf.mvp.BasePresenter;
import com.badoo.chateau.example.ui.conversations.list.CreateConversationPresenter.CreateConversationFlowListener;
import com.badoo.chateau.example.ui.conversations.list.CreateConversationPresenter.CreateConversationView;

/**
 * Implementation of CreateConversationPresenter which delegates the operation to the flow listener
 */
public class CreateConversationPresenterImpl extends BasePresenter<CreateConversationView, CreateConversationFlowListener> implements CreateConversationPresenter {

    @Override
    public void onCreateNewConversationClicked() {
        getFlowListener().requestCreateNewConversation();
    }

}
