package cn.jastz.post.service;

import cn.jastz.post.entity.Post;
import cn.jastz.post.form.PostCommentAddForm;
import cn.jastz.post.mapper.PostCommentMapper;
import cn.jastz.post.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zhiwen
 */
@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private PostCommentMapper postCommentMapper;

    public boolean addPost(Post post) {
        return postMapper.insert(post) > 0;
    }

    public boolean addPostComment(PostCommentAddForm postCommentAddForm) {
        postCommentAddForm.setCreatedTime(new Date());
        return postCommentMapper.insert(postCommentAddForm) > 0;
    }
}
