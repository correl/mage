package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

public final class BrudicladTelchorMyrToken extends TokenImpl {

    public BrudicladTelchorMyrToken() {
        super("Phyrexian Myr Token", "2/1 blue Phyrexian Myr artifact creature token");
        cardType.add(CardType.CREATURE);
        cardType.add(CardType.ARTIFACT);
        subtype.add(SubType.PHYREXIAN);
        subtype.add(SubType.MYR);
        color.setBlue(true);
        power = new MageInt(2);
        toughness = new MageInt(1);
    }

    public BrudicladTelchorMyrToken(final BrudicladTelchorMyrToken token) {
        super(token);
    }

    public BrudicladTelchorMyrToken copy() {
        return new BrudicladTelchorMyrToken(this);
    }
}
