/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.battlearmor;

import megamek.common.TechConstants;
import megamek.common.weapons.AdvancedSRMWeapon;
/**
 * @author Sebastian Brocks
 */
public class CLAdvancedSRM6 extends AdvancedSRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -6710415894545970512L;

    /**
     *
     */
    public CLAdvancedSRM6() {
        super();
        name = "Advanced SRM 6";
        setInternalName("CLAdvancedSRM6");
        addLookupName("Clan Advanced SRM-6");
        addLookupName("Clan Advanced SRM 6");
        rackSize = 6;
        shortRange = 4;
        mediumRange = 8;
        longRange = 12;
        extremeRange = 16;
        bv = 90;
        flags = flags.or(F_NO_FIRES).or(F_BA_WEAPON).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        tonnage = .21f;
        criticals = 4;
        cost = 90000;
        introDate = 3047;
        techLevel.put(3047, TechConstants.T_CLAN_EXPERIMENTAL);	
        techLevel.put(3056, TechConstants.T_CLAN_ADVANCED);	
        techLevel.put(3062, TechConstants.T_CLAN_TW);
        availRating = new int[] { RATING_X ,RATING_X ,RATING_F ,RATING_D};	
        techRating = RATING_F;
    }
}
