package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void shouldBeEqualWhenComparingBoardToItself() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        Board board = new Board(cells);

        assertEquals(board, board);
    }

    @Test
    public void ShouldGiveZeroWhenNoNeigboursExist() {
        Cell[][] cells = {
                {new Cell(true)}
        };
        Board board = new Board(cells);

        assertEquals(0, board.neighboursCountAt(0,0));
    }

    @Test
    public void ShouldGiveFiveNeighboursWhenGridOfTwoNineCellsExixt() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        Board board = new Board(cells);

        assertEquals(5, board.neighboursCountAt(0,1));
    }

    @Test
    public void ShouldGiveNumberOfNeighbourWhenGridOfNineCellsExixt() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        Board b = new Board(cells);

        assertEquals(3, b.neighboursCountAt(0,0));
    }


}

