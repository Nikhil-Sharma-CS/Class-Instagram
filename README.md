# Class-Instagram


This is the code for Class-Instagram . Its an assignment of the class hence the class tag. It demonstrate the basic functions of a Instagram.

This also uses **Relational Data** and **JPA** for data source.

This also implements various types of mappings like **One to One**, **One to Many**, etc.



## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 2 classes which uses APIs as mentioned below* :

* ### UserController Class

    * @PostMapping("user/signup")
    * @PostMapping("user/signIn")
    * @DeleteMapping("user/signOut")
    * @PostMapping("post")
    * @DeleteMapping("post")
    * @PostMapping("comment")
    * @DeleteMapping("comment")
    * @PostMapping("like")
    * @GetMapping("like/count/post/{postId}")
    * @DeleteMapping("like")
    * @PostMapping("follow")
    * @DeleteMapping("unfollow/target/{followId}")

## Services
-  *This section contains 8 classes with functions that helps API to perform their specific tasks* : 


* ### AdminService Class
    
* ### UserService Class

* ### AuthenticationService Class

* ### CommentService Class

* ### FollowService Class

* ### PostService Class

* ### LikeService Class

* ### PasswordEncrypter Class

## Model
- *This section contains 7 models as required by project named **Admin**, **Like**, **AuthenticationToken**, **Comment**, **User**, **Post**, **Follow**. It has its relative datamembers in them which will be used as columns to store their respective data*.

- *It also contains 2 Dtos and various enums*

##  Repository
- *This section contains 7 **Interfaces** named IAdminRepo, IAuthenticationRepo, ICommentRepo, IFollowRepo, ILikeRepo, IPostRepo, IUserRepo.*

- *They all extends JpaRepository Interface*.


## Database Design
- *In this section we used the models as mentioned in Model section, which are used as a table to store data*.
- *It also uses **Relational Database** and **JPA** to create datastructure*.
- *We use **MYSQL** which is a management system for relational data*

## Data Structure Used

- *We used **Relational database** along with **JPA** as the data source in this project*.

- *This kind of data persists forever and we use **SQL** to manipulate this data via MYSQL.*

## Summary

*This project performs the task which a user can perform in a Instagram app like posting, liking a post, commenting on a post, etc with various types of API's like **Get, Post, Put, Delete***.

*This project is also connected to a relational data which is the data source of this project.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
