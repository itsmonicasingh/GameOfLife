package com.tw.gameoflife;

public class CellTransition {

    private Cell cell;

    public CellTransition( Cell cell )
    {
        this.cell = cell;
    }

    public Cell currentState() {
        return cell;
    }
}
