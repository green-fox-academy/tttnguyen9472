public class BlogPost {

    //    Create a BlogPost class that has
    //            an authorName
    //            a title
    //            a text
    //            a publicationDate
    //            Create a few blog post objects:
    //            "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    //                  Lorem ipsum dolor sit amet.
    //            "Wait but why" titled by Tim Urban posted at "2010.10.10."
    //                  A popular long-form, stick-figure-illustrated blog about almost everything.
    //            "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    //                   Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
    //                   When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public static void main(String[] args) {


        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
        blogPost1.text = "Lorem ipsum dolor sit amet.";

        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "2010.10.10.");
        blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.");
        blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        Blog blog = new Blog();
        blog.blogPostList.add(blogPost1);
        blog.blogPostList.add(blogPost2);
        blog.blogPostList.add(blogPost3);

    }
}


