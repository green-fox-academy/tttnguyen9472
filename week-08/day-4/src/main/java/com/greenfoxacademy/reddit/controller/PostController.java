package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("postList", postService.getTenPosts());
        return "index";
    }

    @GetMapping("/submit")
    public String submitPage(){
        return "submit-post";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post){
        postService.savePost(post);
        return "redirect:/";
    }

    @GetMapping("/actual-post/{id}")
    public String actualPost(@PathVariable Long id, Model model){
        model.addAttribute("actualPost", postService.getPostById(id));
        return "actual-post";
    }

    @GetMapping("/upvote/{id}")
    public String upvotePost(@PathVariable Long id, @ModelAttribute Post post){
        postService.upvotePost(id);
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downvotePost(@PathVariable Long id,@ModelAttribute Post post){
        postService.downvotePost(id);
        return "redirect:/";
    }

    @GetMapping("/popular")
    public String popularPostFirst(Model model) {
        model.addAttribute("postList", postService.getPopularFirst());
        model.addAttribute("postList", postService.getTenPosts());
        return "index";
    }

    @GetMapping("/newest")
    public String newestPostFirst(Model model) {
        model.addAttribute("postList", postService.getNewestFirst());
        return "index";
    }

    @GetMapping("/oldest")
    public String oldestPostFirst(Model model) {
        model.addAttribute("postList", postService.getOldestFirst());
        return "index";
    }

    @PostMapping("/")
    public String nextPage(@RequestParam(value = "page", defaultValue = "0")Integer pageNumber, @ModelAttribute Post post, Model model){
        model.addAttribute("postList", postService.getTenPosts());

        return "redirect:/?page=" + pageNumber;
    }
}
