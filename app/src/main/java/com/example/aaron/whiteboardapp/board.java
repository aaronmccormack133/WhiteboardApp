package com.example.aaron.whiteboardapp;

public class board {
    private String boardName;
    private String boardInfo;
    private int preview;

    public board(){

    }

    public board(String boardName, String boardInfo, int preview){
        this.boardName = boardName;
        this.boardInfo = boardInfo;
        this.preview = preview;
    }

    public String getBoardName(){
        return boardName;
    }

    public void setBoardName(String boardName){
        this.boardName = boardName;
    }

    public String getBoardInfo(){
        return boardInfo;
    }
    public void setBoardInfo(String boardInfo){
        this.boardInfo = boardInfo;
    }

    public int getPreview() {
        return preview;
    }

    public void setPreview(int preview) {
        this.preview = preview;
    }
}
