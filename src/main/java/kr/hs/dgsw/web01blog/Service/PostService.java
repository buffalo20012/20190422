package kr.hs.dgsw.web01blog.Service;

import kr.hs.dgsw.web01blog.Domain.Post;
import kr.hs.dgsw.web01blog.Protocol.PostUsernameProtocol;

import java.util.List;

public interface PostService {
    List<PostUsernameProtocol> ListAllPost();
    PostUsernameProtocol FindPost(Long id);
    PostUsernameProtocol AddPost(Post post);
    Post UpdatePost(Long id,Post post);
    boolean DeletePost(Long id);
}
