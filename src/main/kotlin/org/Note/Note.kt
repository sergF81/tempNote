package org.Note

data class Note(

    val noteId: Int = 0,
    var ownerId: Int = 0,
    val title: String = "",
    val text: String = "",
    var deleted: Boolean = false

    )


//privacy_view��������� ����������� ��������� ������� � ����������� �������. ������ ����, ����������� ����� �������, �� ��������� all, �������� ������� � ������ 5.30
//privacy_comment��������� ����������� ��������������� ������� � ����������� �������. ������ ����, ����������� ����� �������, �� ��������� all, �������� ������� � ������ 5.30

