package bootcampsantander.dio.wsnews.data.remote;

import java.util.List;

import bootcampsantander.dio.wsnews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {
    @GET("news.json")
    Call<List<News>> getNews();
}
