package org.Note

interface Crud {   // ������ ��� ������ � ���������.
    fun add(note: Note): Note // ������� ����� ������� � �������� ������������.
    fun createComment() //��������� ����� ����������� � �������.
    fun delete(noteIdDelete: Int):Boolean //������� ������� �������� ������������.
    fun deleteComment() //������� ����������� � �������.
    fun edit(note: Note): Boolean //����������� ������� �������� ������������.
    fun editComment() //����������� ��������� ����������� � �������.
    fun getNotes(noteIds: List<Int>):List<Note> //���������� ������ �������, ��������� �������������.
    fun getById(noteId: Int):Note? //���������� ������� �� � id.
    fun getComments() //���������� ������ ������������ � �������.
    fun restoreComment() //��������������� �������� �����������.
}