public class NewsChannel {
    private String news;

    public void update(String news) {
        this.news = news;
        System.out.println("News Channel received news: " + news);
    }
}
