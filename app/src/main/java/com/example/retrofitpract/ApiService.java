package com.example.retrofitpract;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {


    //Получаем список постов
    @GET("/posts")
    Call<List<Post>> getPosts();
    //Получаем пост
    @GET("/posts/{id}")
    Call<List<Post>> getPosts(@Path("id") int id);

    //Добавление нового поста
    @POST("/posts")
    Call<Post> addPost(@Body Post post);
    //Обновление поста
    @PUT("/posts/{id}")
    Call<Post> updatePost1(@Path("id") int id,@Body Post post);
    //Обновление поста
    @PATCH("/posts/{id}")
    Call<Post> updatePost2(@Path("id") int id,@Body Post post);
    //Удаление поста
    @DELETE("/posts/{id}")
    Call<Void> deletePost(@Path("id") int id);
}
