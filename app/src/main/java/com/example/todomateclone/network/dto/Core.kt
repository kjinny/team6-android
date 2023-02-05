package com.example.todomateclone.network.dto

import android.media.Image
import retrofit2.http.Url
import java.net.URL
import java.time.LocalDate
import java.time.LocalDateTime

data class UserDTO(
    val id: Int,
    val email: String,
    val nickname: String,
    val detail: String,
//    val image: String
)

data class SearchedUserDTO(
    val is_following: Boolean,
    val id: Int,
    val email: String,
    val nickname: String,
    val detail: String,
)

data class AuthStorageUserDTO(
    val id: Int,
    val email: String,
)

data class CommentDTO(
    val id: Int,
    val context: String,
    val diary: Int,
    val created_at: String,
    val updated_at: String,
    val created_by: Int,
    val nickname: String
)

data class DiaryDTO(
    val id: Int,
    val date: String,
    val title: String,
    val context: String,
    val created_by: Int,
    val nickname: String
)

data class TaskDTO(
    val id: Int,
    val date: String,
    val name: String,
    val complete: Boolean,
    val created_by: Int,
    val start_time: String,
    val end_time: String,
)


data class ErrorDTO(
    val statusCode: Int?,
    val message: String?,
)

data class FolloweeDTO(
    val to_user_email: String,
    val to_user_id: Int,
    val to_user_nickname: String,
)

data class BlockingDTO(
    val to_user_email: String,
    val to_user_id: Int,
    val to_user_nickname: String,
)

data class FollowerDTO(
    val from_user_email: String,
    val from_user_id: Int,
    val from_user_nickname: String,
    val is_following: Boolean,
)