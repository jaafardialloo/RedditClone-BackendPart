package Reddit.RedditClone.repository;

import Reddit.RedditClone.model.Comment;
import Reddit.RedditClone.model.Post;
import Reddit.RedditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
