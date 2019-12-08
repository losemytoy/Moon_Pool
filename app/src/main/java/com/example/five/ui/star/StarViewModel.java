package com.example.five.ui.star;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is star fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}