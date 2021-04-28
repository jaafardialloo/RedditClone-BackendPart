package Reddit.RedditClone.repository;

import Reddit.RedditClone.model.Post;
import Reddit.RedditClone.model.Subreddit;
import Reddit.RedditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
