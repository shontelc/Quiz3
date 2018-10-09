package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() throws DeckException {

		if (cardsInDeck.size() == 0)
		{
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);

	}

	public Card Draw(eSuit eSuit) {
		for (Card c : cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return (c);
			}
		}
		return (null);
	}

	public int getiDeckCount()
	{
		return cardsInDeck.size();
	}
	
	public int getRemaining(Object eNum){
		int count = 0;
		if (eNum instanceof eSuit) {
			for (int x = 0; x < cardsInDeck.size(); x++) {
				if (cardsInDeck.get(x).geteSuit() == eNum){
					count++;
				}
			}
		}
		if (eNum instanceof eRank){
			for (int y = 0; y < cardsInDeck.size(); y++) {
				if (cardsInDeck.get(y).geteRank() == eNum)
				count++;
			}
		}
		return count;
	
			
		
		
		
		
	}
		
		
	}