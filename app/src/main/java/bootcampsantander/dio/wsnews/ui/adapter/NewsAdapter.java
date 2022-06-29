package bootcampsantander.dio.wsnews.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bootcampsantander.dio.wsnews.databinding.NewsItemBinding;
import bootcampsantander.dio.wsnews.domain.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    public List<News> news;
    public NewsAdapter(List<News> news){
        this.news = news;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NewsItemBinding binding = NewsItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = this.news.get(position);
        holder.biding.tvTitle.setText(news.getTitle());
        holder.biding.tvDescription.setText(news.getDescription());
    }

    @Override
    public int getItemCount() {
        return this.news.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final NewsItemBinding biding;

        public ViewHolder(NewsItemBinding binding) {
            super(binding.getRoot());
            this.biding = binding;
        }
    }
}
