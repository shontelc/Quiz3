package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Card;
import pkgException.DeckException;

class DeckTest {

	@Test
	void getRemaining_eSuitTest1() throws DeckException {
		pkgCore.Deck Deck = new pkgCore.Deck();
		Deck.Draw();
		
		int cardsLeft = Deck.getRemaining(pkgEnum.eSuit.HEARTS) + Deck.getRemaining(pkgEnum.eSuit.CLUBS) + Deck.getRemaining(pkgEnum.eSuit.DIAMONDS)+ Deck.getRemaining(pkgEnum.eSuit.SPADES);
		assertEquals(cardsLeft, 51);
		
				
	}
	@Test
	void getRemaining_eSuitTest2() throws DeckException {
		pkgCore.Deck Deck = new pkgCore.Deck();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		int cardsLeft = Deck.getRemaining(pkgEnum.eSuit.HEARTS) + Deck.getRemaining(pkgEnum.eSuit.CLUBS) + Deck.getRemaining(pkgEnum.eSuit.DIAMONDS)+ Deck.getRemaining(pkgEnum.eSuit.SPADES);
		
		assertEquals(cardsLeft, 40);
	}
	@Test
	void getRemaining_eRankTest1() throws DeckException {
		pkgCore.Deck Deck = new pkgCore.Deck();
		Deck.Draw();
		
		int cardsLeft = Deck.getRemaining(pkgEnum.eRank.TWO) + Deck.getRemaining(pkgEnum.eRank.THREE) + Deck.getRemaining(pkgEnum.eRank.FOUR) + Deck.getRemaining(pkgEnum.eRank.FIVE)+ Deck.getRemaining(pkgEnum.eRank.SIX) + Deck.getRemaining(pkgEnum.eRank.SEVEN)+ Deck.getRemaining(pkgEnum.eRank.EIGHT) + Deck.getRemaining(pkgEnum.eRank.NINE) + Deck.getRemaining(pkgEnum.eRank.TEN) + Deck.getRemaining(pkgEnum.eRank.JACK) + Deck.getRemaining(pkgEnum.eRank.QUEEN) + Deck.getRemaining(pkgEnum.eRank.KING) + Deck.getRemaining(pkgEnum.eRank.ACE);
		assertEquals(cardsLeft, 51);
	}
	@Test
	void getRemaining_eRankTest2() throws DeckException {
		pkgCore.Deck Deck = new pkgCore.Deck();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		Deck.Draw();
		
		int cardsLeft = Deck.getRemaining(pkgEnum.eRank.TWO) + Deck.getRemaining(pkgEnum.eRank.THREE) + Deck.getRemaining(pkgEnum.eRank.FOUR) + Deck.getRemaining(pkgEnum.eRank.FIVE)+ Deck.getRemaining(pkgEnum.eRank.SIX) + Deck.getRemaining(pkgEnum.eRank.SEVEN)+ Deck.getRemaining(pkgEnum.eRank.EIGHT) + Deck.getRemaining(pkgEnum.eRank.NINE) + Deck.getRemaining(pkgEnum.eRank.TEN) + Deck.getRemaining(pkgEnum.eRank.JACK) + Deck.getRemaining(pkgEnum.eRank.QUEEN) + Deck.getRemaining(pkgEnum.eRank.KING) + Deck.getRemaining(pkgEnum.eRank.ACE);
		assertEquals(cardsLeft, 45);
	}
}
		
	
