package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.repo

import io.reactivex.rxjava3.core.Observable
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.entity.GithubUser

class GithubUsersRepo {
    private val repositories = listOf(
        GithubUser("login1"),
        GithubUser("login2"),
        GithubUser("login3"),
        GithubUser("login4"),
        GithubUser("login5")
    )

    fun getUsers() : Observable<List<GithubUser>> {
        return Observable.just(repositories)
    }
}