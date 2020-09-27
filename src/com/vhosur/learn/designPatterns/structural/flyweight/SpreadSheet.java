package com.vhosur.learn.designPatterns.structural.flyweight;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    private CellContextFactory cellContextFactory;
    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    public SpreadSheet(CellContextFactory cellContextFactory) {
        this.cellContextFactory = cellContextFactory;

        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getCellContext();
        cells[row][col].setCellContext(cellContextFactory.getContext(fontFamily, currentContext.getFontSize(), currentContext.isBold()));
    }

    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++) {
                var cell = new Cell(row, col, getDefaultContext());
                cells[row][col] = cell;
            }
    }

    private CellContext getDefaultContext() {
        return new CellContext("Times New Roman", 1, false);
    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }
}
