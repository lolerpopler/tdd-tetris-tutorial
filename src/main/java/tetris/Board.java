// Copyright (c) 2008-2015  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

import java.util.*;

public class Board {

    private final int rows;
    private final int columns;
    private ArrayList<Block> blockList;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        blockList = new ArrayList<>();
    }

    public String toString() {
        String s = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                s += ".";
            }
            s += "\n";
        }
        return s;
    }

    public boolean hasFalling() {
        Optional<Block> optional = blockList.stream()
                                            .filter(block -> block.isFalling())
                                            .findFirst();
        return optional.isPresent();
    }

    public void drop(Block block) {
        blockList.add(block);
    }
}
