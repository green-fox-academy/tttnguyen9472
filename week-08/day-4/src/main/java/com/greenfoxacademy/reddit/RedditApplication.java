package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostService postService;

    @Autowired
    public RedditApplication(PostService postService) {
        this.postService = postService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        postService.savePost(new Post("This sign at my gym"));
//        postService.savePost(new Post("Polish history in on picture"));
//        postService.savePost(new Post("It works as we intended"));
//        postService.savePost(new Post("This sign at my gym"));
    }
}
