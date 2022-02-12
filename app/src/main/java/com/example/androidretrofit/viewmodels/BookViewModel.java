package com.example.androidretrofit.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.androidretrofit.ApiKeys;
import com.example.androidretrofit.model.VolumesResponse;
import com.example.androidretrofit.repositories.BookRepository;

import java.util.ResourceBundle;

public class BookViewModel extends AndroidViewModel {
    public BookViewModel(@NonNull Application application) {
        super(application);
    }
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;
    private ApiKeys apiKeys;

    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
        ResourceBundle context;
        bookRepository.searchVolumes(keyword, author, apiKeys.getGOOGLE_API_KEYS());
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}
