package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private PostRepository postRepository;


    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public Post getPostById(Long id) {
        if (postRepository.findById(id).isPresent()) {
            return postRepository.findById(id).get();
        }
        return null;
    }

    public void upvotePost(Long id) {
        if (getPostById(id) != null) {
            getPostById(id).setCounter(getPostById(id).getCounter() + 1);
        }
        savePost(getPostById(id));
    }

    public void downvotePost(Long id) {
        if (getPostById(id) != null) {
            getPostById(id).setCounter(getPostById(id).getCounter() - 1);
        }
        savePost(getPostById(id));
    }

    public List<Post> getPopularFirst() {
        return getAllPosts()
                .stream()
                .sorted(Comparator.comparingInt(Post::getCounter).reversed())
                .collect(Collectors.toList());
    }

    public List<Post> getNewestFirst(){
        return getAllPosts().stream()
                .sorted(Comparator.comparing(Post::getTimestamp).reversed())
                .collect(Collectors.toList());

    }

    public List<Post> getOldestFirst(){
        return getAllPosts().stream()
                .sorted(Comparator.comparing(Post::getTimestamp))
                .collect(Collectors.toList());

    }

    public List<Post> getTenPosts(){
        return getAllPosts().stream()
                .limit(10)
                .collect(Collectors.toList());
    }

}
