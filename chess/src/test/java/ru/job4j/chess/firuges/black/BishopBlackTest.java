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
    }

    @Test
    public void copy() {
        var bishopBlack = new BishopBlack(Cell.C1);
        var actual = bishopBlack.copy(Cell.G5);
        assertThat(actual.position(), is(Cell.G5));
    }
}