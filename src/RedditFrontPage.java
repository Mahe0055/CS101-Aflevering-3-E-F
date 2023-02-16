import java.util.ArrayList;

public class RedditFrontPage {
    private ArrayList<RedditPost> allReedditPosts;

    public RedditFrontPage () {
        RedditPost post1 = new RedditPost("School Life", "Robert");
        RedditPost post2 = new RedditPost("Life hacks", "Ben");
        RedditPost post3 = new RedditPost("My pet", "Amanda");
        allReedditPosts = new ArrayList<>();
        this.allReedditPosts.add(post1);
        this.allReedditPosts.add(post2);
        this.allReedditPosts.add(post3);
        System.out.println(allReedditPosts);
    }

    public void deletePost(int index) {
    this.allReedditPosts.remove(index);
        System.out.println(this.allReedditPosts);
    }

    @Override
    public String toString() {
        return "RedditFrontPage{" +
                "allReedditPosts=" + allReedditPosts +
                '}';
    }
}

