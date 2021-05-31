package org.Note

fun main() {
    val r = NoteService()
    r.add(Note(ownerId = 2, text = "��������2"))
    r.add(Note(ownerId = 3, text = "��������3"))
    r.add(Note(ownerId = 7, text = "��������7"))
    r.add(Note(ownerId = 8, text = "��������8"))
    println(r.notes.toList())
    val a = Note(noteId = 2,3, text = "��������9")
    r.edit(a)
    r.delete(2)

    println(r.notes.toList())

println(r.getById(2))
    //  val list: MutableList<Int> = listOf(1, 3, 4 ) as MutableList<Int>
    print("������ ")
    println(r.getNotes(listOf(1, 3, 4)))
}