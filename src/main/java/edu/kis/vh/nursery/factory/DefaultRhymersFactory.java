package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;


/**
 * Klasa implementuje interfejs RhymersFactory i zawiera gettery zwracajace nowe obiekty klas:
 * DefaultCountingOutRhymer,
 * DefaultCountingOutRhymer,
 * FIFORhymer,
 * HanoiRhymer
 */

//TODO: wymagane poprawki - funkcje getStandardRhymer() i getFalseRhymer() zwracaja ten sam obiekt
public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
