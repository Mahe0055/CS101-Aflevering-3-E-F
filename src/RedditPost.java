import java.time.LocalDate;

public class RedditPost {
    private String title;
    private String author;
    private LocalDate date;
    private int upvoteDownvote;

    public RedditPost(String title, String author) {
        this.title = title;
        this.author = author;
        this.upvoteDownvote = 1;
        this.date = LocalDate.now();
    }

    public void setTitle() {
        this.title = title;
    }
    public String getTitle() {
    return this.title;
    }

    public void setAuthor() {
        this.author = author;

    }
    public String getAuthor() {
    return this.author;
    }

    public void setDate(java.time.LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
    return this.date;
    }

    public void setUpvoteDownvote(int upvoteDownvote) {
        this.upvoteDownvote = upvoteDownvote;
    }

    public int getUpvoteDownvote() {
    return this.upvoteDownvote;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", upvoteDownvote=" + upvoteDownvote +
                '}';
    }
}
