import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    protected String id;
    protected String text;
    protected String type;
    protected String user;
    protected Boolean upvotes;

    public Post(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Boolean upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Post" + "" +
                "\n  id=" + id +
                "\n  text=" + text +
                "\n  type=" + type +
                "\n  user=" + user;
    }
}
