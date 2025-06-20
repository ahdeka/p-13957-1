package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Long count() {
        return postRepository.count();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findById(int i) {
        return postRepository.findById(i);
    }

    public void modify(Post post, String title, String content) {
        post.setTitle(title);
        post.setContent(content);

        postRepository.save(post);
        // UPDATE post SET title = ?, content = ?, modify_date = ? WHERE id = ?;
    }
}
