package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TheElk801
 */
public final class CoreSet2021 extends ExpansionSet {

    private static final CoreSet2021 instance = new CoreSet2021();

    public static CoreSet2021 getInstance() {
        return instance;
    }

    private final List<CardInfo> savedSpecialLand = new ArrayList<>();

    private CoreSet2021() {
        super("Core Set 2021", "M21", ExpansionSet.buildDate(2020, 7, 3), SetType.CORE);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterSpecial = 0;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 274;

        cards.add(new SetCardInfo("Adherent of Hope", 321, Rarity.COMMON, mage.cards.a.AdherentOfHope.class));
        cards.add(new SetCardInfo("Alchemist's Gift", 87, Rarity.COMMON, mage.cards.a.AlchemistsGift.class));
        cards.add(new SetCardInfo("Alpine Houndmaster", 215, Rarity.UNCOMMON, mage.cards.a.AlpineHoundmaster.class));
        cards.add(new SetCardInfo("Alpine Watchdog", 2, Rarity.COMMON, mage.cards.a.AlpineWatchdog.class));
        cards.add(new SetCardInfo("Angelic Ascension", 3, Rarity.UNCOMMON, mage.cards.a.AngelicAscension.class));
        cards.add(new SetCardInfo("Animal Sanctuary", 242, Rarity.RARE, mage.cards.a.AnimalSanctuary.class));
        cards.add(new SetCardInfo("Anointed Chorister", 4, Rarity.COMMON, mage.cards.a.AnointedChorister.class));
        cards.add(new SetCardInfo("Aven Gagglemaster", 5, Rarity.UNCOMMON, mage.cards.a.AvenGagglemaster.class));
        cards.add(new SetCardInfo("Azusa, Lost but Seeking", 173, Rarity.RARE, mage.cards.a.AzusaLostButSeeking.class));
        cards.add(new SetCardInfo("Bad Deal", 89, Rarity.UNCOMMON, mage.cards.b.BadDeal.class));
        cards.add(new SetCardInfo("Baneslayer Angel", 6, Rarity.MYTHIC, mage.cards.b.BaneslayerAngel.class));
        cards.add(new SetCardInfo("Barrin, Tolarian Archmage", 45, Rarity.RARE, mage.cards.b.BarrinTolarianArchmage.class));
        cards.add(new SetCardInfo("Basri Ket", 7, Rarity.MYTHIC, mage.cards.b.BasriKet.class));
        cards.add(new SetCardInfo("Basri's Acolyte", 8, Rarity.COMMON, mage.cards.b.BasrisAcolyte.class));
        cards.add(new SetCardInfo("Basri's Aegis", 322, Rarity.RARE, mage.cards.b.BasrisAegis.class));
        cards.add(new SetCardInfo("Basri's Lieutenant", 9, Rarity.RARE, mage.cards.b.BasrisLieutenant.class));
        cards.add(new SetCardInfo("Basri's Solidarity", 10, Rarity.UNCOMMON, mage.cards.b.BasrisSolidarity.class));
        cards.add(new SetCardInfo("Basri, Devoted Paladin", 320, Rarity.MYTHIC, mage.cards.b.BasriDevotedPaladin.class));
        cards.add(new SetCardInfo("Battle-Rattle Shaman", 130, Rarity.UNCOMMON, mage.cards.b.BattleRattleShaman.class));
        cards.add(new SetCardInfo("Blood Glutton", 90, Rarity.COMMON, mage.cards.b.BloodGlutton.class));
        cards.add(new SetCardInfo("Bloodfell Caves", 243, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Blossoming Sands", 244, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Bolt Hound", 131, Rarity.UNCOMMON, mage.cards.b.BoltHound.class));
        cards.add(new SetCardInfo("Bone Pit Brute", 132, Rarity.COMMON, mage.cards.b.BonePitBrute.class));
        cards.add(new SetCardInfo("Brash Taunter", 133, Rarity.RARE, mage.cards.b.BrashTaunter.class));
        cards.add(new SetCardInfo("Burlfist Oak", 174, Rarity.UNCOMMON, mage.cards.b.BurlfistOak.class));
        cards.add(new SetCardInfo("Burn Bright", 134, Rarity.COMMON, mage.cards.b.BurnBright.class));
        cards.add(new SetCardInfo("Caged Zombie", 91, Rarity.COMMON, mage.cards.c.CagedZombie.class));
        cards.add(new SetCardInfo("Cancel", 46, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Canopy Stalker", 175, Rarity.UNCOMMON, mage.cards.c.CanopyStalker.class));
        cards.add(new SetCardInfo("Capture Sphere", 47, Rarity.COMMON, mage.cards.c.CaptureSphere.class));
        cards.add(new SetCardInfo("Carrion Grub", 92, Rarity.UNCOMMON, mage.cards.c.CarrionGrub.class));
        cards.add(new SetCardInfo("Celestial Enforcer", 11, Rarity.COMMON, mage.cards.c.CelestialEnforcer.class));
        cards.add(new SetCardInfo("Chandra's Firemaw", 333, Rarity.RARE, mage.cards.c.ChandrasFiremaw.class));
        cards.add(new SetCardInfo("Chandra's Incinerator", 136, Rarity.RARE, mage.cards.c.ChandrasIncinerator.class));
        cards.add(new SetCardInfo("Chandra's Magmutt", 137, Rarity.COMMON, mage.cards.c.ChandrasMagmutt.class));
        cards.add(new SetCardInfo("Chandra's Pyreling", 138, Rarity.UNCOMMON, mage.cards.c.ChandrasPyreling.class));
        cards.add(new SetCardInfo("Chandra, Flame's Catalyst", 332, Rarity.MYTHIC, mage.cards.c.ChandraFlamesCatalyst.class));
        cards.add(new SetCardInfo("Chandra, Heart of Fire", 135, Rarity.MYTHIC, mage.cards.c.ChandraHeartOfFire.class));
        cards.add(new SetCardInfo("Chromatic Orrery", 228, Rarity.MYTHIC, mage.cards.c.ChromaticOrrery.class));
        cards.add(new SetCardInfo("Chrome Replicator", 229, Rarity.UNCOMMON, mage.cards.c.ChromeReplicator.class));
        cards.add(new SetCardInfo("Colossal Dreadmaw", 176, Rarity.COMMON, mage.cards.c.ColossalDreadmaw.class));
        cards.add(new SetCardInfo("Conclave Mentor", 216, Rarity.UNCOMMON, mage.cards.c.ConclaveMentor.class));
        cards.add(new SetCardInfo("Concordia Pegasus", 12, Rarity.COMMON, mage.cards.c.ConcordiaPegasus.class));
        cards.add(new SetCardInfo("Containment Priest", 13, Rarity.RARE, mage.cards.c.ContainmentPriest.class));
        cards.add(new SetCardInfo("Crash Through", 140, Rarity.COMMON, mage.cards.c.CrashThrough.class));
        cards.add(new SetCardInfo("Crypt Lurker", 93, Rarity.COMMON, mage.cards.c.CryptLurker.class));
        cards.add(new SetCardInfo("Cultivate", 177, Rarity.UNCOMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Daybreak Charger", 14, Rarity.COMMON, mage.cards.d.DaybreakCharger.class));
        cards.add(new SetCardInfo("Deathbloom Thallid", 94, Rarity.COMMON, mage.cards.d.DeathbloomThallid.class));
        cards.add(new SetCardInfo("Defiant Strike", 15, Rarity.COMMON, mage.cards.d.DefiantStrike.class));
        cards.add(new SetCardInfo("Demonic Embrace", 95, Rarity.RARE, mage.cards.d.DemonicEmbrace.class));
        cards.add(new SetCardInfo("Destructive Tampering", 141, Rarity.COMMON, mage.cards.d.DestructiveTampering.class));
        cards.add(new SetCardInfo("Dire Fleet Warmonger", 217, Rarity.UNCOMMON, mage.cards.d.DireFleetWarmonger.class));
        cards.add(new SetCardInfo("Discontinuity", 48, Rarity.MYTHIC, mage.cards.d.Discontinuity.class));
        cards.add(new SetCardInfo("Dismal Backwater", 245, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Double Vision", 142, Rarity.RARE, mage.cards.d.DoubleVision.class));
        cards.add(new SetCardInfo("Drowsing Tyrannodon", 178, Rarity.COMMON, mage.cards.d.DrowsingTyrannodon.class));
        cards.add(new SetCardInfo("Dub", 16, Rarity.COMMON, mage.cards.d.Dub.class));
        cards.add(new SetCardInfo("Duress", 96, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Elder Gargaroth", 179, Rarity.MYTHIC, mage.cards.e.ElderGargaroth.class));
        cards.add(new SetCardInfo("Eliminate", 97, Rarity.UNCOMMON, mage.cards.e.Eliminate.class));
        cards.add(new SetCardInfo("Epitaph Golem", 230, Rarity.UNCOMMON, mage.cards.e.EpitaphGolem.class));
        cards.add(new SetCardInfo("Experimental Overload", 218, Rarity.UNCOMMON, mage.cards.e.ExperimentalOverload.class));
        cards.add(new SetCardInfo("Fabled Passage", 246, Rarity.RARE, mage.cards.f.FabledPassage.class));
        cards.add(new SetCardInfo("Faith's Fetters", 17, Rarity.UNCOMMON, mage.cards.f.FaithsFetters.class));
        cards.add(new SetCardInfo("Falconer Adept", 18, Rarity.UNCOMMON, mage.cards.f.FalconerAdept.class));
        cards.add(new SetCardInfo("Feat of Resistance", 19, Rarity.COMMON, mage.cards.f.FeatOfResistance.class));
        cards.add(new SetCardInfo("Feline Sovereign", 180, Rarity.RARE, mage.cards.f.FelineSovereign.class));
        cards.add(new SetCardInfo("Fetid Imp", 98, Rarity.COMMON, mage.cards.f.FetidImp.class));
        cards.add(new SetCardInfo("Fierce Empath", 181, Rarity.UNCOMMON, mage.cards.f.FierceEmpath.class));
        cards.add(new SetCardInfo("Fiery Emancipation", 143, Rarity.MYTHIC, mage.cards.f.FieryEmancipation.class));
        cards.add(new SetCardInfo("Finishing Blow", 99, Rarity.COMMON, mage.cards.f.FinishingBlow.class));
        cards.add(new SetCardInfo("Forest", 272, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Sentinel", 231, Rarity.COMMON, mage.cards.f.ForgottenSentinel.class));
        cards.add(new SetCardInfo("Frantic Inventory", 50, Rarity.COMMON, mage.cards.f.FranticInventory.class));
        cards.add(new SetCardInfo("Frost Breath", 51, Rarity.COMMON, mage.cards.f.FrostBreath.class));
        cards.add(new SetCardInfo("Fungal Rebirth", 182, Rarity.UNCOMMON, mage.cards.f.FungalRebirth.class));
        cards.add(new SetCardInfo("Furious Rise", 144, Rarity.UNCOMMON, mage.cards.f.FuriousRise.class));
        cards.add(new SetCardInfo("Furor of the Bitten", 145, Rarity.COMMON, mage.cards.f.FurorOfTheBitten.class));
        cards.add(new SetCardInfo("Gadrak, the Crown-Scourge", 146, Rarity.RARE, mage.cards.g.GadrakTheCrownScourge.class));
        cards.add(new SetCardInfo("Gale Swooper", 20, Rarity.COMMON, mage.cards.g.GaleSwooper.class));
        cards.add(new SetCardInfo("Garruk's Gorehorn", 184, Rarity.COMMON, mage.cards.g.GarruksGorehorn.class));
        cards.add(new SetCardInfo("Garruk's Harbinger", 185, Rarity.RARE, mage.cards.g.GarruksHarbinger.class));
        cards.add(new SetCardInfo("Garruk's Uprising", 186, Rarity.UNCOMMON, mage.cards.g.GarruksUprising.class));
        cards.add(new SetCardInfo("Garruk's Warsteed", 337, Rarity.RARE, mage.cards.g.GarruksWarsteed.class));
        cards.add(new SetCardInfo("Garruk, Savage Herald", 336, Rarity.MYTHIC, mage.cards.g.GarrukSavageHerald.class));
        cards.add(new SetCardInfo("Garruk, Unleashed", 183, Rarity.MYTHIC, mage.cards.g.GarrukUnleashed.class));
        cards.add(new SetCardInfo("Ghostly Pilferer", 52, Rarity.RARE, mage.cards.g.GhostlyPilferer.class));
        cards.add(new SetCardInfo("Gloom Sower", 100, Rarity.COMMON, mage.cards.g.GloomSower.class));
        cards.add(new SetCardInfo("Glorious Anthem", 21, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Gnarled Sage", 187, Rarity.COMMON, mage.cards.g.GnarledSage.class));
        cards.add(new SetCardInfo("Goblin Arsonist", 147, Rarity.COMMON, mage.cards.g.GoblinArsonist.class));
        cards.add(new SetCardInfo("Goblin Wizardry", 148, Rarity.COMMON, mage.cards.g.GoblinWizardry.class));
        cards.add(new SetCardInfo("Goremand", 101, Rarity.UNCOMMON, mage.cards.g.Goremand.class));
        cards.add(new SetCardInfo("Grasp of Darkness", 102, Rarity.COMMON, mage.cards.g.GraspOfDarkness.class));
        cards.add(new SetCardInfo("Griffin Aerie", 22, Rarity.UNCOMMON, mage.cards.g.GriffinAerie.class));
        cards.add(new SetCardInfo("Grim Tutor", 103, Rarity.MYTHIC, mage.cards.g.GrimTutor.class));
        cards.add(new SetCardInfo("Havoc Jester", 149, Rarity.UNCOMMON, mage.cards.h.HavocJester.class));
        cards.add(new SetCardInfo("Heartfire Immolator", 150, Rarity.UNCOMMON, mage.cards.h.HeartfireImmolator.class));
        cards.add(new SetCardInfo("Hellkite Punisher", 151, Rarity.UNCOMMON, mage.cards.h.HellkitePunisher.class));
        cards.add(new SetCardInfo("Heroic Intervention", 188, Rarity.RARE, mage.cards.h.HeroicIntervention.class));
        cards.add(new SetCardInfo("Historian of Zhalfir", 325, Rarity.UNCOMMON, mage.cards.h.HistorianOfZhalfir.class));
        cards.add(new SetCardInfo("Hobblefiend", 152, Rarity.COMMON, mage.cards.h.Hobblefiend.class));
        cards.add(new SetCardInfo("Hunter's Edge", 189, Rarity.COMMON, mage.cards.h.HuntersEdge.class));
        cards.add(new SetCardInfo("Igneous Cur", 153, Rarity.COMMON, mage.cards.i.IgneousCur.class));
        cards.add(new SetCardInfo("Indulging Patrician", 219, Rarity.UNCOMMON, mage.cards.i.IndulgingPatrician.class));
        cards.add(new SetCardInfo("Infernal Scarring", 105, Rarity.COMMON, mage.cards.i.InfernalScarring.class));
        cards.add(new SetCardInfo("Invigorating Surge", 190, Rarity.UNCOMMON, mage.cards.i.InvigoratingSurge.class));
        cards.add(new SetCardInfo("Island", 263, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jeskai Elder", 53, Rarity.UNCOMMON, mage.cards.j.JeskaiElder.class));
        cards.add(new SetCardInfo("Jolrael, Mwonvuli Recluse", 191, Rarity.RARE, mage.cards.j.JolraelMwonvuliRecluse.class));
        cards.add(new SetCardInfo("Jungle Hollow", 247, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Kaervek, the Spiteful", 106, Rarity.RARE, mage.cards.k.KaervekTheSpiteful.class));
        cards.add(new SetCardInfo("Keen Glidemaster", 54, Rarity.COMMON, mage.cards.k.KeenGlidemaster.class));
        cards.add(new SetCardInfo("Keral Keep Disciples", 334, Rarity.UNCOMMON, mage.cards.k.KeralKeepDisciples.class));
        cards.add(new SetCardInfo("Kinetic Augur", 154, Rarity.UNCOMMON, mage.cards.k.KineticAugur.class));
        cards.add(new SetCardInfo("Kitesail Freebooter", 107, Rarity.UNCOMMON, mage.cards.k.KitesailFreebooter.class));
        cards.add(new SetCardInfo("Leafkin Avenger", 220, Rarity.UNCOMMON, mage.cards.l.LeafkinAvenger.class));
        cards.add(new SetCardInfo("Legion's Judgment", 24, Rarity.COMMON, mage.cards.l.LegionsJudgment.class));
        cards.add(new SetCardInfo("Library Larcenist", 55, Rarity.COMMON, mage.cards.l.LibraryLarcenist.class));
        cards.add(new SetCardInfo("Life Goes On", 192, Rarity.COMMON, mage.cards.l.LifeGoesOn.class));
        cards.add(new SetCardInfo("Light of Promise", 25, Rarity.UNCOMMON, mage.cards.l.LightOfPromise.class));
        cards.add(new SetCardInfo("Liliana's Devotee", 109, Rarity.UNCOMMON, mage.cards.l.LilianasDevotee.class));
        cards.add(new SetCardInfo("Liliana's Scorn", 329, Rarity.RARE, mage.cards.l.LilianasScorn.class));
        cards.add(new SetCardInfo("Liliana's Scrounger", 330, Rarity.UNCOMMON, mage.cards.l.LilianasScrounger.class));
        cards.add(new SetCardInfo("Liliana's Standard Bearer", 110, Rarity.RARE, mage.cards.l.LilianasStandardBearer.class));
        cards.add(new SetCardInfo("Liliana's Steward", 111, Rarity.COMMON, mage.cards.l.LilianasSteward.class));
        cards.add(new SetCardInfo("Liliana, Death Mage", 328, Rarity.MYTHIC, mage.cards.l.LilianaDeathMage.class));
        cards.add(new SetCardInfo("Liliana, Waker of the Dead", 108, Rarity.MYTHIC, mage.cards.l.LilianaWakerOfTheDead.class));
        cards.add(new SetCardInfo("Llanowar Visionary", 193, Rarity.COMMON, mage.cards.l.LlanowarVisionary.class));
        cards.add(new SetCardInfo("Lofty Denial", 56, Rarity.COMMON, mage.cards.l.LoftyDenial.class));
        cards.add(new SetCardInfo("Lorescale Coatl", 221, Rarity.UNCOMMON, mage.cards.l.LorescaleCoatl.class));
        cards.add(new SetCardInfo("Makeshift Battalion", 26, Rarity.COMMON, mage.cards.m.MakeshiftBattalion.class));
        cards.add(new SetCardInfo("Malefic Scythe", 112, Rarity.UNCOMMON, mage.cards.m.MaleficScythe.class));
        cards.add(new SetCardInfo("Mangara, the Diplomat", 27, Rarity.MYTHIC, mage.cards.m.MangaraTheDiplomat.class));
        cards.add(new SetCardInfo("Masked Blackguard", 113, Rarity.COMMON, mage.cards.m.MaskedBlackguard.class));
        cards.add(new SetCardInfo("Massacre Wurm", 114, Rarity.MYTHIC, mage.cards.m.MassacreWurm.class));
        cards.add(new SetCardInfo("Mazemind Tome", 232, Rarity.RARE, mage.cards.m.MazemindTome.class));
        cards.add(new SetCardInfo("Meteorite", 233, Rarity.UNCOMMON, mage.cards.m.Meteorite.class));
        cards.add(new SetCardInfo("Mind Rot", 115, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Miscast", 57, Rarity.UNCOMMON, mage.cards.m.Miscast.class));
        cards.add(new SetCardInfo("Mistral Singer", 58, Rarity.COMMON, mage.cards.m.MistralSinger.class));
        cards.add(new SetCardInfo("Mountain", 269, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mystic Skyfish", 326, Rarity.COMMON, mage.cards.m.MysticSkyfish.class));
        cards.add(new SetCardInfo("Necromentia", 116, Rarity.RARE, mage.cards.n.Necromentia.class));
        cards.add(new SetCardInfo("Niambi, Esteemed Speaker", 222, Rarity.RARE, mage.cards.n.NiambiEsteemedSpeaker.class));
        cards.add(new SetCardInfo("Obsessive Stitcher", 223, Rarity.UNCOMMON, mage.cards.o.ObsessiveStitcher.class));
        cards.add(new SetCardInfo("Onakke Ogre", 155, Rarity.COMMON, mage.cards.o.OnakkeOgre.class));
        cards.add(new SetCardInfo("Opt", 59, Rarity.COMMON, mage.cards.o.Opt.class));
        cards.add(new SetCardInfo("Ornery Dilophosaur", 194, Rarity.COMMON, mage.cards.o.OrneryDilophosaur.class));
        cards.add(new SetCardInfo("Pack Leader", 29, Rarity.RARE, mage.cards.p.PackLeader.class));
        cards.add(new SetCardInfo("Palladium Myr", 234, Rarity.UNCOMMON, mage.cards.p.PalladiumMyr.class));
        cards.add(new SetCardInfo("Peer into the Abyss", 117, Rarity.RARE, mage.cards.p.PeerIntoTheAbyss.class));
        cards.add(new SetCardInfo("Pestilent Haze", 118, Rarity.UNCOMMON, mage.cards.p.PestilentHaze.class));
        cards.add(new SetCardInfo("Pitchburn Devils", 156, Rarity.COMMON, mage.cards.p.PitchburnDevils.class));
        cards.add(new SetCardInfo("Plains", 260, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Portcullis Vine", 195, Rarity.COMMON, mage.cards.p.PortcullisVine.class));
        cards.add(new SetCardInfo("Predatory Wurm", 338, Rarity.UNCOMMON, mage.cards.p.PredatoryWurm.class));
        cards.add(new SetCardInfo("Pridemalkin", 196, Rarity.COMMON, mage.cards.p.Pridemalkin.class));
        cards.add(new SetCardInfo("Primal Might", 197, Rarity.RARE, mage.cards.p.PrimalMight.class));
        cards.add(new SetCardInfo("Prismite", 235, Rarity.COMMON, mage.cards.p.Prismite.class));
        cards.add(new SetCardInfo("Pursued Whale", 60, Rarity.RARE, mage.cards.p.PursuedWhale.class));
        cards.add(new SetCardInfo("Quirion Dryad", 198, Rarity.UNCOMMON, mage.cards.q.QuirionDryad.class));
        cards.add(new SetCardInfo("Radha, Heart of Keld", 224, Rarity.RARE, mage.cards.r.RadhaHeartOfKeld.class));
        cards.add(new SetCardInfo("Radiant Fountain", 248, Rarity.COMMON, mage.cards.r.RadiantFountain.class));
        cards.add(new SetCardInfo("Rain of Revelation", 61, Rarity.UNCOMMON, mage.cards.r.RainOfRevelation.class));
        cards.add(new SetCardInfo("Rambunctious Mutt", 30, Rarity.COMMON, mage.cards.r.RambunctiousMutt.class));
        cards.add(new SetCardInfo("Ranger's Guile", 199, Rarity.COMMON, mage.cards.r.RangersGuile.class));
        cards.add(new SetCardInfo("Read the Tides", 62, Rarity.COMMON, mage.cards.r.ReadTheTides.class));
        cards.add(new SetCardInfo("Return to Nature", 200, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Revitalize", 31, Rarity.COMMON, mage.cards.r.Revitalize.class));
        cards.add(new SetCardInfo("Rewind", 63, Rarity.UNCOMMON, mage.cards.r.Rewind.class));
        cards.add(new SetCardInfo("Riddleform", 64, Rarity.UNCOMMON, mage.cards.r.Riddleform.class));
        cards.add(new SetCardInfo("Rin and Seri, Inseparable", 278, Rarity.MYTHIC, mage.cards.r.RinAndSeriInseparable.class));
        cards.add(new SetCardInfo("Rise Again", 119, Rarity.COMMON, mage.cards.r.RiseAgain.class));
        cards.add(new SetCardInfo("Roaming Ghostlight", 65, Rarity.COMMON, mage.cards.r.RoamingGhostlight.class));
        cards.add(new SetCardInfo("Rookie Mistake", 66, Rarity.COMMON, mage.cards.r.RookieMistake.class));
        cards.add(new SetCardInfo("Rousing Read", 67, Rarity.COMMON, mage.cards.r.RousingRead.class));
        cards.add(new SetCardInfo("Rugged Highlands", 249, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Run Afoul", 201, Rarity.COMMON, mage.cards.r.RunAfoul.class));
        cards.add(new SetCardInfo("Runed Halo", 32, Rarity.RARE, mage.cards.r.RunedHalo.class));
        cards.add(new SetCardInfo("Sabertooth Mauler", 202, Rarity.COMMON, mage.cards.s.SabertoothMauler.class));
        cards.add(new SetCardInfo("Sanctum of Calm Waters", 68, Rarity.UNCOMMON, mage.cards.s.SanctumOfCalmWaters.class));
        cards.add(new SetCardInfo("Sanctum of Shattered Heights", 157, Rarity.UNCOMMON, mage.cards.s.SanctumOfShatteredHeights.class));
        cards.add(new SetCardInfo("Sanguine Indulgence", 121, Rarity.COMMON, mage.cards.s.SanguineIndulgence.class));
        cards.add(new SetCardInfo("Scavenging Ooze", 204, Rarity.RARE, mage.cards.s.ScavengingOoze.class));
        cards.add(new SetCardInfo("Scorching Dragonfire", 158, Rarity.COMMON, mage.cards.s.ScorchingDragonfire.class));
        cards.add(new SetCardInfo("Scoured Barrens", 250, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Seasoned Hallowblade", 34, Rarity.UNCOMMON, mage.cards.s.SeasonedHallowblade.class));
        cards.add(new SetCardInfo("Secure the Scene", 35, Rarity.COMMON, mage.cards.s.SecureTheScene.class));
        cards.add(new SetCardInfo("See the Truth", 69, Rarity.RARE, mage.cards.s.SeeTheTruth.class));
        cards.add(new SetCardInfo("Selfless Savior", 36, Rarity.UNCOMMON, mage.cards.s.SelflessSavior.class));
        cards.add(new SetCardInfo("Setessan Training", 205, Rarity.COMMON, mage.cards.s.SetessanTraining.class));
        cards.add(new SetCardInfo("Shacklegeist", 70, Rarity.RARE, mage.cards.s.Shacklegeist.class));
        cards.add(new SetCardInfo("Shipwreck Dowser", 71, Rarity.UNCOMMON, mage.cards.s.ShipwreckDowser.class));
        cards.add(new SetCardInfo("Shock", 159, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Short Sword", 236, Rarity.COMMON, mage.cards.s.ShortSword.class));
        cards.add(new SetCardInfo("Siege Striker", 37, Rarity.UNCOMMON, mage.cards.s.SiegeStriker.class));
        cards.add(new SetCardInfo("Sigiled Contender", 323, Rarity.UNCOMMON, mage.cards.s.SigiledContender.class));
        cards.add(new SetCardInfo("Silent Dart", 237, Rarity.COMMON, mage.cards.s.SilentDart.class));
        cards.add(new SetCardInfo("Silversmote Ghoul", 122, Rarity.UNCOMMON, mage.cards.s.SilversmoteGhoul.class));
        cards.add(new SetCardInfo("Skeleton Archer", 123, Rarity.COMMON, mage.cards.s.SkeletonArcher.class));
        cards.add(new SetCardInfo("Skyscanner", 238, Rarity.COMMON, mage.cards.s.Skyscanner.class));
        cards.add(new SetCardInfo("Skyway Sniper", 206, Rarity.UNCOMMON, mage.cards.s.SkywaySniper.class));
        cards.add(new SetCardInfo("Snarespinner", 207, Rarity.COMMON, mage.cards.s.Snarespinner.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 239, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Soul Sear", 160, Rarity.UNCOMMON, mage.cards.s.SoulSear.class));
        cards.add(new SetCardInfo("Sparkhunter Masticore", 240, Rarity.RARE, mage.cards.s.SparkhunterMasticore.class));
        cards.add(new SetCardInfo("Speaker of the Heavens", 38, Rarity.RARE, mage.cards.s.SpeakerOfTheHeavens.class));
        cards.add(new SetCardInfo("Spellgorger Weird", 161, Rarity.COMMON, mage.cards.s.SpellgorgerWeird.class));
        cards.add(new SetCardInfo("Spined Megalodon", 72, Rarity.COMMON, mage.cards.s.SpinedMegalodon.class));
        cards.add(new SetCardInfo("Spirit of Malevolence", 331, Rarity.COMMON, mage.cards.s.SpiritOfMalevolence.class));
        cards.add(new SetCardInfo("Sporeweb Weaver", 208, Rarity.RARE, mage.cards.s.SporewebWeaver.class));
        cards.add(new SetCardInfo("Staunch Shieldmate", 39, Rarity.COMMON, mage.cards.s.StaunchShieldmate.class));
        cards.add(new SetCardInfo("Storm Caller", 335, Rarity.COMMON, mage.cards.s.StormCaller.class));
        cards.add(new SetCardInfo("Stormwing Entity", 73, Rarity.RARE, mage.cards.s.StormwingEntity.class));
        cards.add(new SetCardInfo("Sublime Epiphany", 74, Rarity.RARE, mage.cards.s.SublimeEpiphany.class));
        cards.add(new SetCardInfo("Sure Strike", 163, Rarity.COMMON, mage.cards.s.SureStrike.class));
        cards.add(new SetCardInfo("Swamp", 266, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swift Response", 40, Rarity.COMMON, mage.cards.s.SwiftResponse.class));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 251, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Tavern Swindler", 124, Rarity.UNCOMMON, mage.cards.t.TavernSwindler.class));
        cards.add(new SetCardInfo("Teferi's Ageless Insight", 76, Rarity.RARE, mage.cards.t.TeferisAgelessInsight.class));
        cards.add(new SetCardInfo("Teferi's Protege", 77, Rarity.COMMON, mage.cards.t.TeferisProtege.class));
        cards.add(new SetCardInfo("Teferi's Tutelage", 78, Rarity.UNCOMMON, mage.cards.t.TeferisTutelage.class));
        cards.add(new SetCardInfo("Teferi's Wavecaster", 327, Rarity.RARE, mage.cards.t.TeferisWavecaster.class));
        cards.add(new SetCardInfo("Teferi, Master of Time", 75, Rarity.MYTHIC, mage.cards.t.TeferiMasterOfTime.class));
        cards.add(new SetCardInfo("Tempered Veteran", 41, Rarity.UNCOMMON, mage.cards.t.TemperedVeteran.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 252, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 253, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Mystery", 254, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Silence", 255, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 256, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Thieves' Guild Enforcer", 125, Rarity.RARE, mage.cards.t.ThievesGuildEnforcer.class));
        cards.add(new SetCardInfo("Thornwood Falls", 257, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thrashing Brontodon", 209, Rarity.UNCOMMON, mage.cards.t.ThrashingBrontodon.class));
        cards.add(new SetCardInfo("Thrill of Possibility", 165, Rarity.COMMON, mage.cards.t.ThrillOfPossibility.class));
        cards.add(new SetCardInfo("Tide Skimmer", 79, Rarity.UNCOMMON, mage.cards.t.TideSkimmer.class));
        cards.add(new SetCardInfo("Titanic Growth", 210, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Tolarian Kraken", 80, Rarity.UNCOMMON, mage.cards.t.TolarianKraken.class));
        cards.add(new SetCardInfo("Tome Anima", 81, Rarity.COMMON, mage.cards.t.TomeAnima.class));
        cards.add(new SetCardInfo("Tormod's Crypt", 241, Rarity.UNCOMMON, mage.cards.t.TormodsCrypt.class));
        cards.add(new SetCardInfo("Track Down", 211, Rarity.COMMON, mage.cards.t.TrackDown.class));
        cards.add(new SetCardInfo("Traitorous Greed", 166, Rarity.UNCOMMON, mage.cards.t.TraitorousGreed.class));
        cards.add(new SetCardInfo("Tranquil Cove", 258, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Transmogrify", 167, Rarity.RARE, mage.cards.t.Transmogrify.class));
        cards.add(new SetCardInfo("Trufflesnout", 212, Rarity.COMMON, mage.cards.t.Trufflesnout.class));
        cards.add(new SetCardInfo("Turn to Slag", 168, Rarity.COMMON, mage.cards.t.TurnToSlag.class));
        cards.add(new SetCardInfo("Turret Ogre", 169, Rarity.COMMON, mage.cards.t.TurretOgre.class));
        cards.add(new SetCardInfo("Twinblade Assassins", 226, Rarity.UNCOMMON, mage.cards.t.TwinbladeAssassins.class));
        cards.add(new SetCardInfo("Ugin, the Spirit Dragon", 1, Rarity.MYTHIC, mage.cards.u.UginTheSpiritDragon.class));
        cards.add(new SetCardInfo("Unleash Fury", 170, Rarity.UNCOMMON, mage.cards.u.UnleashFury.class));
        cards.add(new SetCardInfo("Unsubstantiate", 82, Rarity.UNCOMMON, mage.cards.u.Unsubstantiate.class));
        cards.add(new SetCardInfo("Valorous Steed", 42, Rarity.COMMON, mage.cards.v.ValorousSteed.class));
        cards.add(new SetCardInfo("Village Rites", 126, Rarity.COMMON, mage.cards.v.VillageRites.class));
        cards.add(new SetCardInfo("Vito, Thorn of the Dusk Rose", 127, Rarity.RARE, mage.cards.v.VitoThornOfTheDuskRose.class));
        cards.add(new SetCardInfo("Vodalian Arcanist", 83, Rarity.COMMON, mage.cards.v.VodalianArcanist.class));
        cards.add(new SetCardInfo("Volcanic Geyser", 171, Rarity.UNCOMMON, mage.cards.v.VolcanicGeyser.class));
        cards.add(new SetCardInfo("Volcanic Salvo", 172, Rarity.RARE, mage.cards.v.VolcanicSalvo.class));
        cards.add(new SetCardInfo("Vryn Wingmare", 43, Rarity.UNCOMMON, mage.cards.v.VrynWingmare.class));
        cards.add(new SetCardInfo("Waker of Waves", 84, Rarity.UNCOMMON, mage.cards.w.WakerOfWaves.class));
        cards.add(new SetCardInfo("Walking Corpse", 128, Rarity.COMMON, mage.cards.w.WalkingCorpse.class));
        cards.add(new SetCardInfo("Wall of Runes", 85, Rarity.COMMON, mage.cards.w.WallOfRunes.class));
        cards.add(new SetCardInfo("Warded Battlements", 44, Rarity.COMMON, mage.cards.w.WardedBattlements.class));
        cards.add(new SetCardInfo("Warden of the Woods", 213, Rarity.UNCOMMON, mage.cards.w.WardenOfTheWoods.class));
        cards.add(new SetCardInfo("Watcher of the Spheres", 227, Rarity.UNCOMMON, mage.cards.w.WatcherOfTheSpheres.class));
        cards.add(new SetCardInfo("Wildwood Patrol", 339, Rarity.COMMON, mage.cards.w.WildwoodPatrol.class));
        cards.add(new SetCardInfo("Wildwood Scourge", 214, Rarity.UNCOMMON, mage.cards.w.WildwoodScourge.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 259, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Wishcoin Crab", 86, Rarity.COMMON, mage.cards.w.WishcoinCrab.class));
        cards.add(new SetCardInfo("Witch's Cauldron", 129, Rarity.UNCOMMON, mage.cards.w.WitchsCauldron.class));
    }
}
