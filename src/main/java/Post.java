import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final String Id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public Post(
            @JsonProperty("id") String Id, @JsonProperty("text") String text, @JsonProperty("type") String type, @JsonProperty("user") String user, @JsonProperty("upvotes") Integer upvotes
    ) {
        this.Id = Id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return Id;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Post" +
                "\n Id=" + Id +
                "\n text=" + text +
                "\n type=" + type +
                "\n user=" + user +
                "\n upvotes=" + upvotes;
    }
}