package bootcampsantander.dio.wsnews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import bootcampsantander.dio.wsnews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        List<News> news = new ArrayList<>();
        news.add(new News("Exemplo A","Isso é a descrição do exemplo A"));
        news.add(new News("Exemplo B","Isso é a descrição do exemplo B"));
        news.add(new News("Exemplo C","Isso é a descrição do exemplo C"));
        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}