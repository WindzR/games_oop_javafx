package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        var bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void way() {
        var bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual, is(expected));
    }

    @Test(expected = IllegalStateException.class)
    public void wayIsNotDiagonal() {
        var bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G6);
    }

    @Test
    public void copy() {
        var bishopBlack = new BishopBlack(Cell.C1);
        var actual = bishopBlack.copy(Cell.G5);
        assertThat(actual.position(), is(Cell.G5));
    }
}