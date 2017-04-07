package net.progruzovik.study.croco.game

interface Player {

    val id: String
    var name: String

    var role: Role
    var lobby: Lobby?
    var isQuadsRemoved: Boolean

    fun addToQueue(): Boolean

    fun removeFromQueue(): Boolean

    fun addMessage(text: String): Boolean

    fun markMessage(number: Int, isMarked: Boolean?): Boolean

    fun addQuad(number: Int, color: Int): Boolean

    fun removeQuad(number: Int): Boolean

    fun removeQuads(): Boolean

    fun requestKeyword(): String?
}