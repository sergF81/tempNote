package org.Note

class NoteService() : Crud {
    var notes: MutableList<Note> = arrayListOf()

    override fun add(note: Note): Note {
        val note = if (notes.isEmpty()) note.copy(noteId = 1)
        else note.copy(noteId = notes.last().noteId + 1)
        notes += note
        return notes.last()
    }

    override fun edit(noteNew: Note): Boolean {
        for ((index, note) in notes.withIndex()) {
            if (note.noteId == noteNew.noteId) {
                noteNew.ownerId = note.ownerId
                notes[index] = noteNew
                println(noteNew)
                return true
            }
        }
        return false
    }

    override fun delete(noteIdDelete: Int):Boolean {

        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (noteIdDelete)) {
                note.deleted =  true
                return true
            }
        }
        return false
    }

    override fun getNotes(noteIds: List<Int>):List<Note> {
        var outputNotes: List<Note> = arrayListOf()
        for ((index1, note) in notes.withIndex()) {
            for ((index, element) in noteIds.withIndex()) {
                if (noteIds[index] == notes[index1].noteId){
                    if(notes[index1].deleted == false) outputNotes += notes[index1]
                }
                else continue
            }
        }
        return outputNotes
    }

    override fun getById(noteIdSearch: Int): Note? {
        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (noteIdSearch)) {
                if (notes[index].deleted == false)
                return note
                break
            }
        }
        throw  NoteNotFoundException()
    }

    override fun createComment() {
        TODO("Not yet implemented")
    }

    override fun editComment() {
        TODO("Not yet implemented")
    }

    override fun deleteComment() {
        TODO("Not yet implemented")
    }

    override fun getComments() {
        TODO("Not yet implemented")
    }

    override fun restoreComment() {
        TODO("Not yet implemented")
    }
}