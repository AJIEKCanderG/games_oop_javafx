package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        bishopBlack.position();
        assertThat(bishopBlack.position(), is(C1));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Figure figure = bishopBlack.copy(C1);
        assertThat(figure.position(), is(bishopBlack.position()));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] cells = new Cell[] {D2, E3, F4, G5};
        assertThat(way, is(cells));
    }
}