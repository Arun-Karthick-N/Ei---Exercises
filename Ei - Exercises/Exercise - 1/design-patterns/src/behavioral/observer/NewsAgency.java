import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<NewsChannel> channels = new ArrayList<>();

    public void addObserver(NewsChannel channel) {
        channels.add(channel);
    }

    public void removeObserver(NewsChannel channel) {
        channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (NewsChannel channel : channels) {
            channel.update(news);
        }
    }
}
