package com.tw.gameoflife;

//has a cell and gives the new state of a cell
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
